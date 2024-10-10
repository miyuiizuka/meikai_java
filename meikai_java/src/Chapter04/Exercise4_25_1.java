package Chapter04;

//入力ストリーム
import java.util.Scanner;

/*
 * クラス名:Exercise4_25_1
 * 概要:読み込んだ整数の合計と平均を求めるプログラム（4－17の書き換え）
 * 作成者:M.Iizuka
 * 作成日:2024/10/10
 */
public class Exercise4_25_1 {
	/*
	 * 関数名:main
	 * 概要::読み込んだ整数の合計と平均を求める
	 * 引数:なし
	 * 戻り値:なし
	 * 作成者:M.Iizuka
	 * 作成日:2024/10/10
	 */
	public static void main(String[] args) {
		//入力された値を抽出する
		Scanner standardInput = new Scanner(System.in);

		//処理の説明を表示
		System.out.println("整数を加算します。");

		//入力可能な数値の基準値を設定する
		final int INPUT_MINIMUM_NUMBER = 0;
		//入力値
		int sumPlusNumber = 0;
		//正の整数値を入力してもらう
		do {
			//加算する個数の入力を促す
			System.out.print("何個加算しますか：");
			//加算する個数を読み込む
			sumPlusNumber = standardInput.nextInt();
			//不正な値が入力された場合
			if (sumPlusNumber <= INPUT_MINIMUM_NUMBER) {
				//正しい値を入力してもらうよう促す
				System.out.println("正の整数値を入力してください。");
			}
			//正しい値が入力されるまで処理を続ける
		} while (sumPlusNumber <= INPUT_MINIMUM_NUMBER);

		//合計値
		int sumNumber = 0;
		//終了値
		final int END_NUMBER = 0;
		//平均を求めるための個数
		int averageNumber = 0;

		//合計値を算出する
		for (int plusNumber = 0; plusNumber < sumPlusNumber; plusNumber++) {
			//加算する整数値の入力を促す
			System.out.print("整数（0で終了）：");
			//加算する整数値を読み込む
			int inputNumber = standardInput.nextInt();
			//0が入力された場合
			if (inputNumber == END_NUMBER) {
				//処理終了
				break;
			}
			//合計値を算出する
			sumNumber += inputNumber;
			//平均を求めるための個数としてカウント
			averageNumber++;

		}
		//合計値を表示する
		System.out.println("合計は" + sumNumber + "です。");
		//平均の個数が0の場合
		if (averageNumber == 0) {
			//結果を表示する
			System.out.println("平均は求められませんでした。");
			//平均の個数が0でない場合
		} else {
			//平均値を表示する
			System.out.println("平均は" + sumNumber / averageNumber + "です。");
		}

	}

}
