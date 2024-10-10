package Chapter04;

//乱数ストリーム
import java.util.Random;
//入力ストリーム
import java.util.Scanner;

/*
 * クラス名:Exercise4_27
 * 概要:数当てゲーム（入力回数に制限あり）
 * 作成者:M.Iizuka
 * 作成日:2024/10/10
 */
public class Exercise4_27 {

	/*
	 * 関数名:main
	 * 概要:数当てゲーム（入力回数に制限あり）
	 * 引数:なし
	 * 戻り値:なし
	 * 作成者:M.Iizuka
	 * 作成日:2024/10/10
	 */
	public static void main(String[] args) {
		//入力値を抽出する
		Scanner standardInput = new Scanner(System.in);
		//乱数を抽出する
		Random randomNumber = new Random();

		//正解の最大値
		final int MAX_RANDOM_NUMBER = 99;
		//正解の最小値
		final int MINIMUM_RANDOM_NUMBER = 0;
		//正解の数値を生成
		int correctNumber = randomNumber.nextInt(MAX_RANDOM_NUMBER + 1);

		//ゲーム開始
		System.out.println("数当てゲーム開始！！");
		//当てさせる数値の範囲を表示
		System.out.println(MINIMUM_RANDOM_NUMBER + "～" + MAX_RANDOM_NUMBER + "の数を当ててください。");

		//制限回数を設定
		final int ANSWER_LIMIT_TIMES = 3;
		//プレイヤーの解答
		int answerNumber = 0;

		//制限回数分、数当てできる
		for (int answerTimes = 1; answerTimes <= ANSWER_LIMIT_TIMES; answerTimes++) {
			//入力可の数値であることを確認
			do {
				//解答を促す
				System.out.print("いくつかな：");
				//解答を読み込む
				answerNumber = standardInput.nextInt();
				//入力された数字が適切であるか判定する
				if (answerNumber < MINIMUM_RANDOM_NUMBER || answerNumber > MAX_RANDOM_NUMBER) {
					//適切な数字の入力促す
					System.out.println(MINIMUM_RANDOM_NUMBER + "～" + MAX_RANDOM_NUMBER + "の数を入力してください。");
				}
				//適切な数字が入力されるまで繰り返す
			} while (answerNumber < MINIMUM_RANDOM_NUMBER || answerNumber > MAX_RANDOM_NUMBER);

			//制限回数に到達していない場合
			if (answerTimes < ANSWER_LIMIT_TIMES) {
				//正解よりプレイヤーの解答が大きい場合
				if (answerNumber > correctNumber) {
					//もっと小さい数字を入力するよう促す
					System.out.println("もっと小さな数だよ。");
					//正解よりプレイヤーの答えが小さい場合
				} else if (answerNumber < correctNumber) {
					//もっと大きい数字を入力するよう促す
					System.out.println("もっと大きな数だよ。");
					//正解の場合
				} else {
					//正解であることを表示
					System.out.println("正解です。");
					//処理終了
					break;
				}
				//制限回数で当たらなかった場合
			} else if (answerNumber != correctNumber) {
				//正解を表示する
				System.out.println("正解は" + correctNumber + "です。");
			} else {
				//正解であることを表示
				System.out.println("正解です。");
			}
		}
	}

}
