package Chapter07;

//入力ストリーム
import java.util.Scanner;

/*
 * クラス名:Exercise7_22
 * 概要:最初に生成した配列と同じ配列を生成して表示する
 * 作成者:M.Iizuka
 * 作成日:2024/10/23
 */
public class Exercise7_22 {

	/*
	 * 関数名:arrayClone
	 * 概要:任意の配列と同じ配列を生成して返却する
	 * 引数:optionalArray 任意の配列
	 * 戻り値:cloneArray 生成された同じ配列
	 * 作成者:M.Iizuka
	 * 作成日:024/10/23
	 */
	public static int[] arrayClone(int[] optionalArray) {
		//任意の配列と同じ要素数の配列を生成
		int[] cloneArray = new int[optionalArray.length];
		//任意の配列の全要素をコピー
		for (int elementIndex = 0; elementIndex < cloneArray.length; elementIndex++) {
			//要素をコピー
			cloneArray[elementIndex] = optionalArray[elementIndex];
		}
		//生成された配列を返却
		return cloneArray;
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
	 * 概要:最初に生成した配列と同じ配列を生成して表示する
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

		//同じ配列を生成する
		int[] cloneArray = arrayClone(integerArray);
		//最初の配列を表示する
		printArray(integerArray, "integerArray");
		//生成した同じ配列を表示する
		printArray(cloneArray, "cloneArray");
	}

}
