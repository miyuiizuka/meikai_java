package Chapter06;

//入力ストリーム
import java.util.Scanner;

/*
 * クラス名:Exercise6_17
 * 概要:6人の2科目（国語・数学）の点数を読み込んで、科目ごとの平均点、学生ごとの平均点を求めるプログラム
 * 作成者:M.Iizuka
 * 作成日:2024/10/16
 */
public class Exercise6_17 {

	/*
	 * 関数名:main
	 * 概要:6人の2科目（国語・数学）の点数を読み込んで、科目ごとの平均点、学生ごとの平均点を求める
	 * 引数:なし
	 * 戻り値:なし
	 * 作成者:M.Iizuka
	 * 作成日:2024/10/16
	 */
	public static void main(String[] args) {
		//入力値を抽出する
		Scanner standardInput = new Scanner(System.in);

		//人数
		final int SUM_PEOPLE = 6;
		//科目名
		final String[] SUBJECT_STRING = { "国語", "数学" };
		//国語の番号
		final int JAPANISE_NUMBER = 0;
		//数学の番号
		final int MATH_NUMBER = 1;
		//科目数
		int sumSubjuct = SUBJECT_STRING.length;
		//学生の科目ごとの点数
		int[][] subjectScore = new int[SUM_PEOPLE][sumSubjuct];
		//点数の最小値
		final int MINIMUM_SCORE = 0;
		//点数の最大値
		final int MAX_SCORE = 100;
		//点数
		int scoreValue = 0;

		//人数分の入力
		for (int peopleIndex = 0; peopleIndex < SUM_PEOPLE; peopleIndex++) {
			//科目分の入力
			for (int subjectIndex = 0; subjectIndex < sumSubjuct; subjectIndex++) {
				//点数を入力してもらう
				do {
					//点数の入力を促す
					System.out.print((peopleIndex + 1) + "人目の" + SUBJECT_STRING[subjectIndex] + "の点数：");
					//点数を読み込む
					scoreValue = standardInput.nextInt();
					//不正な数値が入力された場合
					if (scoreValue < MINIMUM_SCORE || scoreValue > MAX_SCORE) {
						//不正であることを表示
						System.out.println(MINIMUM_SCORE + "点以上" + MAX_SCORE + "点以下で入力してください。");
					}
					//正しい数値で点数が入力されるまで繰り返す
				} while (scoreValue < MINIMUM_SCORE || scoreValue > MAX_SCORE);
				//入力された点数を読み込む
				subjectScore[peopleIndex][subjectIndex] = scoreValue;
			}
			//改行し次の人の点数入力
			System.out.println("");
		}
		//科目の合計点
		int[] sumSubjectScore = new int[sumSubjuct];
		//科目の平均点
		double[] subjectAverage = new double[sumSubjuct];
		//個人の合計点
		int[] sumPersonalScore = new int[SUM_PEOPLE];
		//個人の平均点
		double[] personalAverage = new double[SUM_PEOPLE];

		//それぞれの合計点を求める
		for (int peopleIndex = 0; peopleIndex < SUM_PEOPLE; peopleIndex++) {
			//個人の科目の点数
			for (int subjectIndex = 0; subjectIndex < sumSubjuct; subjectIndex++) {
				//個人の点数を算出する
				sumPersonalScore[peopleIndex] += subjectScore[peopleIndex][subjectIndex];
				//科目の合計点を算出する
				if (subjectIndex == JAPANISE_NUMBER) {
					//国語の合計点を算出
					sumSubjectScore[JAPANISE_NUMBER] += subjectScore[peopleIndex][subjectIndex];
					//数学の場合
				} else if (subjectIndex == MATH_NUMBER) {
					//数学の合計点を算出
					sumSubjectScore[MATH_NUMBER] += subjectScore[peopleIndex][subjectIndex];
				}
			}
		}
		//科目の平均点を算出し表示する
		for (int subjectIndex = 0; subjectIndex < sumSubjuct; subjectIndex++) {
			//平均点を算出
			subjectAverage[subjectIndex] = (double) sumSubjectScore[subjectIndex] / SUM_PEOPLE;
			//平均点を表示
			System.out.println(SUBJECT_STRING[subjectIndex] + "の平均点は" + subjectAverage[subjectIndex] + "です。");
		}
		//改行し個人の平均点の表示
		System.out.println("");
		//個人の平均点を算出し表示する
		for (int peopleIndex = 0; peopleIndex < SUM_PEOPLE; peopleIndex++) {
			//平均点を算出
			personalAverage[peopleIndex] = (double) sumPersonalScore[peopleIndex] / sumSubjuct;
			//平均点を表示
			System.out.println((peopleIndex + 1) + "人目の平均点は" + personalAverage[peopleIndex] + "です。");
		}
	}

}
