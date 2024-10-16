package Chapter06;

import java.util.Random;
//入力ストリーム
import java.util.Scanner;

/*
* クラス名:Exercise6_12
* 概要:配列の要素の並びをシャッフルする（ランダムな順となるようにかき混ぜる）プログラム
* 作成者:M.Iizuka
* 作成日:2024/10/16
*/
public class Exercise6_12 {

	/*
	 * 関数名:main
	 * 概要:配列の要素の並びをシャッフルする（ランダムな順となるようにかき混ぜる）
	 * 引数:なし
	 * 戻り値:なし
	 * 作成者:M.Iizuka
	 * 作成日:2024/10/16
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
		//配列の要素数の上限
		int maxElement = 10;
		//今までの値と同じかどうか判定するboolean変数
		boolean sameElement = false;

		//要素数の入力が正しいか判定
		do {
			//要素数の入力を促す
			System.out.print("要素数：");
			//入力値を読み込む
			allElement = standardInput.nextInt();
			//入力値が不正な値の場合
			if (allElement <= 0 || allElement > maxElement) {
				//不正であることを表示
				System.out.println("1～10の整数を入力してください。");
			}
			//正しい数値が入力されるまで繰り返す
		} while (allElement <= 0 || allElement > maxElement);

		//配列を生成
		int[] integerArray = new int[allElement];
		//配列の全要素に1～10の乱数を埋め込む
		for (int elementIndex = 0; elementIndex < allElement; elementIndex++) {
			//要素に乱数を読み込んでいく
			do {
				//要素に乱数を読み込む
				integerArray[elementIndex] = randomNumber.nextInt(maxRandom) + adjustRandom;
				//最初の要素以外のとき
				if (elementIndex > 0) {
					//今までの要素の値と比較
					for (int keyIndex = 0; keyIndex < elementIndex; keyIndex++) {
						//値が被っていた場合
						if (integerArray[keyIndex] == integerArray[elementIndex]) {
							//trueを返す
							sameElement = true;
							//再度乱数の読み込みを行う
							break;
							//値が異なっていた場合
						} else {
							//falseを返し次の要素の読み込みを行う
							sameElement = false;
						}
					}
				}
				//今までの要素と同じ値の場合は再度乱数を読み込む
			} while (elementIndex > 0 && sameElement);
		}

		//シャッフル前の配列の全要素の値を表示する
		System.out.print("シャッフル前 {");
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
				System.out.print("}\n");
			}
		}

		//個々の要素の値をランダムに交換して表示する
		for (int elementIndex = 0; elementIndex < allElement; elementIndex++) {
			//入れ替えるための変数に現在の要素の値を代入
			int exchangeElement = integerArray[elementIndex];
			//入れ替え先の要素番号
			int exchangeIndex = 0;
			//入れ替え先を決める
			do {
				//どこと入れ替えるかランダムに決める
				exchangeIndex = randomNumber.nextInt(allElement);
				//異なる要素番号に入れ替えるようにする
			} while (exchangeIndex == elementIndex);
			//入れ替え先の要素の値を現在の要素に代入
			integerArray[elementIndex] = integerArray[exchangeIndex];
			//入れ替え先の要素に現在の要素の値を代入
			integerArray[exchangeIndex] = exchangeElement;

		}

		//シャッフル後の配列の全要素の値を表示する
		System.out.print("シャッフル後 {");
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
