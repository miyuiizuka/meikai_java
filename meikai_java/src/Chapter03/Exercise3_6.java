package Chapter03;

//入力ストリーム
import java.util.Scanner;

/*
 * クラス名:Exercise3_6
 * 概要:正の整数値を読み込み、10の倍数である場合とそうでない場合を表示するプログラム
 * 作成者:M.Iizuka
 * 作成日:2024/10/03
 */
public class Exercise3_6 {

	/*
	 * 関数名:main
	 * 概要:正の整数値を読み込み、10の倍数である場合とそうでない場合を表示する
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
		
		//倍数の値を格納する変数を宣言し、値を代入する
		int multipleNumber = 10;
		
		//入力された値が正の整数値であるかを判定する
		if ( inputInt > 0 ) {
			
			//指定した倍数の値で割り切れるかどうかを判定する
			if ( inputInt % multipleNumber == 0) {
				//割り切れる場合の結果を出力する
				System.out.println("その値は" + multipleNumber + "の倍数です。");
			//割り切れない場合
			} else {
				System.out.println("その値は" + multipleNumber + "の倍数ではありません。");
			}
			
		//入力された値が正の整数値でない場合
		} else {
			//結果を出力する
			System.out.println("正でない値が入力されました。");
		}		
				

	}

}
