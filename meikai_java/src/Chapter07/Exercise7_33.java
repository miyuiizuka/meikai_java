package Chapter07;

//入力ストリーム
import java.util.Scanner;

/*
 * クラス名:Exercise7_33
 * 概要:int型の一元配列とint型の二次元配列の全要素の値を表示する
 * 作成者:M.Iizuka
 * 作成日:2024/10/24
 */
public class Exercise7_33 {
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
	public static void inputElementValue(int[] optionalArray) {
		//各要素の値を入力してもらうことを表示
		System.out.println("要素の値を入力してください。");
		//要素の値を入力してしもらう
		for (int lineIndex = 0; lineIndex < optionalArray.length; lineIndex++) {
			//各要素の値の入力を促す
			System.out.print("[" + lineIndex + "] = ");
			//入力値を読み込む
			optionalArray[lineIndex] = standardInput.nextInt();
		}
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
	 * 関数名:confirmDigit
	 * 概要:要素の値の桁数を調べる
	 * 引数:optionalArray 要素の値を調べたい配列
	 * 戻り値:digitArray 要素の値の桁数を格納した配列
	 * 作成者:M.Iizuka
	 * 作成日:2024/10/25
	 */
	public static int[][] confirmDigit(int[][] optionalArray) {
		//調べたい配列の値がない要素を0とした配列を複製
		int[][] digitArray = createCloneArray(optionalArray);

		//要素の値の桁数を配列に格納する
		for (int lineIndex = 0; lineIndex < optionalArray.length; lineIndex++) {
			//要素の値の桁数を配列に格納する
			for (int columnIndex = 0; columnIndex < optionalArray[lineIndex].length; columnIndex++) {
				//要素の値の桁数
				int digitValue = 1;
				//要素の値を10で割ったときの商
				int quotientValue = optionalArray[lineIndex][columnIndex];
				//負数であれば
				if (optionalArray[lineIndex][columnIndex] < 0) {
					//負の符号を桁数にカウント
					digitValue++;
					//正の数にする
					quotientValue = -optionalArray[lineIndex][columnIndex];
				}
				//10で割った商が0になるまで繰り返す
				while ((quotientValue / 10) > 0) {
					//桁数をカウント
					digitValue++;
					//10で割った商
					quotientValue /= 10;
				}
				//桁数を配列に格納する
				digitArray[lineIndex][columnIndex] = digitValue;
			}
		}
		//桁数の配列を返す
		return digitArray;
	}

	/*
	 * 関数名:findMaxValue
	 * 概要:同列の要素の値の最大値を求める
	 * 引数:optionalArray 最大値を求めたい配列, columnValue 最大値を調べたい列
	 * 戻り値:maxValue 最大値
	 * 作成者:M.Iizuka
	 * 作成日:2024/10/25
	 */
	public static int findMaxValue(int[][] optionalArray, int columnValue) {
		//最初の行の要素を最大値として設定
		int maxValue = optionalArray[0][columnValue];
		//同列の要素の最大値を調べる
		for (int lineIndex = 0; lineIndex < optionalArray.length; lineIndex++) {
			//大きいほうの値を最大値に設定
			maxValue = maxValue > optionalArray[lineIndex][columnValue] ? maxValue
					: optionalArray[lineIndex][columnValue];
		}
		//最大値を返す
		return maxValue;
	}

	/*
	 * 関数名:createMaxColumnArray
	 * 概要:同列の要素の値の最大値とその差を格納した配列を生成する
	 * 引数:optionalArray 任意の配列
	 * 戻り値:maxColumnArray 同列の要素の値の最大値とその差を格納した配列
	 * 作成者:M.Iizuka
	 * 作成日:2024/10/25
	 */
	public static int[][] createmMaxColumnArray(int[][] optionalArray) {
		//任意の配列の値がない要素を0とした配列を複製
		int[][] maxColumnArray = createCloneArray(optionalArray);
		//同列の最大値との差を格納する
		for (int lineIndex = 0; lineIndex < optionalArray.length; lineIndex++) {
			//同列の最大値との差を格納する
			for (int columnIndex = 0; columnIndex < optionalArray[lineIndex].length; columnIndex++) {
				//差を格納する
				maxColumnArray[lineIndex][columnIndex] = findMaxValue(optionalArray, columnIndex)
						- optionalArray[lineIndex][columnIndex];
			}
		}
		//同列の要素の値の最大値とその差を格納した配列を返す
		return maxColumnArray;
	}

	/*
	 * 関数名:createCloneArray
	 * 概要:任意の配列の値がない要素を0とした配列を複製
	 * 引数:optionalArray 任意の配列
	 * 戻り値:cloneArray 生成した配列
	 * 作成者:M.Iizuka
	 * 作成日:2024/10/25
	 */
	public static int[][] createCloneArray(int[][] optionalArray) {
		//列の要素数の最大値
		int maxColumnElement = optionalArray[0].length;
		//列の要素数の最大値を求める
		for (int lineIndex = 0; lineIndex < optionalArray.length; lineIndex++) {
			//列の要素数の最大値を求める
			maxColumnElement = maxColumnElement > optionalArray[lineIndex].length ? maxColumnElement
					: optionalArray[lineIndex].length;
		}
		//任意の配列の値がない要素を0とした配列を生成
		int[][] cloneArray = new int[optionalArray.length][maxColumnElement];
		//生成した配列を返す
		return cloneArray;
	}

	/*
	 * 関数名:printSpace
	 * 概要:空白を出力
	 * 引数:optionalArray 出力時に列のインデントを揃えたい配列
	 * 戻り値:spaceString 空白
	 * 作成者:M.Iizuka
	 * 作成日:2024/10/25
	 */
	public static String printSpace(int[][] optionalArray, int lineIndex, int columnIndex) {
		//空白
		String spaceString = "";
		//二次元配列の要素の値の桁数を調べ、各列の最大桁数とその差を取得した配列を生成
		int[][] spaceArray = createmMaxColumnArray(confirmDigit(optionalArray));
		//スペースを出力
		for (int spaceIndex = 0; spaceIndex < spaceArray[lineIndex][columnIndex]; spaceIndex++) {
			//空白を足していく
			spaceString += " ";
		}
		//空白を返す
		return spaceString;
	}

	/*
	 * 関数名:printArray
	 * 概要:配列の要素を表示する
	 * 引数:optionalArray 任意の配列
	 * 戻り値:なし
	 * 作成者:M.Iizuka
	 * 作成日:2024/10/22
	 */
	public static void printArray(int[] optionalArray) {
		//配列の要素を表示する
		for (int lineIndex = 0; lineIndex < optionalArray.length; lineIndex++) {
			//要素の値を表示
			System.out.print(optionalArray[lineIndex] + " ");
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
		for (int lineIndex = 0; lineIndex < optionalArray.length; lineIndex++) {
			//列の要素の値を表示する
			for (int columnIndex = 0; columnIndex < optionalArray[lineIndex].length; columnIndex++) {
				//要素の値とインデントを揃えるための空白を表示
				System.out.print(
						optionalArray[lineIndex][columnIndex] + printSpace(optionalArray, lineIndex, columnIndex)
								+ " ");
			}
			//次の行の表示へ改行
			System.out.println("");
		}
	}

	/*
	 * 関数名:main
	 * 概要:int型の一元配列とint型の二次元配列の全要素の値を表示する
	 * 引数:なし
	 * 戻り値:なし
	 * 作成者:M.Iizuka
	 * 作成日:2024/10/24
	 */
	public static void main(String[] args) {
		//一元配列の生成を行うことを表示
		System.out.println("一元配列を生成します。");
		//一元配列の要素数(二次元配列の行数)
		int lineValue = 0;
		//一元配列の要素数を入力してもらう
		do {
			//要素数の入力
			lineValue = inputValue("要素数");
			//不正であれば繰り返す
		} while (checkPositiveInt(lineValue));
		//配列を生成
		int[] oneDimensionalArray = new int[lineValue];
		//配列の要素の値を入力
		inputElementValue(oneDimensionalArray);

		//二元配列の生成を行うことを表示
		System.out.println("\n二元配列を生成します。");
		//行の要素数を入力してもらう
		do {
			//要素数の入力
			lineValue = inputValue("行の要素数");
			//不正であれば繰り返す
		} while (checkPositiveInt(lineValue));
		//配列の行を生成
		int[][] binaryArray = new int[lineValue][];

		//二次元配列の列数
		int columnValue = 0;
		//配列の列数を入力してもらう
		for (int lineIndex = 0; lineIndex < binaryArray.length; lineIndex++) {
			//列の要素数を行数入力してもらう
			do {
				//要素数の入力
				columnValue = inputValue("binaryArray[" + lineIndex + "]の要素数");
				//不正であれば繰り返す
			} while (checkPositiveInt(columnValue));
			//一行の列を生成
			binaryArray[lineIndex] = new int[columnValue];
		}
		//配列の要素の値を入力
		inputElementValue(binaryArray);

		//一元配列の全要素の値を表示
		System.out.println("\n一元配列の全要素の値");
		//一元配列の全要素の値を表示
		printArray(oneDimensionalArray);
		//二元配列の全要素音値を表示
		System.out.println("\n二元配列の全要素の値");
		//二元配列の全要素の値を表示
		printArray(binaryArray);
	}

}