package Chapter03;

//入力ストリーム
import java.util.Scanner;

/*
 * クラス名:Exercise3_1
 * 概要:整数値を読み込んで、その絶対値を求めて表示するプログラム
 * 作成者:M.Iizuka
 * 作成日:2024/10/03
 */
public class Exercise3_1 {

	/*
	 * 関数名:main
	 * 概要:整数値を読み込んで、その絶対値を求めて表示する
	 * 引数:なし
	 * 戻り値:なし
	 * 作成者:M.Iizuka
	 * 作成日:2024/10/03
	 */
	public static void main(String[] args) {
		
		//キーボードから読み込んだ値を抽出する
		Scanner standardInput = new Scanner(System.in);
		
		//整数値の入力を促す
		System.out.print("整数値：");
		//整数値を読み込む
		int inputNumber = standardInput.nextInt();
		
		//整数値の正負または0を判別する
		if (inputNumber >= 0) {
			//正または0の場合の結果を出力する
			System.out.println("その絶対値は" + inputNumber + "です。");
		//負の場合
		} else {
			//符号を反転させて結果を出力する
			System.out.println("その絶対値は" + (-inputNumber) + "です。");
			
		}
	}

}