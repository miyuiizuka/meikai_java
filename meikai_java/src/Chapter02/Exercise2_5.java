package Chapter02;

//入力ストリーム
import java.util.Scanner;

/*
 * クラス名:Exercise2_5
 * 概要:2つの実数値を読み込み、その和と平均を求めて表示するプログラム
 * 作成者:M.Iizuka
 * 作成日:2024/10/02
 */
public class Exercise2_5 {

	/*
	 * 関数名:main
	 * 概要:2つの実数値を読み込み、その和と平均を求めて表示する
	 * 引数:なし
	 * 戻り値:なし
	 * 作成者:M.Iizuka
	 * 作成日:2024/10/02
	 */
	public static void main(String[] args) {
		
		//キーボードから読み込んだ値を抽出するための変数を宣言
		Scanner standardInput = new Scanner(System.in);
		
		//xの値の入力を促す
		System.out.print("xの値：");
		//xに実数値を読み込む
		double x = standardInput.nextDouble();

		//yの値の入力を促す
		System.out.print("yの値：");
		//yに実数値を読み込む
		double y = standardInput.nextDouble();
		
		//変数の合計数を代入する
		int sumNumber = 2;
		
		//xとyの合計を算出し出力する
		System.out.println("合計は" + (x + y) + "です。");
		//xとyの平均を算出し出力する
		System.out.println("平均は" + (x + y) / sumNumber7. + "です。");

	}

}
