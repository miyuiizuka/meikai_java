package Chapter03;

//入力ストリーム
import java.util.Scanner;

/*
 * クラス名:Exercise3_13
 * 概要:キーボードから読み込んだ三つの整数値の中央値を求めて表示するプログラム
 * 作成者:M.Iizuka
 * 作成日:2024/10/07
 */
public class Exercise3_13 {

	/*
	 * 関数名:main
	 * 概要:キーボードから読み込んだ三つの整数値の中央値を求めて表示する
	 * 引数:なし
	 * 戻り値:なし
	 * 作成者:M.Iizuka
	 * 作成日:2024/10/07
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

		//中央値の初期値を設定する
		int medianInt = firstInt;

		//二つ目の値が一つ目の値より大きい場合
		if (firstInt < secondInt) {
			//三つ目の値が二つ目の値より大きい場合
			if (secondInt < thirdInt) {
				//中央値を二つ目の値とする
				medianInt = secondInt;
			//三つ目の値が一つ目の値より大きい場合
			} else if (firstInt < thirdInt) {
				//中央値を三つ目の値とする
				medianInt = thirdInt;
			//一つ目の値が三つ目の値より大きい場合
			} else {
				//中央値を一つ目の値とする
				medianInt = firstInt;

			}
		//一つ目の値が、二つ目の値より大きく、三つ目の値より小さい場合
		} else if (firstInt < thirdInt) {
			//中央値を一つ目の値とする
			medianInt = firstInt;
		//三つ目の値が二つ目の値より大きい場合
		} else if (secondInt < thirdInt) {
			//中央値を三つ目の値とする
			medianInt = thirdInt;
		//二つ目の値が三つ目の値より大きい場合
		} else {
			//中央値を二つ目の値とする
			medianInt = secondInt;
		}

		//中央値を出力する
		System.out.println("中央値は" + medianInt + "です。");
	}

}
