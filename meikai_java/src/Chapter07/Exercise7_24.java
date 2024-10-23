package Chapter07;

//入力ストリーム
import java.util.Scanner;

/*
 * クラス名:Exercise7_24
 * 概要:配列から指定した要素を削除した配列を表示する
 * 作成者:M.Iizuka
 * 作成日:2024/10/23
 */
public class Exercise7_24 {

	/*
	 * 関数名:arrayRmvOf
	 * 概要:配列から指定した要素を削除した配列を返す
	 * 引数:originalArray 削除前の配列, removeIndext 削除する要素
	 * 戻り値:removeArray 削除後の配列
	 * 作成者:M.Iizuka
	 * 作成日:2024/10/23
	 */
	public static int[] arrayRmvOf(int[] originalArray, int removeIndex) {
		//削除後の配列
		int[] removeArray = new int[originalArray.length - 1];
		//指定された要素を削除する
		for (int elementIndex = 0; elementIndex < removeArray.length; elementIndex++) {
			//削除する要素の後の要素
			if (elementIndex >= removeIndex) {
				//元の配列の要素を一つ前方にずらして削除後配列に入れる
				removeArray[elementIndex] = originalArray[elementIndex + 1];
				//削除する要素の前の要素
			} else {
				//値はそのままコピー
				removeArray[elementIndex] = originalArray[elementIndex];
			}
		}
		//削除後の配列を返す
		return removeArray;
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
	 * 概要:配列から指定した要素を削除した配列を表示する
	 * 引数:なし
	 * 戻り値:なし
	 * 作成者:M.Iizuka
	 * 作成日:2024/10/23
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

		//削除する要素
		int removeIndex = 0;
		//削除する要素番号チェック
		do {
			//削除する要素番号の入力を促す
			System.out.print("\n削除する要素：");
			//入力値を読み込む
			removeIndex = standardInput.nextInt();
			//不正な値の場合
			if (removeIndex < 0 || removeIndex >= integerArray.length) {
				//正しい値を入力するよう促す
				System.out.println("0以上" + (integerArray.length - 1) + "以下の値を入力してください。");
			}
			//不正な値の場合は入力処理を繰り返す
		} while (removeIndex < 0 || removeIndex >= integerArray.length);

		//指定された要素削除後の配列
		int[] removeArray = arrayRmvOf(integerArray, removeIndex);

		//削除前配列を表示する
		System.out.println("\n削除前の配列");
		//削除前配列の全要素を表示する
		printArray(integerArray);
		//削除後の配列
		System.out.println("\n削除後の配列");
		//削除後の配列の要素を表示する
		printArray(removeArray);
	}
}
