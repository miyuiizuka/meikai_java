package Chapter06;

//入力ストリーム
import java.util.Scanner;

/*
 * クラス名:Exercise6_08
 * 概要:double型の配列の全要素の合計値と平均値を求めるプログラム
 * 作成者:M.Iizuka
 * 作成日:2024/10/15
 */
public class Exercise6_08 {

	/*
	 * 関数名:main
	 * 概要:double型の配列の全要素の合計値と平均値を求める
	 * 引数:なし
	 * 戻り値:なし
	 * 作成者:M.Iizuka
	 * 作成日:2024/10/15
	 */
	public static void main(String[] args) {
		//入力値を抽出する
		Scanner standardInput = new Scanner(System.in);

		//要素数の変数
		int allElement = 0;

		//要素数の入力が正しいか判定
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

		//配列の変数
		double[] doubleArray = new double[allElement];
		//配列の変数名
		String arrayName = "doubleArray";
		//配列の要素を入力してもらう
		for (int elementIndex = 0; elementIndex < allElement; elementIndex++) {
			//数値の入力を促す
			System.out.print(arrayName + "[" + elementIndex + "] = ");
			//入力値を読み込む
			doubleArray[elementIndex] = standardInput.nextDouble();
		}

		//合計値
		double sumElement = 0;
		//全要素の合計を算出
		for (double doubleArrayElement : doubleArray) {
			//各要素を加算していく
			sumElement += doubleArrayElement;
		}
		//平均値の算出
		double averageElement = sumElement / allElement;

		//算出した合計値を表示
		System.out.println("全要素の合計値は" + sumElement + "です。");
		//算出した平均値を表示
		System.out.println("全要素の平均値は" + averageElement + "です。");
	}

}
