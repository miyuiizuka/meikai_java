package Chapter02;

//キーボードからの入力
import java.util.Scanner;

/*
 * クラス名:Exercise2_3
 * 概要:キーボードから読み込んだ整数値をそのまま反復して表示するプログラム
 * 作成者:M.Iizuka
 * 作成日:2024/10/01
 */
public class Exercise2_3 {

	/*
	 * 関数名:main
	 * 概要:キーボードから読み込んだ整数値をそのまま反復して表示する
	 * 引数:なし
	 * 戻り値:なし
	 * 作成者:M.Iizuka
	 * 作成日:2024/10/01
	 */
	public static void main(String[] args) {
		//キーボードから読み込んだ値を抽出する変数を宣言
		Scanner standardInput = new Scanner(System.in);
		
		//整数値をキーボードから入力してもらう
		System.out.print("整数値：");
		
		//キーボードから抽出した値を読み込む
		int inputInt = standardInput.nextInt();
		
		//読み込んだ値をそのまま表示する
		System.out.println( inputInt + "と入力しましたね。");
	}
	

}
