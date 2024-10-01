package Chapter02;

/*
 * クラス名:Exercise2_2
 * 概要:3つのint型変数に値を代入し、合計と平均を求めるプログラム
 * 作成者:M.Iizuka
 * 作成日:2024/10/01
 */
public class Exercise2_2 {

	/*
	 * 関数名:main
	 * 概要:3つのint型変数に値を代入し、合計と平均を求めるプログラム
	 * 引数:なし
	 * 戻り値:なし
	 * 作成者:M.Iizuka
	 * 作成日:2024/10/01
	 */
	public static void main(String[] args) {
		//int型変数1の初期値を設定
		int firstNumber = 0;
		//int型変数2の初期値を設定
		int secondNumber = 0;
		//int型変数3の初期値を設定
		int thirdNumber = 0;
		
		//変数1に値を代入
		firstNumber = 20;
		//変数2に値を代入
		secondNumber = 30;
		//変数3に値を代入
		thirdNumber =40;
		
		//変数1～3の合計を出力
		System.out.println("合計は" + (firstNumber + secondNumber + thirdNumber) + "です。");
		//変数1～3の平均を出力
		System.out.println("平均は" + (firstNumber + secondNumber + thirdNumber)/3 +"です。");
		
		
		
		

	}

}
