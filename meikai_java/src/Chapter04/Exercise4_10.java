package Chapter04;

//入力ストリーム
import java.util.Scanner;

/*
 * クラス名:Exercise4_10
 * 概要:読み込んだ個数だけ*を表示するプログラム
 * ただし、値が１未満であれば改行文字を出力しない。
 * 作成者:M.Iizuka
 * 作成日:2024/10/08
 */
public class Exercise4_10 {

	/*
	 * 関数名:main
	 * 概要:読み込んだ個数だけ*を表示する
	 * 引数:なし
	 * 戻り値:なし
	 * 作成者:M.Iizuka
	 * 作成日:2024/10/08
	 */
	public static void main(String[] args) {
		//入力された値を抽出する
		Scanner standardInput = new Scanner(System.in);

		//表示させたい数を入力してもらう
		System.out.print("何個*を表示しますか：");
		//入力値を読み込む
		int inputNumber = standardInput.nextInt();
		//入力可能な整数の範囲の最小値
		int minimumNumber = 1;

		//入力値が正しい数値の場合
		if (inputNumber >= minimumNumber) {
			//入力された値の分だけ*を表示させる
			for (int indexNumber = 0; indexNumber < inputNumber; indexNumber++)
				//*を出力する
				System.out.print('*');
			//改行する
			System.out.println();
		}
	}

}
