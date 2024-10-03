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
		
		//余りを格納する変数を宣言する
		int remainderNumber = 0;
		
		
		//二つの整数値が正であるかどうかを判定する
		if ( firstNumber > 0 && secondNumber > 0) {
			//どちらも正である場合、一つ目の整数÷2つ目の整数の余りを算出する
			remainderNumber = firstNumber % secondNumber; 
			
			//二つ目の整数が一つ目の約数であるかを判別
			if ( remainderNumber == 0 ) {
				//約数である場合の結果を出力する
				System.out.println("BはAの約数です。");				
			//約数でない場合
			} else {
				//結果を出力する
				System.out.println("BはAの約数ではありません。");
			}
		
		//どちらかの整数値が正でない場合
		} else {
			//結果を出力する
			System.out.println("正の整数値を入力してください。");		
		}
		

	}

}
