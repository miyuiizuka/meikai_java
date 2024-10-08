package Chapter04;

//入力ストリーム
import java.util.Scanner;

/*
 * クラス名:Exercise4_09
 * 概要:正の整数値を読み込み、１から入力された値までの積を求めるプログラム
 * 作成者:M.Iizuka
 * 作成日:2024/10/08
 */
public class Exercise4_09 {

	/*
	 * 関数名:main
	 * 概要:正の整数値を読み込み、１から入力された値までの積を求める
	 * 引数:なし
	 * 戻り値:なし
	 * 作成者:M.Iizuka
	 * 作成日:2024/10/08
	 */
	public static void main(String[] args) {
		//入力された値を抽出する
		Scanner standardInput = new Scanner(System.in);
		//入力可能な数値の基準値を設定する
		final int INPUT_MINIMUM_NUBER = 0;
		//入力された値
		int inputNumber = 0;

		//正しい数値が入力してもらう
		do {
			//整数値の入力を促す
			System.out.print("nの値：");
			//入力された値を読み込む
			inputNumber = standardInput.nextInt();
			//不正な値が入力された場合
			if (inputNumber <= INPUT_MINIMUM_NUBER) {
				//正しい数値を入力するよう促す
				System.out.println("正の整数値を入力してください。");
			}
			//正しい数値が入力されるまで繰り返す
		} while (inputNumber <= INPUT_MINIMUM_NUBER);

		//積
		int productNumber = 1;
		//積を求めたい最小の整数値
		int minimumNumber = 1;

		//入力された値までの積を求める
		while (minimumNumber <= inputNumber) {
			//一つ前の整数との積
			productNumber *= minimumNumber;
			//かける値を一つ後の整数とする
			minimumNumber++;
		}
		//計算結果を出力する
		System.out.println("1から" + inputNumber + "までの積は" + productNumber + "です。");

	}

}
