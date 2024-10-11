package Chapter05;

//入力ストリーム
import java.util.Scanner;

/*
 * クラス名:Exercise5_03
 * 概要:論理型の変数にtrueやfalseを代入して、その値を表示するプログラム
 * 作成者:M.Iizuka
 * 作成日:2024/10/10
 */
public class Exercise5_03 {
	/*
	 * 関数名:main
	 * 概要:論理型の変数にtrueやfalseを代入して、その値を表示する
	 * 引数:なし
	 * 戻り値:なし 
	 * 作成者:M.Iizuka
	 * 作成日:2024/10/10
	 */
	public static void main(String[] args) {
		//入力値を抽出する
		Scanner standardInput = new Scanner(System.in);

		//処理内容を表示
		System.out.println("整数ａはが整数ｂより大きいか判定します。");
		//結果内容の説明を表示
		System.out.println("大きければtrueを、そうでなければfalseを表示します。");
		//一つ目の整数値の入力を促す
		System.out.print("整数ａ：");
		//入力値を読み込む
		int firstNumber = standardInput.nextInt();
		//二つ目の整数値の入力を促す
		System.out.print("整数ｂ：");
		//入力値を読み込む
		int secondNumber = standardInput.nextInt();

		//正しい
		boolean judgeBigNumber = true;
		//正しくない
		boolean judgeNotBigNumber = false;

		if (firstNumber > secondNumber == judgeBigNumber) {
			System.out.println(judgeBigNumber);
		} else {
			System.out.println(judgeNotBigNumber);
		}

	}

}
