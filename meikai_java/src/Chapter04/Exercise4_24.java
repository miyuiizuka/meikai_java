package Chapter04;

//入力ストリーム
import java.util.Scanner;

/*
 * クラス名:Exercise4_24
 * 概要:正の整数値を読み込み、素数であるかを判定するプログラム
 * 作成者:M.Iizuka
 * 作成日:2024/10/10
 */
public class Exercise4_24 {

	/*
	 * 関数名:main
	 * 概要:正の整数値を読み込み、素数であるかを判定する
	 * 引数:なし
	 * 戻り値:なし
	 * 作成者:M.Iizuka
	 * 作成日:2024/10/10
	 */
	public static void main(String[] args) {
		//入力値を抽出する
		Scanner standardInput = new Scanner(System.in);

		//入力可能な数値の基準値を設定する
		final int INPUT_MINIMUM_NUMBER = 1;
		//入力値
		int inputNumber = 0;
		//正の整数値を入力してもらう
		do {
			//整数値の入力を促す
			System.out.print("整数値：");
			//入力された値を読み込む
			inputNumber = standardInput.nextInt();
			//不正な値が入力された場合
			if (inputNumber <= INPUT_MINIMUM_NUMBER) {
				//正しい値を入力してもらうよう促す
				System.out.println("2以上の整数値を入力してください。");
			}
			//正しい値が入力されるまで処理を続ける
		} while (inputNumber <= INPUT_MINIMUM_NUMBER);

		//素数かどうかを判定する
		for (int divideNumber = 2; divideNumber <= inputNumber; divideNumber++) {
			//素数の場合
			if (divideNumber == inputNumber) {
				//結果を表示する
				System.out.println("素数です。");
				//素数でない場合（割れた時）
			} else if (inputNumber % divideNumber == 0) {
				//結果を表示する
				System.out.println("素数ではありません。");
				//処理終了
				break;

			}

		}

	}
}
