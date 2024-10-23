package Chapter07;

//入力ストリーム
import java.util.Scanner;

/*
 * クラス名:Exercise7_23
 * 概要:配列の要素の中で指定した値である全要素のインデックスを先頭から順に格納した配列を表示する
 * 作成者:M.Iizuka
 * 作成日:024/10/23
 */
public class Exercise7_23 {

	/*
	 * 関数名:countKeyIndex
	 * 概要:探す値と同じ値を持つ要素数を数える
	 * 引数:optionalArray 任意の配列, keyValue 探す値
	 * 戻り値:allKeyIndex 同じ値をもつ要素の合計
	 * 作成者:M.Iizuka
	 * 作成日:2024/10/23
	 */
	public static int countKeyIndex(int[] optionalArray, int keyValue) {
		//同じ値を持つ要素の合計
		int allKeyIndex = 0;
		//同じ値がいくつあるか調べる
		for (int keyElement : optionalArray) {
			//同じ値を見つけた場合
			if (keyValue == keyElement) {
				//カウント
				allKeyIndex++;
			}
		}
		//同じ値をもつ要素数を返す
		return allKeyIndex;
	}

	/*
	 * 関数名:arraySrchIdx
	 * 概要:探す値と同じ値である全要素のインデックスを先頭から順に格納した配列を返す
	 * 引数:optionalArray 任意の配列, keyValue 探す値
	 * 戻り値:keyIndexArray 同じ要素のインデックスを格納した配列
	 * 作成者:M.Iizuka
	 * 作成日:2024/10/23
	 */
	public static int[] arraySrchIdx(int[] optionalArray, int keyValue) {
		//同じ値をもつ要素数を調べる
		int allKeyIndex = countKeyIndex(optionalArray, keyValue);
		//同じ値をもつインデックスを格納した配列
		int[] keyIndexArray = new int[allKeyIndex];
		//返す配列のインデックス
		int keyIndex = 0;

		//配列から探す値と一致する値をもつインデックスを探す
		for (int elementIndex = 0; elementIndex < optionalArray.length; elementIndex++) {
			//見つかった場合
			if (optionalArray[elementIndex] == keyValue) {
				//返す配列の要素に同じ値のインデックスを入れる
				keyIndexArray[keyIndex] = elementIndex;
				//返す配列の次のインデックス
				keyIndex++;
			}
		}
		//探索結果を返す
		return keyIndexArray;
	}

	/*
	 * 関数名:printArray
	 * 概要:配列の全要素を表示する
	 * 引数:optionalArray 任意の配列
	 * 戻り値:なし
	 * 作成者:M.Iizuka
	 * 作成日:2024/10/22
	 */
	public static void printArray(int[] optionalArray) {
		//配列の要素を表示する最初のカッコを表示する
		System.out.print("{");
		//配列の全要素を表示する
		for (int elementIndex = 0; elementIndex < optionalArray.length; elementIndex++) {
			//最後の要素
			if (elementIndex == (optionalArray.length - 1)) {
				//カンマをつけないで表示しカッコを閉じる
				System.out.print(+optionalArray[elementIndex] + "}");
				//最後の要素以外
			} else {
				//カンマをつけて表示する
				System.out.print(+optionalArray[elementIndex] + ",");
			}
		}
	}

	/*
	 * 関数名:main
	 * 概要:配列の要素の中で指定した値である全要素のインデックスを先頭から順に格納した配列を表示する
	 * 引数:なし
	 * 戻り値:なし
	 * 作成者:M.Iizuka
	 * 作成日:2024.10.23
	 */
	public static void main(String[] args) {
		//入力値を抽出する
		Scanner standardInput = new Scanner(System.in);

		//要素数
		int allElement = 0;
		//要素数の入力チェック
		do {
			//要素数の入力を促す
			System.out.print("要素数：");
			//入力値を読み込む
			allElement = standardInput.nextInt();
			//不正な値が入力された場合
			if (allElement <= 0) {
				//正しい値を入力するよう促す
				System.out.println("正の整数で入力してください。");
			}
			//不正な値であれば入力処理を繰り返す
		} while (allElement <= 0);
		//配列を生成
		int[] integerArray = new int[allElement];

		//配列の要素の値を入力してもらう
		for (int elementIndex = 0; elementIndex < allElement; elementIndex++) {
			//要素の値の入力を促す
			System.out.print("integerArray[" + elementIndex + "]：");
			//入力値を配列に格納
			integerArray[elementIndex] = standardInput.nextInt();
		}

		//探す値の入力を促す
		System.out.print("探す値：");
		//入力値を読み込む
		int keyValue = standardInput.nextInt();

		//探す値と同じ値の全要素のインデックスを格納する
		int[] keyIndexArray = arraySrchIdx(integerArray, keyValue);
		//同じ値をもつ要素が見つからなかった場合
		if (keyIndexArray.length == 0) {
			//見つからなかったことを表示
			System.out.println("その値の要素は存在しません。");
			//見つかった場合
		} else {
			//探索結果の配列を表示する
			printArray(keyIndexArray);
		}
	}
}