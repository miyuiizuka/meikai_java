package Chapter07;

//乱数ストリーム
import java.util.Random;
//入力ストリーム
import java.util.Scanner;

/*
 * クラス名:Exercise7_10
 * 概要:3つの3桁の数の暗算力トレーニング
 * 作成者:M.Iizuka
 * 作成日:2024/10/18
 */
public class Exercise7_10 {
	//乱数を抽出する
	static Random extractRandom = new Random();
	//入力値を抽出する
	static Scanner standardInput = new Scanner(System.in);

	/*
	 * 関数名:calculateCorrect
	 * 概要:正解を計算する
	 * 引数:firstInt 1つ目の値,secondInt 2つ目の値,thirdInt 3つ目の値,
	 * firstOperator 1つ目の演算子,secondOperator 2つ目の演算子 
	 * 戻り値:correctInt 正解の値
	 * 作成者:M.Iizuka
	 * 作成日:2024/10/18
	 */
	public static int calculateCorrect(int firstInt, int secondInt, int thirdInt, int firstOperator,
			int secondOperator) {
		//正解の値
		int correctInt = 0;
		//正解の値を求める
		switch (firstOperator) {
		//1つ目の演算子が'+'
		case 0:
			//2つ目の演算子が'+'
			if (secondOperator == 0) {
				//first + second + thirdの正解
				correctInt = firstInt + secondInt + thirdInt;
				//正解の計算を終了
				break;
				//2つ目の演算子が'-'
			} else {
				//first + second - thirdの正解
				correctInt = firstInt + secondInt - thirdInt;
				//正解の計算を終了
				break;
			}
			//1つ目の演算子が'-'
		case 1:
			//2つ目の演算子が'+'
			if (secondOperator == 0) {
				//first - second + thirdの正解
				correctInt = firstInt - secondInt + thirdInt;
				//正解の計算を終了
				break;
				//2つ目の演算子が'-'
			} else {
				//first - second - thirdの正解
				correctInt = firstInt - secondInt - thirdInt;
				//正解の計算を終了
				break;
			}
		}
		//正解の値を返却
		return correctInt;
	}

	/*
	 * 関数名:confirmRetry
	 * 概要:続行の確認
	 * 引数:なし
	 * 戻り値:continueTraining トレーニング続行するか
	 * 作成者:M.Iizuka
	 * 作成日:2024/10/18
	 */
	public static boolean confirmRetry() {
		//続行の値
		final int CONTINUE_TRAINING = 1;
		//終了の値
		final int END_TRAINING = 0;
		//続行か終了かの返却地
		int continueTraining = 0;

		//続行するか入力
		do {
			//続行するか入力を促す
			System.out.print("もう一度？<Yes…1／No…0>：");
			//入力値を読み込む
			continueTraining = standardInput.nextInt();
			//適切な値が入力されるまで入力を促す
		} while (continueTraining != CONTINUE_TRAINING && continueTraining != END_TRAINING);
		//続行か終了かの値を返却
		return continueTraining == CONTINUE_TRAINING;
	}

	/*
	 * 関数名:main
	 * 概要:乱数を生成し問題文を提示後、正解するまでトレーニングを続ける
	 * 引数:なし
	 * 戻り値:なし
	 * 作成者:M.Iizuka
	 * 作成日:2024/10/18
	 */
	public static void main(String[] args) {
		//乱数生成の範囲指定の値
		int rangeRondom = 900;
		//乱数生成の調整値
		int ajustRandom = 1;

		//トレーニング開始の表示
		System.out.println("暗算力トレーニング！！");
		//
		do {
			//firstIntの乱数
			int firstInt = extractRandom.nextInt(rangeRondom) + ajustRandom;
			//secondIntの乱数
			int secondInt = extractRandom.nextInt(rangeRondom) + ajustRandom;
			//firstIntの乱数
			int thirdInt = extractRandom.nextInt(rangeRondom) + ajustRandom;

			//演算子の種類
			String[] operatorType = { " + ", " - ", };
			//1つ目の演算記号
			int firstOperator = extractRandom.nextInt(operatorType.length);
			//2つ目の演算記号
			int secondOperator = extractRandom.nextInt(operatorType.length);

			//正解するまで解く
			while (true) {
				//問題文の表示
				System.out.print(firstInt + operatorType[firstOperator] + secondInt + operatorType[secondOperator]
						+ thirdInt + " = ");
				//読み込んだ値
				int answerInt = standardInput.nextInt();
				//正解の場合
				if (answerInt == calculateCorrect(firstInt, secondInt, thirdInt, firstOperator, secondOperator)) {
					//問題終了
					break;
				}
				//不正解の場合、不正解であることを表示
				System.out.println("違いますよ！！");
			}
			//続行か終了か
		} while (confirmRetry());

	}
}