package Chapter07;

//入力ストリーム
import java.util.Scanner;

/*
 * クラス名:Exercise7_04
 * 概要:1から読み込んだ値までの全整数の和を求めて表示するプログラム
 * 作成者:M.Iizuka
 * 作成日:2024/10/17
 */
public class Exercise7_04 {

	/*
	 * 関数名:sumUp
	 * 概要:1から読み込んだ値までの全整数の和を求める
	 * 引数:入力された整数値
	 * 戻り値:1から読み込んだ値までの全整数の和
	 * 作成者:M.Iizuka
	 * 作成日:2024/10/17
	 */
	public static int sumUp(int inputNumber) {
		//整数値の和
		int sumNumber = 1;
		//入力された整数値が正の場合
		if (inputNumber > 0) {
			//その数値までの和を求める
			for (int integerIndex = 0; integerIndex < inputNumber; integerIndex++) {
				//現在の和を算出
				sumNumber += integerIndex;
			}
			//入力された整数値が0以下の場合
		} else {
			//その数値までの和を求める
			for (int integerIndex = 0; integerIndex <= -inputNumber; integerIndex++) {
				//現在の和を算出
				sumNumber -= integerIndex;
			}
		}
		//和を返却する
		return sumNumber;
	}

	/*
	 * 関数名:main
	 * 概要:1から読み込んだ値までの全整数の和を表示する
	 * 引数:なし
	 * 戻り値:なし
	 * 作成者:M.Iizuka
	 * 作成日:2024/10/17
	 */
	public static void main(String[] args) {
		//入力値を抽出する
		Scanner standardInput = new Scanner(System.in);

		//どの数値までの和を求めたいか入力を促す
		System.out.print("1からnまでの全整数の和を求めます。\n整数n：");
		//入力値を読み込む
		int inputNumber = standardInput.nextInt();
		//和を表示する
		System.out.println("和:" + sumUp(inputNumber));

	}

}
