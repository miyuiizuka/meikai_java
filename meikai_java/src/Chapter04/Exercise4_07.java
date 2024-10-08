package Chapter04;

//入力ストリーム
import java.util.Scanner;

/*
 * クラス名:Exercise4_07
 * 概要:読み込んだ値の個数だけ記号文字*と+を交互に表示するプログラム
 * 作成者:M.Iizuka
 * 作成日:2024/10/08
 */
public class Exercise4_07 {

	/*
	 * 関数名:main
	 * 概要:読み込んだ値の個数だけ記号文字*と+を交互に表示する
	 * 引数:なし
	 * 戻り値:なし
	 * 作成者:M.Iizuka
	 * 作成日:2024/10/08
	 */
	public static void main(String[] args) {
		//入力された値を抽出する
		Scanner standardInput = new Scanner(System.in);
		//入力可能な数値の基準値を設定する
		final int INPUT_MINIMUM_NUBER = 1;
		//入力された数値
		int inputNumber = 0;

		//正しい数値が入力してもらう
		do {
			//数値の入力を促す
			System.out.print("何個表示しますか：");
			//入力された数値を読み込む
			inputNumber = standardInput.nextInt();
			//不正である場合
			if (inputNumber < INPUT_MINIMUM_NUBER) {
				//正しい数値を入力するよう促す
				System.out.println(INPUT_MINIMUM_NUBER + "以上の数値を入力してください。");
			}
			//正しい数値が入力されるまで繰り返す
		} while (inputNumber < INPUT_MINIMUM_NUBER);

		//表示する一つ目の記号文字の設定
		char firstChar = '*';
		//表示する二つ目の記号文字の設定
		char secondChar = '+';
		//ループ回数の初期値
		int indexNumber = 1;

		//入力された数だけ繰り返す
		while (indexNumber <= inputNumber) {
			//ループ回数が偶数の場合（偶数であるかを求めるために2で割っている）
			if (indexNumber % 2 == 0) {
				//+を出力する
				System.out.print(secondChar);
				//ループ回数が奇数の場合
			} else {
				//*を出力する
				System.out.print(firstChar);
			}
			//ループ回数が1増える
			indexNumber++;
		}

	}

}
