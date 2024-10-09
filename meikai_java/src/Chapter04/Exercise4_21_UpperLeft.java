package Chapter04;

//入力ストリーム
import java.util.Scanner;

/*
 * クラス名:Exercise4_21_UpperLeft
 * 概要:左上側が直角の三角形を表示するプログラム
 * 作成者:M.Iizuka
 * 作成日:2024/10/09
 */
public class Exercise4_21_UpperLeft {

	/*
	 * 関数名:main
	 * 概要:左上側が直角の三角形を表示する
	 * 引数:なし
	 * 戻り値:なし
	 * 作成者:M.Iizuka
	 * 作成日:2024/10/09
	 */
	public static void main(String[] args) {
		//入力値を抽出する
		Scanner standardInput = new Scanner(System.in);

		//表示する図形を示す
		System.out.println("左上直角の三角形を表示します。");
		//入力値
		int inputNumber = 0;
		//入力値の最小値
		final int INPUT_MINIMUM_NUMBER = 0;

		//入力処理
		do {
			//段数の入力を促す
			System.out.print("段数は：");
			//入力値を読み込む
			inputNumber = standardInput.nextInt();
			//不正な値が入力された場合
			if (inputNumber <= INPUT_MINIMUM_NUMBER) {
				//正しい値を入力するよう促す
				System.out.println("正の整数値を入力してください。");
			}
			//正しい値が入力されるまで処理を行う
		} while (inputNumber <= INPUT_MINIMUM_NUMBER);

		//三角形の高さだけ記号表示
		for (int heightNumber = 1; heightNumber <= inputNumber; heightNumber++) {
			//三角形の上部から記号を表示
			for (int baseNumber = inputNumber; baseNumber >= heightNumber; baseNumber--) {
				//記号を出力
				System.out.print('*');
			}
			//次の段へ
			System.out.println("");
		}

	}

}
