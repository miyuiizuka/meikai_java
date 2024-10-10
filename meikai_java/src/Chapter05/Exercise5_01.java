package Chapter05;

//入力ストリーム
import java.util.Scanner;

/*
 * クラス名:Exercise5_01
 * 概要:10進整数を読み込み、その値を8進数と16進数で表示するプログラム
 * 作成者:M.Iizuka
 * 作成日:2024/10/10
 */
public class Exercise5_01 {

	/*
	 * 関数名:main
	 * 概要:10進整数を読み込み、その値を8進数と16進数で表示する
	 * 引数:なし
	 * 戻り値:なし
	 * 作成者:M.Iizuka
	 * 作成日:2024/10/10
	 */
	public static void main(String[] args) {
		//入力値を抽出する
		Scanner standardInput = new Scanner(System.in);

		//10進整数の入力を促す
		System.out.print("整数：");
		//入力値を読み込む
		int decimalNumber = standardInput.nextInt();

		//8進数で表示
		System.out.printf("８進数では%oです。\n", decimalNumber);
		//16進数で表示
		System.out.printf("16進数では%xです。\n", decimalNumber);
	}

}
