package Chapter04;

//入力ストリーム
import java.util.Scanner;

/*
 * クラス名:Exercise4_25_2
 * 概要:読み込んだ整数の合計と平均を求めるプログラム（4－18の書き換え）
 * 作成者:M.Iizuka
 * 作成日:2024/10/10
 */
public class Exercise4_25_2 {
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
		//合計の最大値
		int maxSumNumber = 1000;
		//平均を求めるための個数
		int averageNumber = 0;
		
		//合計値を算出する
		for (int plusNumber = 0; plusNumber < sumPlusNumber; plusNumber++) {
			//加算する整数値の入力を促す
			System.out.print("整数：");
			//加算する整数値を読み込む
			int inputNumber = standardInput.nextInt();
			//合計値が基準値をこえた場合
			if (sumNumber + inputNumber > maxSumNumber) {
				//合計の最大値をこえたことを表示
				System.out.println("合計が1,000を超えました。");
				//現在の加算する数値の処理を表示
				System.out.println("最後の数値は無視します。");
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
		//平均値を表示する
		System.out.println("平均は" + sumNumber / averageNumber + "です。");
	}

}
