package Chapter05;

//入力ストリーム
import java.util.Scanner;

/*
 * クラス名:Exercise5‗02
 * 概要:float型変数とdouble型の変数に値を読み込み表示するプログラム
 * 作成者:M.Iizuka
 * 作成日:2024/10/10
 */
public class Exercise5_02 {

	/*
	 * 関数名:main
	 * 概要:float型変数とdouble型の変数に値を読み込み表示する
	 * 引数:なし
	 * 戻り値:なし 
	 * 作成者:M.Iizuka
	 * 作成日:2024/10/10
	 */
	public static void main(String[] args) {
		//入力値を抽出する
		Scanner standardInput = new Scanner(System.in);

		//変数の説明
		System.out.println("変数xはfloat型で、変数yはdouble型です。");
		//float型の入力を促す
		System.out.print("x : ");
		//入力値を読み込む
		float inputFloatNumber = standardInput.nextFloat();
		//double型の入力を促す
		System.out.print("y : ");
		//入力値を読み込む
		double inputDoubleNumber = standardInput.nextDouble();

		//float型の値を出力
		System.out.println("x = " + inputFloatNumber);
		//double型の値を出力
		System.out.println("y = " + inputDoubleNumber);

	}

}
