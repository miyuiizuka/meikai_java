package Chapter06;

//乱数ストリーム
import java.util.Random;
//入力ストリーム
import java.util.Scanner;

/*
 * クラス名:Exercise6_15
 * 概要:曜日を表示して、その英語表現を入力させる英単語学習プログラム
 * 作成者:M.Iizuka
 * 作成日:204/10/16
 */
public class Exercise6_15 {

	/*
	 * 関数名:main
	 * 概要:曜日を表示して、その英語表現を入力させる
	 * 引数:なし
	 * 戻り値:なし
	 * 作成者:M.Iizuka
	 * 作成日:2024/10/16
	 */
	public static void main(String[] args) {
		//乱数を抽出する
		Random randomNumber = new Random();
		//入力値を抽出する
		Scanner standardInput = new Scanner(System.in);
		//英語の曜日名
		String[] englishMonth = {
				"sunday", "monday", "tuesday", "wednesday", "thursday", "friday", "saturday"
		};
		//日本語の曜日名
		String[] japaneseMonth = { "日", "月", "火", "水", "木", "金", "土" };

		//問題文の表示
		System.out.println("英語の曜日名を小文字で入力してください。");

		//生成する乱数の数
		final int SUM_DAY = 7;
		//もう一度問題を解くときの番号
		final int REPLAY_NUMBER = 1;
		//問題を終了するときの番号
		final int END_NUMBER = 0;
		//出題する曜日
		int questionDay = 0;
		//前回出題した月
		int sameQuestionDay = 0;
		//もう一度行うか
		int inputReplayNumber = 1;

		//学習者が望む限り問題を繰り返す
		do {
			//同一曜日を連続して出題しない
			do {
				//出題する曜日を決定
				questionDay = randomNumber.nextInt(SUM_DAY);
				//前回と異なる月になるようにする
			} while (questionDay == sameQuestionDay);
			//現在の出題月を、次の出題時に比較するために前回出題した月として設定
			sameQuestionDay = questionDay;

			//正解するまで解答を繰り返す
			while (true) {
				//出題する曜日を表示
				System.out.print((japaneseMonth[questionDay]) + "曜日：");
				//解答を読み込む
				String answerMonthDay = standardInput.next();
				//正解の場合
				if (answerMonthDay.equals(englishMonth[questionDay])) {
					//正解であることを表示、もう一度問題を解くか入力を促す
					System.out.print("正解です。もう一度？　1…Yes／0…No：");
					//もう一度行うかどうか
					do {
						//入力値を読み込む
						inputReplayNumber = standardInput.nextInt();
						//不正な値が入力された場合
						if (inputReplayNumber != END_NUMBER && inputReplayNumber != REPLAY_NUMBER) {
							//正しい数値を入力するよう促す
							System.out.print("1か0を入力してください。\nもう一度？　1…Yes／0…No：");
						}
						//正しい数値が入力されるまで繰り返す
					} while (inputReplayNumber != END_NUMBER && inputReplayNumber != REPLAY_NUMBER);

					//不正解の場合
				} else {
					//不正解であることを表示
					System.out.println("違います。");
					//正解するまで繰り返す
					continue;
				}
				//現在の問題を終わる
				break;
			}
			//もう一度行う場合、学習者が望む限り繰り返す
		} while (inputReplayNumber == REPLAY_NUMBER);

	}

}
