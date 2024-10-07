package Chapter03;

//入力ストリーム
import java.util.Scanner;

/*
 * クラス名:Exercise3_18
 * 概要:1～12の整数値を読み込み、それに対応した季節を表示するプログラム
 * 作成者:M.Iizuka
 * 作成日:2024/10/07
 */
public class Exercise3_18 {

	/*
	 * 関数名:main
	 * 概要:1～12の整数値を読み込み、それに対応した季節を表示する
	 * 引数:なし
	 * 戻り値:なし
	 * 作成者:M.Iizuka
	 * 作成日:2024/10/07
	 */
	public static void main(String[] args) {

		//入力された数値を抽出する
		Scanner standardInput = new Scanner(System.in);
		//整数値の入力を促す
		System.out.print("月を整数値で入力してください。\n整数値：");
		//入力された値を変数に格納する
		int inputNumber = standardInput.nextInt();

		//1月の定数
		final int JANUARY_NUMBER = 1;
		//2月の定数
		final int FEBRARY_NUMBER = 2;
		//3月の定数
		final int MARCH_NUMBER = 3;
		//4月の定数
		final int APRIL_NUMBER = 4;
		//5月の定数
		final int MAY_NUMBER = 5;
		//6月の定数
		final int JUNE_NUMBER = 6;
		//7月の定数
		final int JULY_NUMBER = 7;
		//8月の定数
		final int AUGUST_NUMBER = 8;
		//9月の定数
		final int SEPTEMBER_NUMBER = 9;
		//10月の定数
		final int OCTOBER_NUMBER = 10;
		//11月の定数
		final int NOVEMBER_NUMBER = 11;
		//12月の定数
		final int DECEMBER_NUMBER = 12;

		//春の定数
		final String SPRING_STRING = "春";
		//夏の定数
		final String SUMMER_STRING = "夏";
		//秋の定数
		final String AUTUMN_STRING = "秋";
		//冬の定数
		final String WINTER_STRING = "冬";

		//入力した月による季節の選択
		switch (inputNumber) {
		//3月
		case MARCH_NUMBER:
		//4月
		case APRIL_NUMBER:
		//5月
		case MAY_NUMBER:
			//季節を出力
			System.out.println(SPRING_STRING);
			//switch文を抜ける
			break;
		//6月
		case JUNE_NUMBER:
		//7月
		case JULY_NUMBER:
		//8月
		case AUGUST_NUMBER:
			//季節を出力
			System.out.println(SUMMER_STRING);
			//switch文を抜ける
			break;
		//9月
		case SEPTEMBER_NUMBER:
		//10月
		case OCTOBER_NUMBER:
		//11月
		case NOVEMBER_NUMBER:
			//季節を出力
			System.out.println(AUTUMN_STRING);
			//switch文を抜ける
			break;
		//12月
		case DECEMBER_NUMBER:
		//1月
		case JANUARY_NUMBER:
		//2月
		case FEBRARY_NUMBER:
			//季節を出力
			System.out.println(WINTER_STRING);
			//switch文を抜ける
			break;
		//1～12以外の数字が入力された場合
		default:
			//不正な数字であることを伝える
			System.out.println("1から12の整数値を入力してください。");
			//switch文を抜ける
			break;

		}
	}

}
