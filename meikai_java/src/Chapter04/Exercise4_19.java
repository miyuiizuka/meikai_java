package Chapter04;

//入力ストリーム
import java.util.Scanner;

/*
 * クラス名:Exercise4_19
 * 概要:季節を求めるプログラム
 * 作成者:M.Iizuka
 * 作成日:2024/10/09
 */
public class Exercise4_19 {

	/*
	 * 関数名:main
	 * 概要:季節を求める、ただし1～12以外の値は再入力させる
	 * 引数:なし
	 * 戻り値:なし
	 * 作成者:M.Iizuka
	 * 作成日:2024/10/09
	 */
	public static void main(String[] args) {
		//入力値を抽出する
		Scanner standardInput = new Scanner(System.in);

		//再処理する
		final int RETRY_NUMBER = 1;
		//処理終了
		final int COMPLETE_NUMBER = 0;
		//もう一度処理を行うか
		int retryNumber = 0;

		//1月
		final int JANUARY_NUMBER = 1;
		//2月
		final int FEBRARY_NUMBER = 2;
		//3月
		final int MARCH_NUMBER = 3;
		//4月
		final int APRIL_NUMBER = 4;
		//5月
		final int MAY_NUMBER = 5;
		//6月
		final int JUNE_NUMBER = 6;
		//7月
		final int JULY_NUMBER = 7;
		//8月
		final int AUGUST_NUMBER = 8;
		//9月
		final int SEPTEMBER_NUMBER = 9;
		//10月
		final int OCTOBER_NUMBER = 10;
		//11月
		final int NOVEMBER_NUMBER = 11;
		//12月
		final int DECEMBER_NUMBER = 12;

		//入力された月
		int monthNumber = 1;

		//季節を求める
		do {
			//正しい数値を入力してもらう
			do {
				//月の入力を促す
				System.out.print("季節を求めます。\n何月ですか：");
				//何月か読み込む
				monthNumber = standardInput.nextInt();
				//不正な入力の場合
				if (monthNumber < JANUARY_NUMBER || monthNumber > DECEMBER_NUMBER) {
					//正しい入力を促す
					System.out.println(JANUARY_NUMBER + "～" + DECEMBER_NUMBER + "の値を入力してください。");
				}
				//正しい入力値となるまで処理を続ける
			} while (monthNumber < JANUARY_NUMBER || monthNumber > DECEMBER_NUMBER);

			//3月～5月の場合
			if (monthNumber >= MARCH_NUMBER && monthNumber <= MAY_NUMBER) {
				//季節を表示
				System.out.println("それは春です。");
				//6月～8月の場合
			} else if (monthNumber >= JUNE_NUMBER && monthNumber <= AUGUST_NUMBER) {
				//季節を表示
				System.out.println("それは夏です。");
				//9月～11月の場合
			} else if (monthNumber >= SEPTEMBER_NUMBER && monthNumber <= NOVEMBER_NUMBER) {
				//季節を表示
				System.out.println("それは秋です。");
				//12月～2月の場合
			} else if (monthNumber == DECEMBER_NUMBER || monthNumber == JANUARY_NUMBER
					|| monthNumber == FEBRARY_NUMBER) {
				//季節を表示
				System.out.println("それは冬です。");
			}

			//再処理するか
			do {
				//もう一度行うか入力を促す
				System.out.print("もう一度？ 1…Yes／0…No：");
				//再処理を行うか読み込む
				retryNumber = standardInput.nextInt();
				//不正な入力の場合
				if (!(retryNumber == RETRY_NUMBER || retryNumber == COMPLETE_NUMBER)) {
					//正しい入力を促す
					System.out.println(RETRY_NUMBER + "もしくは" + COMPLETE_NUMBER + "を入力してください。");
				}
				//正しい入力値となるまで処理を続ける
			} while (!(retryNumber == RETRY_NUMBER || retryNumber == COMPLETE_NUMBER));

			//処理終了の番号が入力されるまで処理を続ける
		} while (retryNumber == RETRY_NUMBER);

	}

}
