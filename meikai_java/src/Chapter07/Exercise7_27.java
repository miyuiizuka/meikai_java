package Chapter07;

//入力ストリーム
import java.util.Scanner;

/*
 * クラス名:Exercise7_27
 * 概要:三つの配列の要素数が等しければ加算を行い表示し、等しくなければ加算を行わない
 * 作成者:M.Iizuka
 * 作成日:2024/10/23
 */
public class Exercise7_27 {
	//入力値を抽出する
	static Scanner standardInput = new Scanner(System.in);
	//一つ目の列数
	static int firstArrayColumn = 0;
	//二つ目の列数
	static int secondArrayColumn = 0;
	//三つ目の列数
	static int thirdArrayColumn = 0;

	/*
	 * 関数名:createArray
	 * 概要:配列を作る
	 * 引数:なし
	 * 戻り値:newArray 生成された配列
	 * 作成者:M.Iizuka
	 * 作成日:2024/10/23
	 */
	public static int[][] createArray() {
		//行の要素数
		int lineValue = 0;
		//列の要素数
		int columnValue = 0;
		//行の要素数の入力
		do {
			//要素数の入力
			lineValue = inputValue("行の要素数");
			//入力値チェック
			checkPositiveInt(lineValue);
			//不正であれば繰り返す
		} while (checkPositiveInt(lineValue));

		//列の要素数の入力
		do {
			//要素数の入力
			columnValue = inputValue("列の要素数");
			//入力値チェック
			checkPositiveInt(columnValue);
			//不正であれば繰り返す
		} while (checkPositiveInt(columnValue));

		//配列を生成
		int[][] newArray = new int[lineValue][columnValue];
		//生成された配列を返す
		return newArray;
	}

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
	 * 戻り値:columnValue
	 * 作成者:M.Iizuka
	 * 作成日:2024/10/23
	 */
	public static int inputElementValue(int[][] optionalArray) {
		//列の数
		int columnValue = 0;
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
				//列の数をカウント
				columnValue++;
			}
		}
		//列の数を返す
		return columnValue;
	}

	/*
	 * 関数名:checkEqualValue
	 * 概要:三つの値が等しいか調べる
	 * 引数:firstValue 一つ目の値, secondValue 二つ目の値, thirdValue 三つ目の値
	 * 戻り値:checkEqual 三つの値が等しいか
	 * 作成者:M.Iizuka
	 * 作成日:2024/10/23
	 */
	public static boolean checkEqualValue(int firstValue, int secondValue, int thirdValue) {
		//三つの値が等しいか
		boolean checkEqual = false;
		//三つの値が等しい場合
		if (firstValue == secondValue && secondValue == thirdValue && thirdValue == firstValue) {
			//等しい結果をセット
			checkEqual = true;
		}
		//三つの値が等しいか判定した結果を返す
		return checkEqual;
	}

	/*
	 * 関数名:addMatrix
	 * 概要:三つの配列の要素数が等しければ加算してtrue、等しくなければ加算を行わずfalseを返す
	 * 引数:firstArray 一つ目の配列, secondArray 二つ目の配列,　thirdArray 三つ目の配列
	 * 戻り値:addMatrix 要素数が等しく、加算を行ったか
	 * 作成者:M.Iizuka
	 * 作成日:2024/10/23
	 */
	public static boolean addMatrix(int[][] firstArray, int[][] secondArray, int[][] thirdArray) {
		//加算した値を格納する配列
		int[][] addMatrixArray = new int[firstArray.length][firstArrayColumn];
		//三つの配列の要素数が等しく、加算を行ったか
		boolean addMatrix = false;
		//三つの行数が等しいか調べる
		boolean equalLineValue = checkEqualValue(firstArray.length, secondArray.length, firstArray.length);
		//三つの列数が等しいか調べる
		boolean equalColumnValue = checkEqualValue(firstArrayColumn, secondArrayColumn, thirdArrayColumn);
		//三つの配列の要素数が等しい場合
		if (equalLineValue && equalColumnValue) {
			//加算を行うことを表示
			System.out.println("\n加算を行います。");
			//三つの配列の加算を行う
			for (int lineIndex = 0; lineIndex < firstArray.length; lineIndex++) {
				//列の要素を加算する
				for (int columnIndex = 0; columnIndex < firstArray[lineIndex].length; columnIndex++) {
					//二つの加算結果を配列に入れる
					addMatrixArray[lineIndex][columnIndex] += (firstArray[lineIndex][columnIndex]
							+ secondArray[lineIndex][columnIndex]);
					//二つの加算結果に三つ目の配列の加算
					addMatrixArray[lineIndex][columnIndex] += thirdArray[lineIndex][columnIndex];
					//加算結果を表示する
					System.out.print(
							"[" + lineIndex + "][" + columnIndex + "] = " + addMatrixArray[lineIndex][columnIndex]
									+ "\t");
				}
				//次の行の計算へ改行する
				System.out.println("");
			}
			//加算を行ったためtrueをセット
			addMatrix = true;
		}
		//要素数が等しく、加算を行ったか返す
		return addMatrix;
	}

	/*
	 * 関数名:main
	 * 概要:三つの配列の要素数が等しければ加算を行い表示し、等しくなければ加算を行わない
	 * 引数:なし
	 * 戻り値:なし
	 * 作成者:M.Iizuka
	 * 作成日:2024/10/23
	 */
	public static void main(String[] args) {
		//一つ目の配列の生成を行っていくことを表示
		System.out.println("配列１");
		//一つ目の配列を生成
		int[][] firstArray = createArray();
		//一つ目の配列の要素の値を入力し列の数を取得
		firstArrayColumn = inputElementValue(firstArray);
		//二つ目の配列の生成を行っていくことを表示
		System.out.println("\n配列２");
		//二つ目の配列を生成
		int[][] secondArray = createArray();
		//二つ目の配列の要素の値を入力し列の数を取得
		secondArrayColumn = inputElementValue(secondArray);
		//三つ目の配列の生成を行っていくことを表示
		System.out.println("\n配列３");
		//三つ目の配列を生成
		int[][] thirdArray = createArray();
		//三つ目の配列の要素の値を入力し列の数を取得
		thirdArrayColumn = inputElementValue(thirdArray);

		//三つの配列の要素数が等しければ加算、等しくなければ加算を行わない
		boolean addMatrix = addMatrix(firstArray, secondArray, thirdArray);
		//boolean値を表示
		System.out.println(addMatrix);
	}
}
