package Chapter07;

//入力ストリーム
import java.util.Scanner;

/*
 * クラス名:Exercise7_26
 * 概要:配列の指定した要素に値を挿入し、その配列を表示する
 * 作成者:M.Iizuka
 * 作成日:2024/10/23
 */
public class Exercise7_26 {
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
	 * 関数名:arrayInsOf
	 * 概要:配列の指定した要素に値を挿入し、その配列を返す
	 * 引数:originalArray 挿入前の配列, insertIndex 挿入する要素, insertValue 挿入する要素の値
	 * 戻り値:insertArray 挿入後の配列
	 * 作成者:M.Iizuka
	 * 作成日:2024/10/23
	 */
	public static int[] arrayInsOf(int[] originalArray, int insertIndex, int insertValue) {
		//挿入後の配列
		int[] insertArray = new int[originalArray.length + 1];
		//要素を挿入し、後ろの値をずらす
		for (int elementIndex = 0; elementIndex < insertArray.length; elementIndex++) {
			//挿入する要素の後の要素の場合
			if (elementIndex >= insertIndex) {
				//値を挿入後、一つ後ろにずれて元の値を返す配列にセット
				insertArray[elementIndex] = elementIndex == insertIndex ? insertValue : originalArray[elementIndex - 1];
				//挿入する要素の前の要素の場合
			} else {
				//値はそのままコピー
				insertArray[elementIndex] = originalArray[elementIndex];
			}
		}
		//削除後の配列を返す
		return insertArray;
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
				//カンマをつけないで表示する
				System.out.print(+optionalArray[elementIndex]);
				//最後の要素以外
			} else {
				//カンマをつけて表示する
				System.out.print(+optionalArray[elementIndex] + ",");
			}
		}
		//配列の要素を表示する最後のカッコを表示する
		System.out.print("}");
	}

	/*
	 * 関数名:main
	 * 概要:配列の指定した要素に値を挿入し、その配列を表示する
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

		//挿入する要素
		int insertIndex = 0;
		//挿入する要素番号チェック
		do {
			//挿入する要素番号の入力
			insertIndex = inputValue("挿入する要素");
			//下限
			inputMinimumValue = 0;
			//上限
			inputMaxValue = integerArray.length - 1;
			//入力チェック
			inputError = checkInputValue(insertIndex, inputMinimumValue, inputMaxValue);
			//不正な値の場合は入力処理を繰り返す
		} while (inputError);

		//挿入する要素の値の入力
		int insertValue = inputValue("挿入する要素の値");

		//指定された要素を挿入後の配列
		int[] insertArray = arrayInsOf(integerArray, insertIndex, insertValue);

		//挿入前配列を表示する
		System.out.println("\n挿入前の配列");
		//挿入前配列の全要素を表示する
		printArray(integerArray);
		//削除後の配列
		System.out.println("\n挿入後の配列");
		//削除後の配列の要素を表示する
		printArray(insertArray);
	}
}
