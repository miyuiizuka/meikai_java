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

		//入力可能な数値の基準値を設定する
		final int INPUT_MINIMUM = 0;
		//身長の最小値
		int minimumHeight = 0;
		//身長の最大値
		int maxHeight = 0;
		//身長の幅
		int rangeHeight = 0;

		//各項目を正しい数値で入力してもらう
		do {
			//身長の最小値の入力を促す
			System.out.print("何cmから：");
			//最小値を読み込む
			minimumHeight = standardInput.nextInt();
			//身長の最大値の入力を促す
			System.out.print("何cmまで：");
			//最大値を読み込む
			maxHeight = standardInput.nextInt();
			//身長の幅の入力を促す
			System.out.print("何cmごと：");
			//幅を読み込む
			rangeHeight = standardInput.nextInt();

			//不正な値が入力されていた場合
			if (minimumHeight <= INPUT_MINIMUM || maxHeight <= INPUT_MINIMUM || rangeHeight <= INPUT_MINIMUM) {
				//正しい数値を入力するよう促す
				System.out.println("正の整数値で入力してください。");
			}
			//正しい数値が入力されるまで繰り返す
		} while (minimumHeight <= INPUT_MINIMUM || maxHeight <= INPUT_MINIMUM || rangeHeight <= INPUT_MINIMUM);

		//表の項目を表示する
		System.out.println("身長" + "  " + "体重");

		//指定した範囲の身長と標準体重を表示する
		for (int indexHeight = minimumHeight; indexHeight <= maxHeight; indexHeight += rangeHeight) {
			//標準体重を計算する（標準体重(身長-100×0.9)）
			double standardWeight = (indexHeight - 100) * 0.9;
			//身長と算出した体重を表示する
			System.out.println(indexHeight + "   " + standardWeight);
		}
	}

}
