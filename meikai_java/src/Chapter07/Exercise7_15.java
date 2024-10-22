package Chapter07;

//入力ストリーム
import java.util.Scanner;

/*
 * クラス名:Exercise7_15
 * 概要:配列integerArrayの全要素の合計を求めて表示する
 * 作成者:M.Iizuka
 * 作成日:2024/10/22
 */
public class Exercise7_15 {

	/*
	 * 関数名:sumOf
	 * 概要:配列の全要素の合計を求める
	 * 引数:optionalArray 任意の配列
	 * 戻り値:全要素の合計値
	 * 作成者:M.Iizuka
	 * 作成日:2024/10/22
	 */
	public static int sumOf(int[] optionalArray) {
		//全要素の合計値
		int sumElement = 0;
		//全要素の合計を求める
		for (int arrayElement : optionalArray) {
			sumElement += arrayElement;
		}
		//全要素の合計値を返す
		return sumElement;
	}

	/*
	 * 関数名:main
	 * 概要:配列integerArrayの全要素の合計を求めて表示する
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

		//配列の全要素の合計を表示する
		System.out.println("\n全要素の合計は" + sumOf(integerArray) + "です。");
	}
}
