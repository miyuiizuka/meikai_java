package Chapter05;

/*
 * クラス名Exercise5_07 
 * 概要:0.0から1.0まで0.001おきに、その値と、その値の2乗を表示するプログラム
 * 作成者:M.Iizuka
 * 作成日:2024/10/11
 */
public class Exercise5_07 {

	/*
	 * 関数名:main
	 * 概要:0.0から1.0まで0.001おきに、その値と、その値の2乗を表示する
	 * 引数:なし
	 * 戻り値:なし
	 * 作成者:M.Iizuka
	 * 作成日:2024/10/11
	 */
	public static void main(String[] args) {
		//表の見出しを出力
		System.out.println("  値     " + "２乗した値");
		//表の見出しの下線を出力 
		System.out.println("--------------------");

		//表示する小数部の桁を設定
		int decimalNumber = 1000;

		//0.001おきに値とその二乗を表示する
		for (int integerNumber = 0; integerNumber <= decimalNumber; integerNumber++) {
			//0.001ずつ増えた値
			float floatNumber = (float) integerNumber / decimalNumber;
			//二乗した値
			int squaredNumber = integerNumber * integerNumber;
			//二乗した値を表示させるときの値
			float floatSquaredNumber = (float) squaredNumber / (decimalNumber * decimalNumber);
			//0.001ずつ増えた値を表示
			System.out.printf("%4.3f   ", floatNumber);
			//二乗した値を表示
			System.out.println(floatSquaredNumber);

		}

	}

}
