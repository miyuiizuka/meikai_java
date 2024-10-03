package Chapter03;

//入力ストリーム
import java.util.Scanner;

/*
 * クラス名:Exercise3_12
 * 概要:キーボードから読み込んだ三つの整数値の最小値を求めて表示するプログラム
 * 作成者:M.Iizuka
 * 作成日:2024/10/03
 */
public class Exercise3_12 {

	/*
	 * 関数名:main
	 * 概要:キーボードから読み込んだ三つの整数値の最小値を求めて表示する
	 * 引数:なし
	 * 戻り値:なし
	 * 作成者:M.Iizuka
	 * 作成日:2024/10.03
	 */
	public static void main(String[] args) {

		//キーボードから読み込んだ値を抽出する
		Scanner standardInput = new Scanner(System.in);

		//一つ目の整数値の入力を促す
		System.out.print("整数ａ：");
		//入力された値を変数に格納する
		int firstInt = standardInput.nextInt();
		//二つ目の整数値の入力を促す
		System.out.print("整数ｂ：");
		//入力された値を変数に格納する
		int secondInt = standardInput.nextInt();
		//三つ目の整数値の入力を促す
		System.out.print("整数ｃ：");
		//入力された値を変数に格納する
		int thirdInt = standardInput.nextInt();

		//最小値の初期値を設定する
		int minimumInt = firstInt;
		//最小値と二つ目の値を比較する
		minimumInt = minimumInt < secondInt ? minimumInt : secondInt;
		//最小値と三つ目の値を比較する
		minimumInt = minimumInt < thirdInt ? minimumInt : thirdInt;

		//最小値を表示する
		System.out.println("最小値は" + minimumInt + "です。");

	}

}
