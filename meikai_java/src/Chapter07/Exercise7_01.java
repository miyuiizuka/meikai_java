package Chapter07;

//入力ストリーム
import java.util.Scanner;

/*
 * クラス名:Exercise7_01
 * 概要:整数値を入力し、負・0・正を判別するプログラム
 * 作成者:M.Iizuka
 * 作成日:2024/10/17
 */
public class Exercise7_01 {

	/*
	 * 関数名:signOf
	 * 概要:受け取ったint型の値が負であれば-1、0であれば0、正であれば1を返却する
	 * 引数:inputNumber 入力された整数値
	 * 戻り値:signNumber 判別した番号
	 * 作成者:M.Iizuka
	 * 作成日:2024/10/17
	 */
	public static int signOf(int inputNumber) {
		//負の番号
		final int NEGATIVE_SIGN = -1;
		//0の番号
		final int ZERO_SIGN = 0;
		//正の番号
		final int POSITIVE_SIGN = 1;
		//判別した番号
		int signNumber = 0;

		//負の場合
		if (inputNumber < 0) {
			//負の番号を判別番号にする
			signNumber = NEGATIVE_SIGN;
			//0の場合
		} else if (inputNumber == 0) {
			//0の番号を判別番号にする
			signNumber = ZERO_SIGN;
			//正の場合
		} else {
			//正の番号を判別番号にする
			signNumber = POSITIVE_SIGN;
		}
		//判別した番号を返却する
		return signNumber;
	}

	/*
	 * 関数名:main 
	 * 概要:整数値を入力し、負・0・正を判別した結果を表示する
	 * 引数:なし
	 * 戻り値:なし
	 * 作成者:M.Iizuka
	 * 作成日:2024/10/17
	 */
	public static void main(String[] args) {
		//入力値を抽出する
		Scanner standardInput = new Scanner(System.in);
		//整数の入力を促す
		System.out.print("整数を入力してください：");
		//入力値を読み込む
		int inputNumber = standardInput.nextInt();
		//負・0・正を判別する
		int signNumber = signOf(inputNumber);
		//判別番号を表示する
		System.out.println(signNumber);

	}

}
