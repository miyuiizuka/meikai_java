package Chapter06;

//入力ストリーム
import java.util.Scanner;

/*
 * クラス名:Exercise6_16
 * 概要:4行3列の行列と3行4列の行列の積を求めるプログラム
 * 作成者:M.Iizuka
 * 作成日:2024/10/16
 */
public class Exercise6_16 {

	/*
	 * 関数名:main
	 * 概要:4行3列の行列と3行4列の行列の積を求める
	 * 引数:なし
	 * 戻り値:なし
	 * 作成者:M.Iizuka
	 * 作成日:2024/10/16
	 */
	public static void main(String[] args) {
		//入力値を抽出する
		Scanner standardInput = new Scanner(System.in);

		//一つ目の配列の行数
		int firstLine = 4;
		//一つ目の配列の列数
		int firstColumn = 3;
		//二つ目の配列の行数
		int secondLine = 3;
		//二つ目の配列の列数
		int secondColumn = 4;

		//4行3列の配列
		int[][] firstArray = new int[firstLine][firstColumn];
		//3行4列の配列
		int[][] secondArray = new int[secondLine][secondColumn];
		//行列の積の配列
		int[][] productArray = new int[firstLine][secondColumn];

		//一つ目の配列の各行の要素
		for (int lineIndex = 0; lineIndex < firstLine; lineIndex++) {
			//一つ目の配列の各列の要素
			for (int columnIndex = 0; columnIndex < firstColumn; columnIndex++) {
				//各要素の入力を促す
				System.out.print("firstArray[" + lineIndex + "][" + columnIndex + "]=");
				//入力値を読み込む
				firstArray[lineIndex][columnIndex] = standardInput.nextInt();
			}
		}
		//二つ目の配列の各行の要素
		for (int lineIndex = 0; lineIndex < secondLine; lineIndex++) {
			//二つ目の配列の各列の要素
			for (int columnIndex = 0; columnIndex < secondColumn; columnIndex++) {
				//各要素の入力を促す
				System.out.print("secondArray[" + lineIndex + "][" + columnIndex + "]=");
				//入力値を読み込む
				secondArray[lineIndex][columnIndex] = standardInput.nextInt();
			}
		}

		//各要素の積
		int productElement = 0;

		//行列の積の配列の行
		for (int lineIndex = 0; lineIndex < firstLine; lineIndex++) {
			//行列の積の配列の列
			for (int columnIndex = 0; columnIndex < secondColumn; columnIndex++) {
				//各要素の積の和を代入するための変数
				int sumElement = 0;
				//行列の積の配列の列
				for (int productIndex = 0; productIndex < secondLine; productIndex++) {
					//各要素の積
					productElement = firstArray[lineIndex][productIndex]
							* secondArray[productIndex][columnIndex];
					//各要素の積の和（行列の積の配列の要素の値）
					sumElement += productElement;
				}
				//行列の積の要素の値を読み込む
				productArray[lineIndex][columnIndex] = sumElement;
			}
		}

		//一つ目の配列の要素の値を表示
		System.out.println("\n4行3列の行列");
		//行の要素
		for (int lineIndex = 0; lineIndex < firstLine; lineIndex++) {
			//列の要素
			for (int columnIndex = 0; columnIndex < firstColumn; columnIndex++) {
				//要素の値を表示
				System.out.printf("%d\t",firstArray[lineIndex][columnIndex]);
			}
			//1行の要素出力が終了したら改行
			System.out.println();
		}
		//二つ目の配列の要素の値を表示
		System.out.println("\n3行4列の行列");
		//行の要素
		for (int lineIndex = 0; lineIndex < secondLine; lineIndex++) {
			//列の要素
			for (int columnIndex = 0; columnIndex < secondColumn; columnIndex++) {
				//要素の値を表示
				System.out.printf("%d\t",secondArray[lineIndex][columnIndex]);
			}
			//1行の要素出力が終了したら改行
			System.out.println();
		}
		//行列の積の配列の要素の値を表示
		System.out.println("\n行列の積");
		//行の要素
		for (int lineIndex = 0; lineIndex < firstLine; lineIndex++) {
			//列の要素
			for (int columnIndex = 0; columnIndex < secondColumn; columnIndex++) {
				//要素の値を表示
				System.out.printf("%d\t",productArray[lineIndex][columnIndex]);
			}
			//1行の要素出力が終了したら改行
			System.out.println();
		}
	}

}

