package Chapter03;

//入力ストリーム
import java.util.Scanner;

/*
 * クラス名:Exercise3_16
 * 概要:整数値を読み込んで昇順にソートするプログラム
 * 作成者:M.Iizuka
 * 作成日:2024/10/07
 */
public class Exercise3_16 {

	/*
	 * 関数名:main
	 * 概要:整数値を読み込んで昇順にソートする
	 * 引数:なし
	 * 戻り値:なし
	 * 作成者:M.Iizuka
	 * 作成日:2024/10/07
	 */
	public static void main(String[] args) {

		//入力された値を抽出する
		Scanner standardInput = new Scanner(System.in);

		//一つ目の値の入力を促す
		System.out.print("整数ａ：");
		//入力された値を変数に格納する
		int firstInt = standardInput.nextInt();
		//二つ目の値の入力を促す
		System.out.print("整数ｂ：");
		//入力された値を変数に格納する
		int secondInt = standardInput.nextInt();
		//一つ目の値の入力を促す
		System.out.print("整数ｃ：");
		//入力された値を変数に格納する
		int thirdInt = standardInput.nextInt();
		//ソートするための変数
		int sortInt = firstInt;

		//一つ目が二つ目より大きい場合
		if (firstInt > secondInt) {
			//ソートするための変数に一つ目の値を代入する
			sortInt = firstInt;
			//二つ目を最小値とする
			firstInt = secondInt;
			//二つ目と三つ目の値を比較する
			if (secondInt > thirdInt) {
				//三つ目を最小値とする
				firstInt = thirdInt;
				//一つ目を最大値とする
				thirdInt = sortInt;
			//一つ目と三つ目の値を比較する
			} else if (sortInt > thirdInt) {
				//三つ目を中央値とする
				secondInt = thirdInt;
				//一つ目を最大値とする
				thirdInt = sortInt;
			//三つ目の値が最大の場合
			} else {
				//一つ目を中央値とする
				secondInt = sortInt;
			}
		//二つ目と三つ目の値を比較する
		} else if (secondInt > thirdInt) {
			//三つ目をソートするための変数に代入する
			sortInt = thirdInt;
			//二つ目を最大値とする
			thirdInt = secondInt;
			//一つ目と三つ目の値を比較する
			if (firstInt < sortInt) {
				//三つ目を中央値とする
				secondInt = sortInt;
			//一つ目が三つ目より大きい場合
			} else {
				//一つ目を中央値とする
				secondInt = firstInt;
				//三つ目を最小値とする
				firstInt = sortInt;
			}
		}
		//昇順にソートした結果を出力する
		System.out.println("a≦b≦cとなるようにソートしました。");
		//最小値を出力する
		System.out.println("変数ａは" + firstInt + "です。");
		//中央値を出力する
		System.out.println("変数ｂは" + secondInt + "です。");
		//最大値を出力する
		System.out.println("変数ｃは" + thirdInt + "です。");

	}
}
