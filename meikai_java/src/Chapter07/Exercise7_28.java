package Chapter07;

//入力ストリーム
import java.util.Scanner;

/*
 * クラス名:Exercise7_28
 * 概要:二つの行列の和を格納した2次元配列を表示する
 * 作成者:M.Iizuka
 * 作成日:2024/10/24
 */
public class Exercise7_28 {
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
	 * 関数名:addMatrix
	 * 概要:二つの行列の和を求める
	 * 引数:firstArray 一つ目の配列, secondArray 二つ目の配列
	 * 戻り値:addMatrixArray 二つの行列の和を格納した二次元配列
	 * 作成者:M.Iizuka
	 * 作成日:2024/10/24
	 */
	public static int[][] addMatrix(int[][] firstArray, int[][] secondArray) {
		//返す配列
		int[][] addMatrixArray = new int[lineValue][columnValue];
		//行列の加算を行う
		for (int lineIndex = 0; lineIndex < lineValue; lineIndex++) {
			//列の要素を加算する
			for (int columnIndex = 0; columnIndex < columnValue; columnIndex++) {
				//三つの配列の列の要素の加算を行う
				addMatrixArray[lineIndex][columnIndex] += (firstArray[lineIndex][columnIndex]
						+ secondArray[lineIndex][columnIndex]);
			}
			//次の行の計算へ改行する
			System.out.println("");
		}
		//加算した値を格納した配列を返す
		return addMatrixArray;
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
				System.out.print(optionalArray[linIndex][columnIndex] + "  ");
			}
			//次の行の表示へ改行
			System.out.println("");
		}
	}

	/*
	 * 関数名:main
	 * 概要:二つの行列の和を格納した2次元配列を表示する
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
		int[][] firstArray = new int[lineValue][columnValue];
		//一つ目の配列の生成を行っていくことを表示
		System.out.println("\n配列１の要素の値を入力してください。");
		//一つ目の配列の要素の値を入力
		inputElementValue(firstArray);

		//配列を生成
		int[][] secondArray = new int[lineValue][columnValue];
		//二つ目の配列の生成を行っていくことを表示
		System.out.println("\n配列２の要素の値を入力してください。");
		//二つ目の配列の要素の値を入力
		inputElementValue(secondArray);

		//二つの行列の和の配列
		int[][] addMatrixArray = addMatrix(firstArray, secondArray);
		//配列１を表示
		System.out.println("配列１");
		//配列１の要素を表示
		printArray(firstArray);
		//配列２を表示
		System.out.println("配列２");
		//配列２の要素を表示
		printArray(secondArray);
		//加算した配列を表示
		System.out.println("加算した配列");
		//行列の和の配列を表示
		printArray(addMatrixArray);

	}

}