package Chapter07;

//入力ストリーム
import java.util.Scanner;

/*
 * クラス名:Exercise7_29
 * 概要:任意の二次元配列と同じ配列（要素数、全要素の値それぞれが同じ配列）を生成して表示する
 * 作成者:M.Iizuka
 * 作成日:2024/10/24
 */
public class Exercise7_29 {
	//入力値を抽出する
	static Scanner standardInput = new Scanner(System.in);
	//行の数
	static int lineValue = 0;
	//列の数
	static int columnValue = 0;

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
	 * 関数名:checkPositiveInt
	 * 概要:正の整数であるかをチェック
	 * 引数:inputInt 入力された整数
	 * 戻り値:notPositive 正の整数であるか
	 * 作成者:M.Iizuka
	 * 作成日:2024/10/23
	 */
	public static boolean checkPositiveInt(int inputInt) {
		//正の整数であるか
		boolean notPositive = true;
		//0以下の整数の場合
		if (inputInt <= 0) {
			//正の整数の入力を促す
			System.out.println("正の整数を入力してください。");
			//正の整数である場合
		} else {
			//返す値をfalseにする
			notPositive = false;
		}
		//チェック結果を返す
		return notPositive;
	}

	/*
	 * 関数名:inputElementValue
	 * 概要:要素の値を入力する
	 * 引数:optionalArray 要素を入力する配列
	 * 戻り値:なし
	 * 作成者:M.Iizuka
	 * 作成日:2024/10/23
	 */
	public static void inputElementValue(int[][] optionalArray) {
		//各要素の値を入力してもらうことを表示
		System.out.println("各要素の値を入力してください。");
		//各行の値を入力してしもらう
		for (int lineIndex = 0; lineIndex < optionalArray.length; lineIndex++) {
			//各要素の値を入力してもらう
			for (int columnIndex = 0; columnIndex < optionalArray[lineIndex].length; columnIndex++) {
				//各要素の値の入力を促す
				System.out.print("[" + lineIndex + "][" + columnIndex + "] = ");
				//入力値を読み込む
				optionalArray[lineIndex][columnIndex] = standardInput.nextInt();
			}
		}
	}

	/*
	 * 関数名:printArray
	 * 概要:配列の要素を表示する
	 * 引数:optionalArray 任意の配列
	 * 戻り値:なし
	 * 作成者:M.Iizuka
	 * 作成日:2024/10/22
	 */
	public static void printArray(int[][] optionalArray) {
		//配列の要素を表示する
		for (int linIndex = 0; linIndex < optionalArray.length; linIndex++) {
			//列の要素の値を表示する
			for (int columnIndex = 0; columnIndex < optionalArray[linIndex].length; columnIndex++) {
				//要素の値を表示
				System.out.print(optionalArray[linIndex][columnIndex] + "\t");
			}
			//次の行の表示へ改行
			System.out.println("");
		}
	}

	/*
	 * 関数名:main
	 * 概要:任意の二次元配列と同じ配列（要素数、全要素の値それぞれが同じ配列）を生成して表示する
	 * 引数:なし
	 * 戻り値:なし
	 * 作成者:M.Iizuka
	 * 作成日:2024/10/24
	 */
	public static void main(String[] args) {
		//行の要素数を入力してもらう
		do {
			//要素数の入力
			lineValue = inputValue("行の要素数");
			//不正であれば繰り返す
		} while (checkPositiveInt(lineValue));

		//列の要素数を入力してもらう
		do {
			//要素数の入力
			columnValue = inputValue("列の要素数");
			//不正であれば繰り返す
		} while (checkPositiveInt(columnValue));

		//配列を生成
		int[][] originalArray = new int[lineValue][columnValue];
		//配列の要素の値を入力
		inputElementValue(originalArray);

		//同じ配列を複製する
		int[][] cloneArray = aryClone2(originalArray);
		//複製元の配列を表示
		System.out.println("複製元の配列");
		//複製元の配列の要素を表示
		printArray(originalArray);
		//複製した配列を表示
		System.out.println("複製した配列");
		//複製した配列の要素を表示
		printArray(cloneArray);
	}

	/*
	 * 関数名:aryClone2
	 * 概要:任意の配列と同じ配列を複製する
	 * 引数:originalArray 複製元の配列
	 * 戻り値:cloneArray 複製した配列
	 * 作成者:M.Iizuka
	 * 作成日:024/10/24
	 */
	public static int[][] aryClone2(int[][] originalArray) {
		//任意の配列と同じ要素数の配列を生成
		int[][] cloneArray = new int[lineValue][columnValue];
		//配列を複製する
		for (int lineIndex = 0; lineIndex < lineValue; lineIndex++) {
			//列の要素の値を表示する
			for (int columnIndex = 0; columnIndex < columnValue; columnIndex++) {
				//要素をコピー
				cloneArray[lineIndex][columnIndex] = originalArray[lineIndex][columnIndex];
			}
		}
		//複製した配列を返却
		return cloneArray;
	}
}