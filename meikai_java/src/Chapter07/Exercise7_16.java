package Chapter07;

//入力ストリーム
import java.util.Scanner;

/*
 * クラス名:Exercise7_16
 * 概要:配列integerArrayの最小値を求めて表示する
 * 作成者:M.Iizuka
 * 作成日:2024/10/22
 */
public class Exercise7_16 {

	/*
	 * 関数名:minOf
	 * 概要:配列の要素の最小値を求める
	 * 引数:optionalArray 任意の配列
	 * 戻り値:配列の要素の最小値
	 * 作成者:M.Iizuka
	 * 作成日:2024/10/22
	 */
	public static int minOf(int[] optionalArray) {
		//配列の要素の最小値
		int minimumElement = optionalArray[0];
		//配列の要素の最小値を求める
		for (int elementIndex = 1; elementIndex < optionalArray.length; elementIndex++) {
			//前の要素より小さい場合
			if (optionalArray[elementIndex] < minimumElement) {
				//今の要素を最小値に設定
				minimumElement = optionalArray[elementIndex];
			}
		}
		//配列の要素の最小値を返す
		return minimumElement;
	}

	/*
	 * 関数名:main
	 * 概要:配列integerArrayの要素の最小値を求めて表示する
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

		//配列の要素の最小値を表示する
		System.out.println("\n最小値は" + minOf(integerArray) + "です。");
	}

}
