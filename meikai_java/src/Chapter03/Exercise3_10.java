package Chapter03;

//入力ストリーム
import java.util.Scanner;

/*
 * クラス名:Exercise3_10
 * 概要:二つの整数値を読み込み、それらの値の差を表示するプログラム
 * 作成者:M.Iizuka
 * 作成日:2024/10/03
 */
public class Exercise3_10 {

	/*
	 * 関数名:main
	 * 概要:二つの整数値を読み込み、それらの値の差を表示する
	 * 引数:なし
	 * 戻り値:なし
	 * 作成者:M.Iizuka
	 * 作成日:2024/10/03
	 */
	public static void main(String[] args) {

		//キーボードから読み込んだ値を抽出する
		Scanner standardInput = new Scanner(System.in);
		
		//一つ目の整数値の入力を促す
		System.out.print("整数値ａ：");
		//入力された値を変数に格納する
		int firstNumber = standardInput.nextInt();
		//二つ目の整数値の入力を促す
		System.out.print("整数値ｂ：");
		//入力された値を変数に格納する
		int secondNumber = standardInput.nextInt();

		//二つの値の差を求める
		int differenceInt = firstNumber - secondNumber;
		//差の絶対値を求める
		int absoluteDifferenceInt = differenceInt < 0 ? -differenceInt : differenceInt;
		//差を出力する
		System.out.println("二つの値の差は" +  absoluteDifferenceInt + "です。");
		
	}

}
