package Chapter02;

//乱数の入力ストリーム
import java.util.Random;

/*
 * クラス名:Exercise2_7
 * 概要:1桁の正の整数値、1桁の負の整数値、2桁の正の整数値をランダムに生成して表示するプログラム
 * 作成者:M.Iizuka
 * 作成日:2024/10/02
 */
public class Exercise2_7 {

	/*
	 * 関数名:main
	 * 概要:1桁の正の整数値、1桁の負の整数値、2桁の正の整数値をランダムに生成して表示する
	 * 引数:なし
	 * 戻り値:なし
	 * 作成者:M.Iizuka
	 * 作成日:2024/10/02
	 */
	public static void main(String[] args) {
		
		//乱数を抽出するための変数を宣言する
		Random randomNumber = new Random();
		
		//抽出した乱数を読み込み、変数に1から9のいずれかを格納する
		int singleDigitNumber = randomNumber.nextInt(9) + 1;
		
		//抽出した乱数を読み込み、変数に-9から-1のいずれかを格納する
		int negativeSingleDigitNumber = randomNumber.nextInt(9) - 9;
		
		//抽出した乱数を読み込み、変数に10から99のいずれかを格納する
		int twoDigitNumber = randomNumber.nextInt(90) + 10;
		
		//1桁の正の整数値を表示する
		System.out.println( singleDigitNumber );
		//1桁の負の整数値を表示する
		System.out.println( negativeSingleDigitNumber );
		//2桁の正の整数値を表示する
		System.out.println( twoDigitNumber );

	}

}
