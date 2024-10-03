package Chapter03;

//入力ストリーム
import java.util.Scanner;

/*
 * クラス名:Exercise3_5
 * 概要:正の整数値を読み込み、5で割り切れる場合とそうでない場合の結果を出力するプログラム
 * 作成者:M.Iizuka
 * 作成日:2024/10/03
 */
public class Exercise3_5 {

	/*
	 * 関数名:main
	 * 概要:正の整数値を読み込み、5で割り切れる場合とそうでない場合の結果を出力する
	 * 引数:なし
	 * 戻り値:なし
	 * 作成者:M.Iizuka
	 * 作成日:2024/10/03
	 */
	public static void main(String[] args) {
		
		//キーボードから読み込んだ値を抽出する
		Scanner standardInput = new Scanner(System.in);
		//整数値の入力を促す
		System.out.print("整数値：");
		//入力された値を読み込む
		int inputInt = standardInput.nextInt();
		
		//割る数を格納する変数を宣言し、値を代入する
		int divideNumber = 5;
		
		//入力された値が正の整数値であるかを判定する
		if ( inputInt > 0 ) {
			
			//割り切れるかどうかを判定する
			if ( inputInt % divideNumber == 0) {
				//割り切れる場合の結果を出力する
				System.out.println("その値は" + divideNumber + "で割り切れます。");
			//割り切れない場合
			} else {
				System.out.println("その値は" + divideNumber + "で割り切れません。");
			}
			
		//入力された値が正の整数値でない場合
		} else {
			//結果を出力する
			System.out.println("正でない値が入力されました。");
		}
		
	}

}
