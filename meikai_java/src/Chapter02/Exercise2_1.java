package Chapter02;

/*
 * クラス名:Exercise2_1
 * 概要:小数部をもつ実数値を変数に代入し出力するテスト
 * 作成者:M.Iizuka
 * 作成日:2024/10/01
 */
public class Exercise2_1 {

	/*
	 * 関数名:main
	 * 概要:小数部をもつ実数値を変数に代入し出力するテスト
	 * 引数:なし
	 * 戻り値:なし
	 * 作成者:M.Iizuka
	 * 作成日:2024/10/01
	 */
	public static void main(String[] args) {
		// int型の変数xの初期値を設定
		int x = 0;
		// int型の変数yの初期値を設定
		int y = 0;
		
		// xに小数をもつ実数値を代入
		x = 63.5;
		// yに小数をもつ実数値を代入
		y = 18.4;
		
		// xの値を表示
		System.out.println("xの値は" + x + "です。");
		// yの値を表示
		System.out.println("yの値は" + y + "です。");
		// 合計を表示
		System.out.println("合計は" + (x + y) + "です。");
		// 平均を表示
		System.out.println("平均は" + (x + y ) / 2 + "です。");

	}

}
