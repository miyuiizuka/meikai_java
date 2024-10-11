package Chapter06;

/*
 * クラス名:Exercise6_01
 * 概要:要素型がdouble型で要素数が5の配列を生成して、その全要素の値を表示するプログラム
 * 作成者:M.Iizuka
 * 作成日:2024/10/11
 */
public class Exercise06_01 {

	/*
	 * 関数名:main
	 * 概要:要素型がdouble型で要素数が5の配列を生成して、その全要素の値を表示する
	 * 引数:なし
	 * 戻り値:なし
	 * 作成者:M.Iizuka
	 * 作成日:2024/10/11
	 */
	public static void main(String[] args) {
		//配列の要素数を設定
		int sumArrayNumber = 5;
		//配列の要素に格納する値の初期値を設定
		double elementNumber = 0;
		//double型の配列の宣言
		double[] doubleArray = new double[sumArrayNumber];

		//配列に要素を順番に格納
		for (int arrayNumber = 0; arrayNumber < sumArrayNumber; arrayNumber++) {
			//配列に要素を格納
			doubleArray[arrayNumber] = ++elementNumber;
		}
		//配列の要素を順番に表示
		for (int arrayNumber = 0; arrayNumber < sumArrayNumber; arrayNumber++) {
			//配列の要素を表示
			System.out.println(doubleArray[arrayNumber]);
		}

	}

}
