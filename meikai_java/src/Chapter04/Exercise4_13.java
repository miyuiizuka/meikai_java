package Chapter04;

//入力ストリーム
import java.util.Scanner;

/*
 * クラス名:Exercise4_13
 * 概要:1から入力された整数値までの和を求めるプログラム（for文）
 * 作成者:M.Iizuka
 * 作成日:2024/10/08
 */
public class Exercise4_13 {

	/*
	 * 関数名:main
	 * 概要:1から入力された整数値までの和を求める
	 * 引数:なし
	 * 戻り値:なし
	 * 作成者:M.Iizuka
	 * 作成日:2024/10/08
	 */
	public static void main(String[] args) {
		//入力された値を抽出する
		Scanner standardInput = new Scanner(System.in);

		//入力可能な数値の基準値を設定する
		final int INPUT_MINIMUM_NUMBER = 1;
		//入力された値
		int inputNumber = 0;

		//正しい数値が入力してもらう
		do {
			//整数値の入力を促す
			System.out.print("正の整数値：");
			//入力された値を読み込む
			inputNumber = standardInput.nextInt();
			//不正な値が入力された場合
			if (inputNumber <= INPUT_MINIMUM_NUMBER) {
				//正しい数値を入力するよう促す
				System.out.println("正の整数値を入力してください。");
			}
			//正しい数値が入力されるまで繰り返す
		} while (inputNumber < INPUT_MINIMUM_NUMBER);

		//合計
		int sumNumber = 0;

		//入力された整数値まで繰り返す
		for (int indexNumber = INPUT_MINIMUM_NUMBER; indexNumber <= inputNumber; indexNumber++) {
			//和を計算する
			sumNumber += indexNumber;
		}
		//計算結果を出力する
		System.out.println("1から" + inputNumber + "までの和は" + sumNumber + "です。");
	}

}
