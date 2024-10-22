package Chapter07;

//入力ストリーム
import java.util.Scanner;

/*
 * クラス名:Exercise7_19
 * 概要:配列から指定された範囲の要素を削除し表示する
 * 作成者:M.Iizuka
 * 作成日:2024/10/22
 */
public class Exercise7_19 {

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
	 * 関数名:aryRmvN
	 * 概要:配列から指定された範囲の要素を削除し表示する
	 * 引数:optionalArray 任意の配列, removeIndex 削除する先頭の要素, sumRemoveValue 削除する要素の数
	 * 戻り値:なし
	 * 作成者:M.Iizuka
	 * 作成日:2024/10/22
	 */
	public static void aryRmvN(int[] optionalArray, int removeIndex, int sumRemoveValue) {
		//配列の値を前方にずらす
		for (int elementIndex = removeIndex; elementIndex < removeIndex + sumRemoveValue; elementIndex++) {
			//値が前方にずらせる場合
			if (elementIndex + sumRemoveValue < optionalArray.length) {
				//前方にずらす
				optionalArray[elementIndex] = optionalArray[elementIndex + sumRemoveValue];
				//値が前方にずらせない場合
			} else {
				//そのまま
				break;
			}
		}
		//削除後の要素を表示
		printArray(optionalArray);
	}

	/*
	 * 関数名:main
	 * 概要:配列から指定された範囲の要素を削除し表示する
	 * 引数:なし
	 * 戻り値:なし
	 * 作成者:M.Iizuka
	 * 作成日:2024/10/22
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

		//削除前の配列の要素を表示する
		System.out.println("\n削除前の配列");
		//削除前の配列の要素を表示する
		printArray(integerArray);
		//改行し削除する要素番号の入力を行う
		System.out.println("");

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
			//削除する要素番号の入力を促す
			System.out.print("\n削除する要素番号：");
			//入力値を読み込む
			removeIndex = standardInput.nextInt();
			//下限
			inputMinimumValue = 0;
			//上限
			inputMaxValue = integerArray.length - 2;
			//入力チェック
			inputError = checkInputValue(removeIndex, inputMinimumValue, inputMaxValue);
			//不正な値の場合は入力処理を繰り返す
		} while (inputError);

		//削除する要素の個数
		int sumRemoveValue = 0;
		//削除する要素番号チェック
		do {
			//削除する要素番号の入力を促す
			System.out.print("削除する要素の個数：");
			//入力値を読み込む
			sumRemoveValue = standardInput.nextInt();
			//下限
			inputMinimumValue = 1;
			//上限
			inputMaxValue = integerArray.length - (removeIndex + 1);
			//入力チェック
			inputError = checkInputValue(sumRemoveValue, inputMinimumValue, inputMaxValue);
			//不正な値の場合は入力処理を繰り返す
		} while (inputError);

		//削除後の配列の要素を表示する
		System.out.println("\n削除後の配列");
		//削除後の配列の要素を表示する
		aryRmvN(integerArray, removeIndex, sumRemoveValue);

	}

}
