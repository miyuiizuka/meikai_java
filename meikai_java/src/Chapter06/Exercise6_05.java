package Chapter06;

//入力ストリーム
import java.util.Scanner;

/*
 * クラス名:Exercise6_5
 * 概要:配列の要素数と、個々の要素の値を読み込んで、右のように各要素の値を表示するプログラム
 * 作成者:M.Iizuka
 * 作成日:2024/10/15
 */
public class Exercise6_05 {

	/*
	 * 関数名:main
	 * 概要:配列の要素数と、個々の要素の値を読み込んで、右のように各要素の値を表示する
	 * 引数:なし
	 * 戻り値:なし
	 * 作成者:M.Iizuka
	 * 作成日:2024/10/15
	 */
	public static void main(String[] args) {
		//入力値を抽出する
		Scanner standardInput = new Scanner(System.in);

		//要素数の変数
		int inputSumElement = 0;

		//配列の変数名
		String arrayName = "integerArray";

		//要素数の入力が正しいか判定
		do {
			//要素数の入力を促す
			System.out.print("要素数：");
			//入力値を読み込む
			inputSumElement = standardInput.nextInt();
			//入力値が不正な値の場合
			if (inputSumElement <= 0) {
				//不正であることを表示
				System.out.println("正の整数を入力してください。");
			}
			//正しい数値が入力されるまで繰り返す
		} while (inputSumElement <= 0);

		//配列の変数
		int[] integerArray = new int[inputSumElement];
		
		//配列の要素を取得する
		for (int elementIndex = 0; elementIndex < inputSumElement; elementIndex++) {
			//個々の要素の値の入力を促す
			System.out.print(arrayName + "[" + elementIndex + "] = ");
			//入力値を読み込む
			integerArray[elementIndex] = standardInput.nextInt();
		}
		//配列の全要素の値を表示する
		System.out.print(arrayName + " = {");
		//個々の要素の値を表示する
		for (int elementIndex = 0; elementIndex < inputSumElement; elementIndex++) {
			//個々の要素の値を表示する
			System.out.print(integerArray[elementIndex]);
			//最後の要素でないときの表示
			if (elementIndex != (inputSumElement - 1)) {
				//カンマをつける
				System.out.print(", ");
				//最後の要素のときの表示
			} else {
				//カッコを閉じる
				System.out.print("}");
			}
		}
	}

}
