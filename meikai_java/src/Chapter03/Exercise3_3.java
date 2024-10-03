package Chapter03;

//入力ストリーム
import java.util.Scanner;

/*
 * クラス名:Exercise3_3
 * 概要:キーボードから読み込んだ整数値の符号を判定して表示するプログラム
 * 作成者:M.Iizuka
 * 作成日:2024/10/03
 */
public class Exercise3_3 {

	/*
	 * 関数名:main
	 * 概要:キーボードから読み込んだ整数値の符号を判定して表示する
	 * 引数:なし
	 * 戻り値:なし
	 * 作成者:M.Iizuka
	 * 作成日:2024/10/03
	 */
	public static void main(String[] args) {
		
		//キーボードから読み込んだ整数値を抽出する
		Scanner standardInput = new Scanner(System.in);
		
		//整数値の入力を促す
		System.out.print("整数値：");
		//入力された値を変数に格納する
		int n = standardInput.nextInt();
		
		//整数値の符号を判定する
		if ( n > 0) {
			//正の場合の結果を出力する
			System.out.println("その値は正です。");
		
		//負の場合
		} else if ( n < 0) {
			//結果を出力する
			System.out.println("その値は負です。");
		
		//0の場合
		} else if ( n == 0) {
			//結果を出力する
			System.out.println("その値は０です。");
		}
	}
}
