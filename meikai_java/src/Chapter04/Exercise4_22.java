package Chapter04;

//入力ストリーム
import java.util.Scanner;

/*
 * クラス名:Exercise4_22
 * 概要:入力された段数のピラミッドを表示するプログラム
 * 作成者:M.Iizuka
 * 作成日:2024/10/10 
 */
public class Exercise4_22 {

	/*
	 * 関数名:main
	 * 概要:入力された段数のピラミッドを表示する
	 * 引数:なし
	 * 戻り値:なし
	 * 作成者:M.Iizuka
	 * 作成日:2024/10/10
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

		//入力値の段数のピラミッドを表示
		for (int sumStepNumber = 1; sumStepNumber <= inputNumber; sumStepNumber++) {
			//最終段に表示する記号の数
			int inputSymbolNumber = (inputNumber - 1) * 2 + 1;

			//最終段までの場合
			if (sumStepNumber < inputNumber) {
				//一段に表示する記号の数
				int sumSymbolNumber = (sumStepNumber - 1) * 2 + 1;
				//一段に表示する片側の空白の数
				int sumBlankNumber = (inputSymbolNumber - sumSymbolNumber) / 2;

				//一段の左側の空白を表示
				for (int stepBlankNumber = 1; stepBlankNumber <= sumBlankNumber; stepBlankNumber++) {
					//空白を出力
					System.out.print(" ");
				}
				//一段の記号を表示
				for (int stepSymbolNumber = 1; stepSymbolNumber <= sumSymbolNumber; stepSymbolNumber++) {
					//記号を出力
					System.out.print('*');
				}
				//一段の右側の空白を表示
				for (int stepBlankNumber = 1; stepBlankNumber <= sumBlankNumber; stepBlankNumber++) {
					//空白を出力
					System.out.print(" ");
				}
				//最終段の場合
			} else {
				//一段の記号を表示
				for (int stepSymbolNumber = 1; stepSymbolNumber <= inputSymbolNumber; stepSymbolNumber++) {
					//記号を出力
					System.out.print('*');
				}
			}
			//改行
			System.out.println("");

		}

	}

}
