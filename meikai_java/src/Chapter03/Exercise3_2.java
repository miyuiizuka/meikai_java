package Chapter03;

//入力ストリーム
import java.util.Scanner;

/*
 * クラス名:Exercise3_2
 * 概要:二つの正の整数値を読み込み、後者が前者の約数である場合、そうでない場合の文章を表示するプログラム
 * 作成者:M.Iizuka
 * 作成日:2024/10/03
 */
public class Exercise3_2 {

	/*
	 * 関数名:main
	 * 概要:2つの正の整数値を読み込み、後者が前者の約数である場合、そうでない場合の文章を表示する
	 * 引数:なし
	 * 戻り値:なし
	 * 作成者:M.Iizuka
	 * 作成日:2024/10.03
	 */
	public static void main(String[] args) {
		
		//キーボードから読み込んだ値を抽出する
		Scanner standardInput = new Scanner(System.in);
		
		//一つ目の整数値の入力を促す
		System.out.print("整数A：");
		//一つ目の整数値を変数に格納する
		int firstNumber = standardInput.nextInt();
		//二つ目の整数値の入力を促す
		System.out.print("整数B：");
		//二つ目の整数値を変数に格納する
		int secondNumber = standardInput.nextInt();
		
		//二つ目の整数が1つ目の約数であるかを判別
		if ( firstNumber % secondNumber ==0 ) {
			//約数である場合の結果を出力する
			System.out.println("BはAの約数です。");
			
		//約数でない場合
		} else {
			//結果を出力する
			System.out.println("BはAの約数ではありません。");
		}
		

	}

}
