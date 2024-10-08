package Chapter04;

//乱数ストリーム
import java.util.Random;
//入力ストリーム
import java.util.Scanner;

/*
 * クラス名:Exercise4_02
 * 概要:二桁の整数値を当てさせるプログラム
 * 作成者:M.Iizuka
 * 作成日:2024/10/08
 */
public class Exercise4_02 {

	/*
	 * 関数名:main
	 * 概要:二桁の整数値を当てさせる
	 * 引数:なし
	 * 戻り値:なし
	 * 作成者:M.Iizuka
	 * 作成日:2024/10/08
	 */
	public static void main(String[] args) {
		//生成された乱数を抽出する
		Random randomNumber = new Random();
		//入力された数字を抽出する
		Scanner standardInput = new Scanner(System.in);

		//正解の数字作成のための最小値を設定する
		final int CORRECT_MINIMUM_NUMBER = 10;
		//正解の数字作成のための最大値+1を設定する
		int CORRECT_MAX_NUMBER = 100;
		//正解の数字
		int correctNumber = 0;

		//正解の数字が最小値から最大値の範囲で作成されるまで生成を繰り返す
		do {
			//正解の数字の生成
			correctNumber = randomNumber.nextInt(CORRECT_MAX_NUMBER);
			//最小値以上の正解の数字が生成されるまで繰り返す
		} while (correctNumber <= CORRECT_MINIMUM_NUMBER);

		//ゲーム開始の文言
		System.out.println("数当てゲーム開始！！");
		//ゲームの説明
		System.out.println(CORRECT_MINIMUM_NUMBER + "～" + CORRECT_MAX_NUMBER + "の数を当ててください。");

		//プレイヤーが入力した数字
		int answerNumber = 0;

		//正解するまでゲームを繰り返す
		do {
			//最小値から最大値の範囲の数字を入力してもらう
			do {
				///数字の入力を促す
				System.out.println("いくつかな：");
				//入力された数字をプレイヤーの答え
				answerNumber = standardInput.nextInt();
				//適切な数字が入力されるまで繰り返す
			} while (!(answerNumber >= CORRECT_MINIMUM_NUMBER && answerNumber <= CORRECT_MAX_NUMBER));

			//正解よりプレイヤーの答えが大きい場合
			if (answerNumber > correctNumber) {
				//もっと小さい数字を入力するよう促す
				System.out.println("もっと小さな数だよ。");
				//正解よりプレイヤーの答えが小さい場合
			} else if (answerNumber < correctNumber)
				//もっと大きい数字を入力するよう促す
				System.out.println("もっと大きな数だよ。");

		//不正解であれば繰り返す
		} while (answerNumber != correctNumber);
		
		//正解を伝える
		System.out.println("正解です。");
	}

}
