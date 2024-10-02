package Chapter02;

//入力ストリーム
import java.util.Scanner;

/*
 * クラス名:Exercise2_4
 * 概要:キーボードから読み込んだ整数値に10を加算・減算した値を出力するプログラム
 * 作成者:M.Iizuka
 * 作成日:2024/10/01
 */
public class Exercise2_4 {

	/*
	 * 関数名:main
	 * 概要:キーボードから読み込んだ整数値に10を加算・減算した値を出力する
	 * 引数:なし
	 * 戻り値:なし
	 * 作成者:M.Iizuka
	 * 作成日:2024/10/01
	 */
	public static void main(String[] args) {
		
		//キーボードから読み込んだ値を抽出するための変数を宣言
		Scanner standardInput = new Scanner(System.in);
		
		//inputIntの値の入力を促す
		System.out.print("整数値：");
		//inputIntに整数値を読み込む
		int inputInt = standardInput.nextInt();
		
		//加算・減算する値を変数に代入
		int CALCULATE_INT = 10;
		
		//キーボードから読み込んだ整数値に10を加算した値を出力する
		System.out.println( CALCULATE_INT + "を加えた値は" + ( inputInt + CALCULATE_INT ) + "です。");
		//キーボードから読み込んだ整数値に10を減算した値を出力する
		System.out.println( CALCULATE_INT + "を減じた値は" + ( inputInt - CALCULATE_INT ) + "です。");
		
	}

}
