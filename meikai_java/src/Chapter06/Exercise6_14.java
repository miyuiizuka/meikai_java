package Chapter06;

//乱数ストリーム
import java.util.Random;
//入力ストリーム
import java.util.Scanner;

/*
 * クラス名:Exercise6_14
 * 概要:月を1～12の数値として表示して、その英語表現を入力させる英単語学習プログラム
 * 作成者:M.Iizuka
 * 作成日:2024/10/16
 */
public class Exercise6_14 {

	/*
	 * 関数名:main
	 * 概要:月を1～12の数値として表示して、その英語表現を入力させる
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
		//英語の月名
		String[] monthString = {
				"January", "Febrary", "March", "April", "May", "June", "July",
				"August", "September", "October", "November", "December"
		};

		//問題文の表示
		System.out.println("英語の月名を入力してください。\nなお、先頭は大文字で、２文字目以降は小文字とします。");

		//生成する乱数の数
		final int SUM_MONTH = 12;
		//もう一度問題を解くときの番号
		final int REPLAY_NUMBER = 1;
		//問題を終了するときの番号
		final int END_NUMBER = 0;
		//出題する月
		int questionMonth = 0;
		//前回出題した月
		int sameQuestionMonth = 0;
		//もう一度行うか
		int inputReplayNumber = 1;

		//学習者が望む限り問題を繰り返す
		Outer: while (true) {
			//同一月を連続して出題しない
			do {
				//出題する月を生成
				questionMonth = randomNumber.nextInt(SUM_MONTH);
				//前回と異なる月になるようにする
			} while (questionMonth == sameQuestionMonth);
			//現在の出題月を、次の出題時に比較するために前回出題した月として設定
			sameQuestionMonth = questionMonth;

			//問題を解く
			Inner:
			//学習者が望む限り何度も繰り返す
			while (true) {
				//出題月を表示
				System.out.print((questionMonth + 1) + "月：");
				//解答を読み込む
				String answerMonthString = standardInput.next();
				//正解の場合
				if (answerMonthString.equals(monthString[questionMonth])) {
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

					//もう一度行わない場合
					if (inputReplayNumber == END_NUMBER) {
						//プログラムを終了する
						break Outer;
						//もう一度行う場合
					} else {
						//次の出題月を生成する
						break;
					}
					//不正解の場合
				} else {
					//不正解であることを表示
					System.out.println("違います。");
				}
			}
		}

	}

}
