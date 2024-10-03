package Chapter03;

//入力ストリーム
import java.util.Scanner;

/*
 * クラス名:Exercise3_9
 * 概要:二つの実数値を読み込み、大きいほうの値を出力するプログラム
 * 作成者:M.Iizuka
 * 作成日:2024/10/03
 */
public class Exercise3_9 {

	/*
	 * 関数名:main
	 * 概要:二つの実数値を読み込み、大きいほうの値を出力する
	 * 引数:なし
	 * 戻り値:なし
	 * 作成者:M.Iizuka
	 * 作成日:2024/10/03
	 */
	public static void main(String[] args) {
		
		//キーボードから読み込んだ値を抽出する
		Scanner standardInput = new Scanner(System.in);
		//一つ目の実数値の入力を促す
		System.out.print("実数値ａ：");
		//入力された値を変数に格納する
		double firstNumber = standardInput.nextDouble();
		//二つ目の実数値の入力を促す
		System.out.print("実数値ｂ：");
		//入力された値を変数に格納する
		double secondNumber = standardInput.nextDouble();
		
		//大きいほうの値を求める
		double largeNumber = firstNumber > secondNumber ? firstNumber : secondNumber;
		//結果を出力する
		System.out.println("大きいほうの値は" + largeNumber + "です。");
	}

}
