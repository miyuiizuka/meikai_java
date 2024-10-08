package Chapter04;

import java.util.Scanner;

/*
 * クラス名:Exercise4_12
 * 概要:0から正の整数値までカウントアップするプログラム
 * 作成者:M.Iizuka
 * 作成日:2024/10/08
 */
public class Exercise4_12 {

	/*
	 * 関数名:main
	 * 概要:0から正の整数値までカウントアップする
	 * 引数:なし
	 * 戻り値:なし
	 * 作成者:M.Iizuka
	 * 作成日:2024/10/08
	 */
	public static void main(String[] args) {
		//入力された値を抽出する
		Scanner standardInput = new Scanner(System.in);

		//行う処理を表示
		System.out.println("カウントアップします。");
		//入力可能な数値の基準値を設定する
		final int INPUT_MINIMUM_NUMBER = 0;
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
		} while (inputNumber <= INPUT_MINIMUM_NUMBER);

		//カウントアップの処理を行う
		for (int indexNumber = INPUT_MINIMUM_NUMBER; inputNumber >= indexNumber; indexNumber++) {
			//カウントアップの数値を表示する
			System.out.println(indexNumber);
		}

	}

}
