package Chapter06;

//入力ストリーム
import java.util.Scanner;

/*
 * クラス名:Exercise6_13
 * 概要:一つ目の配列の全要素を二つ目の配列に対して逆順にコピーするプログラム
 * 作成者:M.Iizuka
 * 作成日:2024/10/16
 */
public class Exercise6_13 {

	/*
	 * 関数名:main
	 * 概要:一つ目の配列の全要素を二つ目の配列に対して逆順にコピーする
	 * 引数:なし
	 * 戻り値:なし
	 * 作成者:M.Iizuka
	 * 作成日:2024/10/16
	 */
	public static void main(String[] args) {
		//入力値を抽出する
		Scanner standardInput = new Scanner(System.in);

		//要素数の変数
		int allElement = 0;
		//要素数を正しい数値で入力してもらう
		do {
			//要素数の入力を促す
			System.out.print("要素数：");
			//入力値を読み込む
			allElement = standardInput.nextInt();
			//入力値が不正な値の場合
			if (allElement <= 0) {
				//不正であることを表示
				System.out.println("正の整数を入力してください。");
			}
			//正しい数値が入力されるまで繰り返す
		} while (allElement <= 0);

		//コピー元の配列
		int[] firstArray = new int[allElement];
		//コピー先の配列
		int[] secondArray = new int[allElement];

		//コピー元の配列に値を読み込む
		for (int elementIndex = 0; elementIndex < allElement; elementIndex++) {
			//値の入力を促す
			System.out.print("firstArray[" + elementIndex + "] = ");
			//要素に値を読み込む
			firstArray[elementIndex] = standardInput.nextInt();
		}

		//コピー先の配列を逆順に並べ替える
		for (int elementIndex = 0; elementIndex < allElement / 2; elementIndex++) {
			//ソートのための変数に先の要素を代入
			int sortElement = firstArray[elementIndex];
			//先の要素に後の要素を代入
			firstArray[elementIndex] = firstArray[allElement - elementIndex - 1];
			//後の要素に先の要素を代入
			firstArray[allElement - elementIndex - 1] = sortElement;
		}

		//コピー元をコピー先に読み込む
		for (int elementIndex = 0; elementIndex < allElement; elementIndex++) {
			//配列をコピー
			secondArray[elementIndex] = firstArray[elementIndex];
		}

		//コピー先配列の要素の値を表示する
		for (int elementIndex = 0; elementIndex < allElement; elementIndex++) {
			//個々の要素の値を表示する
			System.out.println("secondArray[" + elementIndex + "] = " + secondArray[elementIndex]);
		}

	}

}
