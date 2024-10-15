package Chapter06;

//乱数ストリーム
import java.util.Random;
//入力ストリーム
import java.util.Scanner;

/*
 * クラス名:Exercise6_09
 * 概要:要素型がint型である配列を作り、全要素を1～10の乱数で埋めつくすプログラム
 * ただし、連続する要素が同じ値を持つことのないようにする
 * 作成者:M.Iizuka
 * 作成日:2024/10/15
 */
public class Exercise6_10 {

	/*
	 * 関数名:main
	 * 概要:要素型がint型である配列を作り、全要素を1～10の乱数で埋めつくす
	 * ただし、連続する要素が同じ値を持つことのないようにする
	 * 引数:なし
	 * 戻り値:なし
	 * 作成者:M.Iizuka
	 * 作成日:2024/10/15
	 */
	public static void main(String[] args) {
		//乱数を抽出する
		Random randomNumber = new Random();
		//入力値を抽出する
		Scanner standardInput = new Scanner(System.in);

		//要素数の変数
		int allElement = 0;
		//生成する乱数の最大値
		int maxRandom = 10;
		//1～10の乱数を生成するための調整値
		int adjustRandom = 1;

		//要素数の入力が正しいか判定
		do {
			//要素数の入力を促す
			System.out.print("要素数：");
			//入力値を読み込む
			allElement = standardInput.nextInt();
			//入力値が不正な値の場合
			if (allElement <= 0) {
				//不正であることを表示
				System.out.println("正の整数を入力してください。");
			}
			//正しい数値が入力されるまで繰り返す
		} while (allElement <= 0);

		//配列を生成
		int[] integerArray = new int[allElement];
		//配列の最初の要素を最初の比較対象に設定
		int keyElement = integerArray[0];
		//配列の全要素に1～10の乱数を埋め込む
		for (int elementIndex = 0; elementIndex < allElement; elementIndex++) {
			//要素に乱数を読み込んでいく
			do {
				//要素に乱数を読み込む
				integerArray[elementIndex] = randomNumber.nextInt(maxRandom) + adjustRandom;
				//読み込まれた値を出力
				System.out.println("integerArray[" + elementIndex + "] = " + integerArray[elementIndex]);
				//前の要素と同じ値の場合は再度乱数を読み込む
			} while (integerArray[elementIndex] == keyElement);
			//比較対象を現在の要素に変更
			keyElement = integerArray[elementIndex];
		}

		//配列の全要素の値を表示する
		System.out.print("{");
		//個々の要素の値を表示する
		for (int elementIndex = 0; elementIndex < allElement; elementIndex++) {
			//個々の要素の値を表示する
			System.out.print(integerArray[elementIndex]);
			//最後の要素でないときの表示
			if (elementIndex != (allElement - 1)) {
				//カンマをつける
				System.out.print(", ");
				//最後の要素のときの表示
			} else {
				//カッコを閉じる
				System.out.print("}");
			}
		}

	}

}
