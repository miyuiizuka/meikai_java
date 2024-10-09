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

		//身長の最小値
		int minimumHeight = 0;
		//身長の最小値の入力可能な基準値を設定する
		final int MINIMUM_STANDARD = 40;
		//身長の最大値
		int maxHeight = 0;
		//身長の幅
		int rangeHeight = 0;
		//身長の幅の入力可能な基準値を設定する
		final int RANGE_STANDARD = 1;

		//身長の最小値を正しい数値で入力してもらう
		do {
			//入力を促す
			System.out.print("何cmから：");
			//入力値を読み込む
			minimumHeight = standardInput.nextInt();
			//不正な値が入力された場合
			if (minimumHeight < MINIMUM_STANDARD) {
				//正しい数値を入力するよう促す
				System.out.println(MINIMUM_STANDARD + "cm以上の整数値で入力してください。");
			}
		} while (minimumHeight < MINIMUM_STANDARD);

		//身長の最大値を正しい数値で入力してもらう
		do {
			//入力を促す
			System.out.print("何cmまで：");
			//入力値を読み込む
			maxHeight = standardInput.nextInt();
			//不正な値が入力された場合
			if (maxHeight < minimumHeight) {
				//正しい数値を入力するよう促す
				System.out.println(minimumHeight + "cm以上の整数値で入力してください。");
			}
		} while (maxHeight < minimumHeight);

		//身長の幅を正しい数値で入力してもらう
		do {
			//入力を促す
			System.out.print("何cmごと：");
			//入力値を読み込む
			rangeHeight = standardInput.nextInt();
			//不正な値が入力された場合
			if (rangeHeight < RANGE_STANDARD) {
				//正しい数値を入力するよう促す
				System.out.println(RANGE_STANDARD + "cm以上の整数値で入力してください。");
			}
			//正しい数値が入力されるまで繰り返す
		} while (rangeHeight < RANGE_STANDARD);

		//表の項目を表示する
		System.out.println("身長" + "  " + "標準体重");

		//指定した範囲の身長と標準体重を表示する
		for (int indexHeight = minimumHeight; indexHeight <= maxHeight; indexHeight += rangeHeight) {
			//標準体重を計算する（標準体重(身長-100×0.9)）
			double standardWeight = (indexHeight - 100) * 0.9;
			//身長と算出した体重を表示する
			System.out.println(indexHeight + "   " + standardWeight);
		}
	}

}
