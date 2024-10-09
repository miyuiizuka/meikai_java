package Chapter04;

//入力ストリーム
import java.util.Scanner;

/*
 * クラス名:Exercise4_17
 * 概要:読み込んだ整数値のすべての約数とその個数を表示するプログラム
 * 作成者:M.Iizuka
 * 作成日:2024/10/09
 */
public class Exercise4_17 {

	/*
	 * 関数名:main
	 * 概要:読み込んだ整数値のすべての約数とその個数を表示する
	 * 引数:なし
	 * 戻り値:なし
	 * 作成者:M.Iizuka
	 * 作成日:2024/10/09
	 * 
	 */
	public static void main(String[] args) {
		//入力された値を抽出する
		Scanner standardInput = new Scanner(System.in);

		//入力可能な数値の基準値を設定する
		final int INPUT_MINIMUM_NUMBER = 1;
		//入力された値
		int inputNumber = 0;

		//正しい数値が入力してもらう
		do {
			//整数値の入力を促す
			System.out.print("整数値：");
			//入力された値を読み込む
			inputNumber = standardInput.nextInt();
			//不正な値が入力された場合
			if (inputNumber < INPUT_MINIMUM_NUMBER) {
				//正しい数値を入力するよう促す
				System.out.println("正の整数値を入力してください。");
			}
			//正しい数値が入力されるまで繰り返す
		} while (inputNumber < INPUT_MINIMUM_NUMBER);

		//約数の個数の合計
		int sumDivisor = 0;

		//約数を表示する
		for (int indexNumber = 1; indexNumber <= inputNumber; indexNumber++) {
			//割り切れる場合
			if (inputNumber % indexNumber == 0) {
				//約数をカウント
				sumDivisor++;
				//約数を表示
				System.out.println(indexNumber);
			}
		}
		//約数の合計個数を表示
		System.out.println("約数は" + sumDivisor + "個です。");

	}

}
