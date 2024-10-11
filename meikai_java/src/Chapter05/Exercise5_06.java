package Chapter05;

/*
 * クラス名Exercise5_06
 * 概要:float型の変数を0.0から1.0まで0.001ずつ増やしていく様子と、
 * int型の変数を0から1000までインクリメントした値を1000で割った値を求める様子を、
 * 横に並べて表示するプログラム
 * 作成者:M.Iizuka
 * 作成日:2024/10/11
 */
public class Exercise5_06 {

	/*
	 * 関数名:main
	 * 概要:float型の変数を0.0から1.0まで0.001ずつ増やしていく様子と、
	 * int型の変数を0から1000までインクリメントした値を1000で割った値を求める様子を、
	 * 横に並べて表示する
	 * 引数:なし
	 * 戻り値:なし
	 * 作成者:M.Iizuka
	 * 作成日:2024/10/11
	 */
	public static void main(String[] args) {
		//表の見出しを出力
		System.out.println("  float     " + "   int   ");
		//表の見出しの下線を出力
		System.out.println("---------------------");
		//float型の合計
		float sumFloatNumber = 0.0F;
		//int型の計算後の数値
		double calculateIntegerNumber = 0;
		//int型のインクリメントする変数の初期値を設定
		int integerNumber = 0;
		//int型変数をどこまでインクリメントするか設定
		int lastIntegerNumber = 1000;
		//int型変数を割るときの値
		int divideIntegerNumber = 1000;

		//float型の変数の様子を表示
		for (float floatNumber = 0.0F; floatNumber <= 1.0F; floatNumber += 0.001F) {
			//float型の合計を算出
			sumFloatNumber = floatNumber;
			//float型の合計を出力
			System.out.printf("%8.7f", sumFloatNumber);
			//float型とint型の数値の間の余白を出力
			System.out.print("   ");
			//int型の変数の様子を表示
			if (integerNumber <= lastIntegerNumber) {
				//int型の合計を算出
				calculateIntegerNumber = (double) integerNumber / divideIntegerNumber;
				//int型の合計を出力
				System.out.printf("%8.7f\n", calculateIntegerNumber);
				//インクリメント
				integerNumber++;
			}

		}

	}

}
