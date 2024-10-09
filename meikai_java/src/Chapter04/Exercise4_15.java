package Chapter04;

//入力ストリーム
import java.util.Scanner;;

/*
 * クラス名:Exercise4_15
 * 概要:身長と標準体重の対応表を表示するプログラム
 * 作成者:M.Iizuka
 * 作成日:024/10/09
 */
public class Exercise4_15 {

	/*
	 * 関数名:main
	 * 概要:身長と標準体重の対応表を表示する
	 * 引数:なし
	 * 戻り値:なし
	 * 作成者:M.Iizuka
	 * 作成日:2024/10/09
	 */
	public static void main(String[] args) {
		//入力された数値を抽出する
		Scanner standardInput = new Scanner(System.in);

		//入力される身長の最小値
		int inputMinimumHeight = 0;
		//入力される身長の最大値
		int inputMaxHeight = 0;
		//身長の幅
		int inputRangeHeight = 0;

		//入力可能とする身長の下限値
		final int MINIMUM_HEGHT = 100;
		//入力可能とする身長の最大値
		final int MAX_HEIGHT = 250;
		//入力可能な身長の幅
		final int RANGE_HEIGHT = 1;

		//身長の最小値を正しい数値で入力してもらう
		do {
			//入力を促す
			System.out.print("何cmから：");
			//入力値を読み込む
			inputMinimumHeight = standardInput.nextInt();
			//不正な値が入力された場合
			if (inputMinimumHeight < MINIMUM_HEGHT || inputMinimumHeight > MAX_HEIGHT) {
				//正しい数値を入力するよう促す
				System.out.println(MINIMUM_HEGHT + "cm以上" + MAX_HEIGHT + "cm以下の整数値を入力してください。");
			}
			//正しい数値が入力されるまで繰り返す
		} while (inputMinimumHeight < MINIMUM_HEGHT || inputMinimumHeight > MAX_HEIGHT);

		//身長の最大値を正しい数値で入力してもらう
		do {
			//入力を促す
			System.out.print("何cmまで：");
			//入力値を読み込む
			inputMaxHeight = standardInput.nextInt();
			//不正な値が入力された場合
			if (inputMaxHeight < inputMinimumHeight || inputMaxHeight > MAX_HEIGHT) {
				//正しい数値を入力するよう促す
				System.out.println(inputMinimumHeight + "cm以上" + MAX_HEIGHT + "cm以下の整数値を入力してください。");
			}
			//正しい数値が入力されるまで繰り返す
		} while (inputMaxHeight < inputMinimumHeight || inputMaxHeight > MAX_HEIGHT);

		//身長の幅を正しい数値で入力してもらう
		do {
			//入力を促す
			System.out.print("何cmごと：");
			//入力値を読み込む
			inputRangeHeight = standardInput.nextInt();
			//不正な値が入力された場合
			if (inputRangeHeight < RANGE_HEIGHT) {
				//正しい数値を入力するよう促す
				System.out.println(RANGE_HEIGHT + "cm以上の整数値で入力してください。");
			}
			//正しい数値が入力されるまで繰り返す
		} while (inputRangeHeight < RANGE_HEIGHT);

		//表の項目を表示する
		System.out.println("身長" + "  " + "標準体重");

		//指定した範囲の身長と標準体重を表示する
		for (int indexHeight = inputMinimumHeight; indexHeight <= inputMaxHeight; indexHeight += inputRangeHeight) {
			//標準体重を計算する（標準体重(身長-100×0.9)）
			double standardWeight = (indexHeight - 100) * 0.9;
			//身長と算出した体重を表示する
			System.out.println(indexHeight + "   " + standardWeight);
		}
	}

}
