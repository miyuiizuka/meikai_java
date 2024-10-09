package Chapter04;

//入力ストリーム
import java.util.Scanner;

/*
 * クラス名:Exercise4_16
 * 概要:読み込んだ個数だけ*を表示するプログラム
 * 作成者:M.Iizuka
 * 作成日:2024/10/09
 */
public class Exercise4_16 {

	/*
	 * 関数名:main
	 * 概要:読み込んだ個数だけ*を表示するプログラム
	 * ただし5個表示するごとに改行する。
	 * 引数:なし
	 * 戻り値:なし
	 * 作成者:M.Iizuka
	 * 作成日:2024/10/09
	 */
	public static void main(String[] args) {
		//入力された値を抽出する
		Scanner standardIput = new Scanner(System.in);

		//入力可能な数値の基準値を設定する
		final int INPUT_MINIMUM_NUMBER = 0;
		//入力された値
		int inputNumber = 0;
		//正しい数値を入力してもらう
		do {
			//何個表示させるか数値の入力を促す
			System.out.print("何個*を表示しますか：");
			//入力された値を読み込む
			inputNumber = standardIput.nextInt();
			//入力された値が負の数でないか
		} while (inputNumber < INPUT_MINIMUM_NUMBER);

		//何個ずつで改行するか設定する
		int newLineNumber = 5;

		//指定された分だけ*を表示する
		for (int indexNumber = 1; indexNumber <= inputNumber; indexNumber++) {
			//*を表示する
			System.out.print('*');
			//改行指定した個数の場合
			if (indexNumber % newLineNumber == 0) {
				//改行する
				System.out.println();
			}
		}

	}

}
