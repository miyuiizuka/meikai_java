package Chapter06;

/*
 * クラス名:Exercise6‗02
 * 概要:要素型がint型で要素数が5の配列の要素に対して、
 * 先頭から順に5,4,3,2,1を代入して表示するプログラム
 * 作成者:M.Iizuka
 * 作成日:2024/10/11
 */
public class Exercise6_02 {

	/*
	 * 関数名:main
	 * 概要:要素型がint型で要素数が5の配列の要素に対して、
	 * 先頭から順に5,4,3,2,1を代入して表示する
	 * 引数:なし
	 * 戻り値:なし
	 * 作成者:M.Iizuka
	 * 作成日:2024/10/11
	 */
	public static void main(String[] args) {
		//配列の要素数を設定
		int sumArrayNumber = 5;
		//配列を用意
		int[] integerArray = new int[sumArrayNumber];
		//要素の初期値を設定
		int elementNumber = integerArray.length;

		//要素を順番に格納
		for (int arrayNumber = 0; arrayNumber < integerArray.length; arrayNumber++) {
			//要素を取得
			integerArray[arrayNumber] = elementNumber;
			//次の要素を格納
			elementNumber--;
			//要素を出力
			System.out.println("integerArray[" + arrayNumber + "] = " + integerArray[arrayNumber]);
		}
	}

}
