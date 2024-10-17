package Chapter07;

//入力ストリーム
import java.util.Scanner;

/*
 * クラス名:Exercise7_02
 * 概要:読み込んだ三つの整数の最小値を表示するプログラム
 * 作成者:M.Iizuka
 * 作成日:2024/10/17
 */
public class Exercise7_02 {

	/*
	 * 関数名:min
	 * 概要:読み込んだ三つの整数の最小値を求める
	 * 引数:入力された整数値
	 * 戻り値:最小値
	 * 作成者:M.Iizuka
	 * 作成日:2024/10/17
	 */
	public static int min(int firstNumber, int secondNumber, int thirdNumber) {
		//最小値の変数
		int minimumNumber = firstNumber;
		//現在の最小値より二つ目が小さい場合
		if (secondNumber < minimumNumber) {
			//二つ目を最小値にする
			minimumNumber = secondNumber;
		}
		//現在の最小値より三つ目が小さい場合
		if (thirdNumber < minimumNumber) {
			//三つ目を最小値にする
			minimumNumber = thirdNumber;
		}
		//最小値を返却
		return minimumNumber;
	}

	/*
	 * 関数名:main
	 * 概要:読み込んだ三つの整数の最小値を表示する
	 * 引数:なし
	 * 戻り値:なし
	 * 作成者:M.Iizuka
	 * 作成日:2024/10/17
	 */
	public static void main(String[] args) {
		//入力値を抽出する
		Scanner standardInput = new Scanner(System.in);
		//一つ目の整数の入力を促す
		System.out.print("整数a：");
		//一つ目の入力値を読み込む
		int firstNumber = standardInput.nextInt();
		//二つ目の整数の入力を促す
		System.out.print("整数b：");
		//二つ目の入力値を読み込む
		int secondNumber = standardInput.nextInt();
		//三つ目の整数の入力を促す
		System.out.print("整数c：");
		//三つ目の入力値を読み込む
		int thirdNumber = standardInput.nextInt();

		//最小値を表示する
		System.out.println("最小値は" + min(firstNumber, secondNumber, thirdNumber) + "です。");

	}

}
