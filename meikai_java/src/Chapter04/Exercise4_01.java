package Chapter04;

//入力ストリーム
import java.util.Scanner;

/*
 * クラス名:Exercise4_01
 * 概要:読み込んだ整数値の符号を判定する処理を何度でも繰り返すことができるプログラム
 * 作成者:M.Iizuka
 * 作成日:2024/10/07
 */
public class Exercise4_01 {

	/*
	 * 関数名:main
	 * 概要:読み込んだ整数値の符号を判定する処理を何度でも繰り返すことができる
	 * 引数:なし
	 * 戻り値:なし
	 * 作成者:M.Iizuka
	 * 作成日:2024/10/07
	 */
	public static void main(String[] args) {
		//入力された値を抽出する
		Scanner standardInput = new Scanner(System.in);
		//もう一度行うか
		int retryNumber = 1;

		//1以外が選択されるまで処理を繰り返す
		do {
			//整数値の入力を促す
			System.out.print("整数値：");
			//入力された値を変数に格納する
			int inputNumber = standardInput.nextInt();

			//正かどうか
			if (inputNumber > 0) {
				//正である場合
				System.out.println("その値は正です。");
				//負かどうか
			} else if (inputNumber < 0) {
				//負である場合
				System.out.println("その値は負です。");
				//正でも負でもない場合
			} else {
				//0である場合
				System.out.println("その値は0です。");
			}
			//もう一度実行するか入力を促す
			System.out.print("もう一度？　1…Yes／0…No：");
			//入力された番号を読み込む
			retryNumber = standardInput.nextInt();
			//再実行するか決定する
		} while (retryNumber == 1);

	}

}
