package Chapter05;

//入力ストリーム
import java.util.Scanner;

/*
 * クラス名:Exercise5_05
 * 概要:三つの整数値を読み込み、その合計と平均を表示するプログラム
 * 平均はキャスト演算子を利用して求め、実数として表示する
 * 作成者:M.Iizuka
 * 作成日:2024/10/11
 */
public class Exercise5_05 {

	/*
	 * 関数名:main
	 * 概要:三つの整数値を読み込み、その合計と平均を表示するプログラム
	 * 平均はキャスト演算子を利用して求め、実数として表示する
	 * 引数:なし
	 * 戻り値:なし
	 * 作成者:M.Iizuka
	 * 作成日:2024/10/11
	 */
	public static void main(String[] args) {
		//入力値を抽出する
		Scanner standardInput = new Scanner(System.in);

		//入力する個数を設定
		int countInteger = 3;

		//一つ目の整数値の入力を促す
		System.out.print("整数ａ：");
		//一つ目の入力値を読み込む
		int firstInteger = standardInput.nextInt();
		//二つ目の整数値の入力を促す
		System.out.print("整数ｂ：");
		//二つ目の入力値を読み込む
		int secondInteger = standardInput.nextInt();
		//三つ目の整数値の入力を促す
		System.out.print("整数ｃ：");
		//三つ目の入力値を読み込む
		int thirdInteger = standardInput.nextInt();

		//合計を算出
		int sumInteger = firstInteger + secondInteger + thirdInteger;
		//平均を算出
		double averageInteger = (double)sumInteger / countInteger;

		//合計を出力
		System.out.println("合計は" + sumInteger + "です。");
		//平均を出力
		System.out.println("平均は" + averageInteger + "です。");

	}

}
