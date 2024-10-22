package Chapter07;

//入力ストリーム
import java.util.Scanner;

/*
 * クラス名:Exercise7_18
 * 概要:配列から指定した要素削除し表示する
 * 作成者:M.Iizuka
 * 作成日:2024/10/22
 */
public class Exercise7_18 {

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
		for (int elementIndex=0;elementIndex<optionalArray.length ; elementIndex++) {
			//最後の要素
			if(elementIndex==(optionalArray.length-1)) {
			//カンマをつけないで表示しカッコを閉じる
			System.out.print(+optionalArray[elementIndex]+"}");
			//最後の要素以外
			}else {
			//カンマをつけて表示する
			System.out.print(+optionalArray[elementIndex] + ",");
			}
		}
	}

	/*
	 * 関数名:aryRmv
	 * 概要:配列から指定された要素を削除する
	 * 引数:optionalArray 任意の配列, 削除する要素 removeElement
	 * 戻り値:なし
	 * 作成者:M.Iizuka
	 * 作成日:2024/10/22
	 */
	public static void aryRmv(int[] optionalArray, int removeElement) {
		//指定された要素を削除する
		for (int elementIndex = 0; elementIndex < optionalArray.length; elementIndex++) {
			//削除する要素の後の要素
			if (elementIndex > removeElement) {
				//前の要素に上書き
				optionalArray[elementIndex - 1] = optionalArray[elementIndex];
			}
		}
		//削除後の要素を表示
		printArray(optionalArray);
	}

	/*
	 * 関数名:main
	 * 概要:配列から指定した要素削除し表示する
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

		//削除する要素
		int removeElement = 0;
		//削除する要素番号チェック
		do {
			//削除する要素番号の入力を促す
			System.out.print("\n削除する要素番号：");
			//入力値を読み込む
			removeElement = standardInput.nextInt();
			//不正な値の場合
			if (removeElement < 0 || removeElement >= integerArray.length-1) {
				//正しい値を入力するよう促す
				System.out.println("0以上" + (integerArray.length - 2) + "以下の値を入力してください。");
			}
			//不正な値の場合は入力処理を繰り返す
		} while (removeElement < 0 || removeElement >= integerArray.length-1);

		//削除後の配列の要素を表示する
		System.out.println("\n削除後の配列");
		//削除後の配列の要素を表示する
		aryRmv(integerArray, removeElement);
	}
}
