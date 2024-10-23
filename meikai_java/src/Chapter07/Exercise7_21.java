package Chapter07;

//入力ストリーム
import java.util.Scanner;

/*
 * クラス名:Exercise7_21
 * 概要:二つの配列の全要素の値を交換し表示する
 * 作成者:M.Iizuka
 * 作成日:2024/10/23
 */
public class Exercise7_21 {
	//入力値を抽出する
	static Scanner standardInput = new Scanner(System.in);

	/*
	 * 関数名:inputAllElement
	 * 概要:配列の要素数の入力
	 * 引数:arrayName 配列名
	 * 戻り値:allElement 配列の要素数
	 * 作成者:M.Iizuka
	 * 作成日:2024/10/23
	 */
	public static int inputAllElement(String arrayName) {
		//要素数
		int allElement = 0;
		//要素数の入力チェック
		do {
			//要素数の入力を促す
			System.out.print(arrayName + "の要素数：");
			//入力値を読み込む
			allElement = standardInput.nextInt();
			//不正な値が入力された場合
			if (allElement <= 0) {
				//正しい値を入力するよう促す
				System.out.println("正の整数で入力してください。\n");
			}
			//不正な値であれば入力処理を繰り返す
		} while (allElement <= 0);
		//要素数を返す
		return allElement;
	}

	/*
	 * 関数名:inputElementValue
	 * 概要:配列の要素の入力
	 * 引数:arrayName 配列名, optionalArray 任意の配列, allElement 要素数
	 * 戻り値:なし
	 * 作成者:M.Iizuka
	 * 作成日:2024/10/23
	 */
	public static void inputElementValue(String arrayName, int[] optionalArray, int allElement) {
		//配列の要素の値を入力してもらう
		for (int elementIndex = 0; elementIndex < allElement; elementIndex++) {
			//要素の値の入力を促す
			System.out.print(arrayName + "[" + elementIndex + "]：");
			//入力値を配列に格納
			optionalArray[elementIndex] = standardInput.nextInt();
		}
	}

	/*
	 * 関数名:aryExchng
	 * 概要:二つの配列の全要素の値を交換する
	 * 引数:firstArray 一つ目の配列, secondArray 二つ目の配列
	 * 戻り値:なし
	 * 作成者:M.Iizuka
	 * 作成日:2024/10/23
	 */
	public static void aryExchng(int[] firstArray, int[] secondArray) {
		//配列の長さを比べ、短いほうを交換ループの制御式にする
		int exhangeTimes = firstArray.length < secondArray.length ? firstArray.length : secondArray.length;
		//要素の値の交換を行う
		for (int exchangeIndex = 0; exchangeIndex < exhangeTimes; exchangeIndex++) {
			//一つ目の配列の交換する値を保管する
			int exchangeValue = firstArray[exchangeIndex];
			//二つ目の要素を一つ目の要素に入れる
			firstArray[exchangeIndex] = secondArray[exchangeIndex];
			//保管していた一つ目の要素を二つ目の要素に入れる
			secondArray[exchangeIndex] = exchangeValue;
		}
	}

	/*
	 * 関数名:printArray
	 * 概要:配列の全要素を表示する
	 * 引数:optionalArray 任意の配列, arrayName 配列名
	 * 戻り値:なし
	 * 作成者:M.Iizuka
	 * 作成日:2024/10/22
	 */
	public static void printArray(int[] optionalArray, String arrayName) {
		//配列の要素を表示する最初のカッコを表示する
		System.out.print("\n" + arrayName + " = {");
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
	 * 概要:二つの配列の全要素の値を交換し表示する
	 * 引数:なし
	 * 戻り値:なし
	 * 作成者:M.Iizuka
	 * 作成日:2024/10/23
	 */
	public static void main(String[] args) {
		//一つ目の配列の名前
		String arrayName = "firstArray";
		//一つ目の配列の要素数
		int allElement = inputAllElement(arrayName);
		//配列を生成
		int[] firstArray = new int[allElement];
		//要素の値をセット
		inputElementValue(arrayName, firstArray, allElement);
		//次の配列生成を行うので改行
		System.out.println("");

		//二つ目の配列の名前
		arrayName = "secondArray";
		//二つ目の配列の要素数
		allElement = inputAllElement(arrayName);
		//配列を生成
		int[] secondArray = new int[allElement];
		//要素の値をセット
		inputElementValue(arrayName, secondArray, allElement);

		//全要素の値を交換することを表示
		System.out.println("\n全要素の値を交換します。");
		//全要素の値を交換
		aryExchng(firstArray, secondArray);
		printArray(firstArray, "firstArray");
		//二つ目の配列を表示
		printArray(secondArray, "secondArray");
	}
}
