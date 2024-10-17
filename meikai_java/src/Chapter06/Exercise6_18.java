package Chapter06;

//入力ストリーム
import java.util.Scanner;

/*
 * クラス名:Exercise6_18
 * 概要:行数・各行の列数・各要素の値をキーボードから読み込み、凸凹な２次元配列を作るプログラム
 * 作成者:M.Iizuka
 * 作成日:2024/10/17
 */
public class Exercise6_18 {

	/*
	 * 関数名:main
	 * 概要:行数・各行の列数・各要素の値をキーボードから読み込み、凸凹な２次元配列を作る
	 * 引数:なし
	 * 戻り値:なし
	 * 作成者:M.Iizuka
	 * 作成日:2024/10.17
	 */
	public static void main(String[] args) {
		//入力値を抽出する
		Scanner standardInput = new Scanner(System.in);

		//配列の行数
		int arrayLine = 0;
		//各行の列数
		int lineColumn = 0;

		//配列の行数を入力してもらう
		do {
			//行数の入力を促す
			System.out.print("配列の行数：");
			//入力値を読み込む
			arrayLine = standardInput.nextInt();
			//不正な値が入力された場合
			if (arrayLine <= 0) {
				//不正であることを表示
				System.out.println("正の整数値を入力してください。");
			}
			//適切な値が入力されるまで入力処理を繰り返す
		} while (arrayLine <= 0);

		//凸凹配列を生成
		int[][] unevennessArray = new int[arrayLine][];
		//配列名
		String arrayName = "unevennessArray";

		//改行し各行の列数入力を行う
		System.out.println("");
		//各行の列数を入力してもらうことを表示
		System.out.println("各行の列数を入力してください。");
		//各行の列数を入力してもらう
		for (int lineIndex = 0; lineIndex < arrayLine; lineIndex++) {
			//入力値が正しいか確認
			do {
				//各行の列数の入力を促す
				System.out.print("unevennessArray[" + lineIndex + "] = ");
				//入力値を読み込む
				lineColumn = standardInput.nextInt();
				//不正な値が入力された場合
				if (lineColumn <= 0) {
					//不正であることを表示
					System.out.println("正の整数値を入力してください。");
				}
				//適切な値が入力されるまで入力処理を繰り返す
			} while (lineColumn <= 0);
			//各行の列数を生成
			unevennessArray[lineIndex] = new int[lineColumn];
		}

		//改行し各要素の値の入力を行う
		System.out.println("");
		//各要素の値を入力してもらうことを表示
		System.out.println("各要素の値を入力してください。");
		//各行の値を入力してしもらう
		for (int lineIndex = 0; lineIndex < unevennessArray.length; lineIndex++) {
			//各要素の値を入力してもらう
			for (int columnIndex = 0; columnIndex < unevennessArray[lineIndex].length; columnIndex++) {
				//各要素の値の入力を促す
				System.out.print(arrayName + "[" + lineIndex + "][" + columnIndex + "] = ");
				//入力値を読み込む
				unevennessArray[lineIndex][columnIndex] = standardInput.nextInt();
			}
			//改行し次の行の要素の入力を行う
			System.out.println("");
		}

		//改行し全要素の値の表示
		System.out.println("");
		//行の要素を走査する
		for (int[] lineIndex : unevennessArray) {
			//列の要素を走査する
			for (int columnIndex : lineIndex) {
				//要素の値を出力する
				System.out.print(columnIndex + "\t");
			}
			//改行し次の行の要素の走査を行う
			System.out.println("");
		}
	}

}
