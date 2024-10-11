package Chapter06;

/*
 * クラス名:Exercise6‗03
 * 概要:要素型がdouble型で要素数が5の配列の要素に対して、
 * 先頭から順に1.1,2.2,3.3…を代入して表示するプログラム
 * 作成者:M.Iizuka
 * 作成日:2024/10/11
 */
public class Exercise6_03 {

	/*
	 * 関数名:main
	 * 概要:要素型がdouble型で要素数が5の配列の要素に対して、
	 * 先頭から順に1.1,2.2,3.3…を代入して表示するプログラム
	 * 引数:なし
	 * 戻り値:なし
	 * 作成者:M.Iizuka
	 * 作成日:2024/10/11
	 */
	public static void main(String[] args) {
		//配列の要素数を設定
		int sumArrayNumber = 9;
		//配列を用意
		double[] doubleArray = new double[sumArrayNumber];
		//要素の初期値を設定
		double elementNumber = 1.1;
		//要素の数値を求めるための変数
		double sumElementNumber = 0;

		//数値を順番に格納
		for (int arrayNumber = 0; arrayNumber < doubleArray.length; arrayNumber++) {
			//要素の値を求める
			sumElementNumber += elementNumber;
			//要素を取得する
			doubleArray[arrayNumber] = sumElementNumber;
			//数値を出力
			System.out.print("doubleArray[" + arrayNumber + "] = ");
			//数値の有効桁数を指定して出力
			System.out.printf("%2.1f\n", doubleArray[arrayNumber]);
		}

	}

}
