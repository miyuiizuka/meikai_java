package Chapter03;

//入力ストリーム
import java.util.Scanner;

/*
 * クラス名:Exercise3_14
 * 概要:二つの整数値の大小それぞれの値もしくは等しい旨を表示するプログラム
 * 作成者:M.Iizuka
 * 作成日:2024/10/07
 */
public class Exercise3_14 {

	/*
	 * 関数名:main
	 * 概要:二つの整数値の大小それぞれの値もしくは等しい旨を表示する
	 * 引数:なし
	 * 戻り値:なし
	 * 作成者:M.Iizuka
	 * 作成日:2024/10/07
	 */
	public static void main(String[] args) {

		//入力された値を抽出する
		Scanner standardInput = new Scanner(System.in);

		//一つ目の整数値の入力を促す
		System.out.print("整数ａ：");
		//入力された数値を変数に格納する
		int firstInt = standardInput.nextInt();
		//二つ目の整数値の入力を促す
		System.out.print("整数ｂ：");
		//入力された数値を変数に格納する
		int secondInt = standardInput.nextInt();

		//小さいほうの値を初期化
		int minimumInt = 0;
		//大きいほうの値を初期化
		int maxInt = 0;

		//二つの数値が等しい場合
		if (firstInt == secondInt) {
			//等しい値であることを表示する
			System.out.println("二つの値は同じです。");
		//二つ目のほうが大きい場合
		}else if (firstInt < secondInt) {
			//小さいほうに一つ目を代入する
			minimumInt = firstInt;
			//大きいほうに二つ目を代入する
			maxInt = secondInt;
			//小さいほうの値を出力する
			System.out.println("小さいほうの値は" + minimumInt + "です。");
			//大きいほうの値を出力する
			System.out.println("大きいほうの値は" + maxInt + "です。");
		//一つ目のほうが大きい場合
		} else {
			//小さいほうに二つ目を代入する
			minimumInt = secondInt;
			//大きいほうに一つ目を代入する
			maxInt = firstInt;
			//小さいほうの値を出力する
			System.out.println("小さいほうの値は" + minimumInt + "です。");
			//大きいほうの値を出力する
			System.out.println("大きいほうの値は" + maxInt + "です。");
			
		}

	}

}
