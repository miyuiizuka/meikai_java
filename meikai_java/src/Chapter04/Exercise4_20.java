package Chapter04;

//入力ストリーム
import java.util.Scanner;

/*
 * クラス名:Exercise4_20
 * 概要:指定した段数の正方形を表示するプログラム
 * 作成者:M.Iizuka
 * 作成日:2024/10/09
 */
public class Exercise4_20 {

	/*
	 * 関数名:main
	 * 概要:指定した段数の正方形を表示する
	 * 引数:なし
	 * 戻り値:なし
	 * 作成者:M.Iizuka
	 * 作成日:2024/10/09 
	 */
	public static void main(String[] args) {
		//入力値を抽出する
		Scanner standardInput = new Scanner(System.in);

		//入力可能な数値の基準値を設定する
		final int INPUT_MINIMUM_NUMBER = 0;
		//入力値
		int inputNumber = 0;
		//正しい数値を入力してもらう
		do {
			//正方形の段数の入力を促す
			System.out.print("何段の正方形を表示しますか：");
			//入力された値を読み込む
			inputNumber = standardInput.nextInt();
			//不正な値が入力された場合
			if (inputNumber <= INPUT_MINIMUM_NUMBER) {
				//正しい値を入力してもらうよう促す
				System.out.println("正の整数値を入力してください。");
			}
			//正しい値が入力されるまで処理を続ける
		} while (inputNumber <= INPUT_MINIMUM_NUMBER);

		//正方形の縦を作成
		for (int verticalNumber = 1; verticalNumber <= inputNumber; verticalNumber++) {
			//正方形の横を作成
			for (int horizontalNumber = 1; horizontalNumber <= inputNumber; horizontalNumber++) {
				//記号を出力
				System.out.print('*');
			}
			//次の段へ
			System.out.println();
		}
	}

}
