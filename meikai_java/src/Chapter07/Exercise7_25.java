package Chapter07;

//入力ストリーム
import java.util.Scanner;

/*
 * クラス名:Exercise7_25
 * 概要:配列から指定の要素を先頭として指定した数の要素を削除した配列を表示する
 * 作成者:M.Iizuka
 * 作成日:2024/10/23
 */
public class Exercise7_25 {
	//入力値を抽出する
	static Scanner standardInput = new Scanner(System.in);

	/*
	 * 関数名:inputValue
	 * 概要:入力処理
	 * 引数:titleString 入力してもらう内容
	 * 戻り値:inputValue 入力値
	 * 作成者:M.Iizuka
	 * 作成日:2024/10/23
	 */
	public static int inputValue(String titleString) {
		//入力してもらう内容を表示
		System.out.print(titleString + "：");
		//入力値を読み込む
		int inputValue = standardInput.nextInt();
		//入力値を返す
		return inputValue;
	}

	/*
	 * 関数名:checkInputValue
	 * 概要:入力値チェック
	 * 引数:minimumValue 下限, maxValue 上限
	 * 戻り値:inputError 入力チェック結果
	 * 作成者:M.Iizuka
	 * 作成日:2024/10/22
	 */
	public static boolean checkInputValue(int inputValue, int inputMinimumValue, int inputMaxValue) {
		//不正な入力値
		boolean inputError = true;
		//入力値が不正な場合
		if (inputValue < inputMinimumValue || inputValue > inputMaxValue) {
			//不正であることを表示
			System.out.println(inputMinimumValue + "以上" + (inputMaxValue) + "以下で入力してください。");
			//入力値が正しい場合
		} else {
			//何も表示しない
			inputError = false;
		}
		//入力値が正しいか返す
		return inputError;
	}

	/*
	 * 関数名:arrayRmvOfN
	 * 概要:配列から、指定の要素を先頭として、指定した数の要素を削除した配列を返す
	 * 引数:originalArray 削除前の配列, removeIndex 削除する先頭の要素, sumRemoveValue 削除する要素の数
	 * 戻り値:removeArray 削除後の配列
	 * 作成者:M.Iizuka
	 * 作成日:2024/10/22
	 */
	public static int[] arrayRmvOfN(int[] originalArray, int removeIndex, int sumRemoveValue) {
		//削除後の配列
		int[] removeArray = new int[originalArray.length - sumRemoveValue];
		//指定された要素を削除する
		for (int elementIndex = 0; elementIndex < removeArray.length; elementIndex++) {
			//削除する要素の後の要素の場合
			if (elementIndex >= removeIndex) {
				//元の配列の要素を、削除する個数だけ前方にずらして削除後の配列に入れる
				removeArray[elementIndex] = originalArray[elementIndex + sumRemoveValue];
				//削除する要素の前の要素の場合
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
	 * 概要:配列から、指定の要素を先頭として、指定した数の要素を削除した配列を表示する
	 * 引数:なし
	 * 戻り値:なし
	 * 作成者:M.Iizuka
	 * 作成日:2024/10/23
	 */
	public static void main(String[] args) {
		//要素数
		int allElement = 0;
		//要素数の入力チェック
		do {
			//要素数の入力
			allElement = inputValue("要素数");
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

		//入力値チェック変数
		boolean inputError = true;
		//入力値の下限
		int inputMinimumValue = 0;
		//入力値の上限
		int inputMaxValue = 0;

		//削除する要素
		int removeIndex = 0;
		//削除する要素番号チェック
		do {
			//削除する要素番号の入力
			removeIndex = inputValue("削除する要素");
			//下限
			inputMinimumValue = 0;
			//上限
			inputMaxValue = integerArray.length - 1;
			//入力チェック
			inputError = checkInputValue(removeIndex, inputMinimumValue, inputMaxValue);
			//不正な値の場合は入力処理を繰り返す
		} while (inputError);

		//削除する要素の個数
		int sumRemoveValue = 0;
		//削除する要素番号チェック
		do {
			//削除する要素の個数の入力
			sumRemoveValue = inputValue("削除する要素の個数");
			//下限
			inputMinimumValue = 0;
			//上限
			inputMaxValue = integerArray.length - removeIndex;
			//入力チェック
			inputError = checkInputValue(sumRemoveValue, inputMinimumValue, inputMaxValue);
			//不正な値の場合は入力処理を繰り返す
		} while (inputError);

		//指定された要素削除後の配列
		int[] removeArray = arrayRmvOfN(integerArray, removeIndex, sumRemoveValue);

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
