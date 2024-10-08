package Chapter04;

//入力ストリーム
import java.util.Scanner;

/*
 * クラス名:Exercise4_03
 * 概要:二つの整数値の小さいほう以上大きいほう以下の全整数を昇順に出力するプログラム
 * 作成者:M.Iizuka
 * 作成日:2024/10/08
 */
public class Exercise4_03 {

	/*
	 * 関数名:main
	 * 概要:二つの整数値の小さいほう以上大きいほう以下の全整数を昇順に出力する
	 * 引数:なし
	 * 戻り値:なし
	 * 作成者:M.Iizuka
	 * 作成日:2024/10/08
	 */
	public static void main(String[] args) {
		//入力された数値を抽出する
		Scanner standardInput = new Scanner(System.in);

		//一つ目の整数値の入力を促す
		System.out.print("整数Ａ：");
		//入力された一つ目の整数値
		int firstInt = standardInput.nextInt();
		//二つ目の整数値の入力を促す
		System.out.print("整数Ｂ：");
		//入力された一つ目の整数値
		int secondeInt = standardInput.nextInt();

		//大きいほうの値
		int maxInt = firstInt > secondeInt ? firstInt : secondeInt;
		//小さいほうの値
		int minimumInt = firstInt < secondeInt ? firstInt : secondeInt;
		//出力する値
		int outputInt = minimumInt;

		//小さいほう以上大きいほう以下の整数を出力
		do {
			//範囲内の整数値を出力する
			System.out.print(outputInt+" ");
			//一つ大きい整数値にするための変数
			int plusInt = 1;
			//次に大きい整数値
			outputInt = outputInt + plusInt;

		//最大値が出力されるまで続ける
		} while (outputInt <= maxInt);
	}

}
