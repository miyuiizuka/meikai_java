package Chapter07;

//入力ストリーム
import java.util.Scanner;

/*
 * クラス名:Exercise7_20
 * 概要:配列の指定した要素に値を挿入し表示する
 * 作成者:M.Iizuka
 * 作成日:2024/10/22
 */
public class Exercise7_20 {

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
	 * 関数名:aryIns
	 * 概要:配列の指定した要素に値を挿入する
	 * 引数:optionalArray 任意の配列, insertIndex 挿入する要素, insertValue 挿入する要素の値
	 * 戻り値:なし
	 * 作成者:M.Iizuka
	 * 作成日:2024/10/22
	 */
	public static void aryIns(int[] optionalArray, int insertIndex, int insertValue) {
		//要素を挿入し、後ろの値をずらす
		for (int nextValueIndex = insertIndex; nextValueIndex < optionalArray.length; nextValueIndex++) {
			//挿入する要素の値を一時保管
			int nextInsertValue = optionalArray[nextValueIndex];
			//挿入する値を要素に入れる
			optionalArray[nextValueIndex] = insertValue;
			//保管していた値を挿入する要素にセット
			insertValue = nextInsertValue;
		}

		//挿入後の要素を表示
		printArray(optionalArray);
	}

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

		//挿入前の配列の要素を表示する
		System.out.println("\n挿入前の配列");
		//挿入前の配列の要素を表示する
		printArray(integerArray);
		//改行し挿入する要素番号の入力を行う
		System.out.println("");

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
			//挿入する要素番号の入力を促す
			System.out.print("\n挿入する要素番号：");
			//入力値を読み込む
			insertIndex = standardInput.nextInt();
			//下限
			inputMinimumValue = 0;
			//上限
			inputMaxValue = integerArray.length - 1;
			//入力チェック
			inputError = checkInputValue(insertIndex, inputMinimumValue, inputMaxValue);
			//不正な値の場合は入力処理を繰り返す
		} while (inputError);

		//挿入する要素番号の入力を促す
		System.out.print("挿入する要素の値：");
		//挿入する要素の値を読み込む
		int insertValue = standardInput.nextInt();

		//挿入後の配列の要素を表示する
		System.out.println("\n挿入後の配列");
		//挿入後の配列の要素を表示する
		aryIns(integerArray, insertIndex, insertValue);

	}

}
