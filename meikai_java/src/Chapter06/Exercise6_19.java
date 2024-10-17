package Chapter06;

//入力ストリーム
import java.util.Scanner;

/*
 * クラス名:Exercise6_19
 * 概要:クラス数・各クラスの人数・全員の点数を読み込んで、点数の合計点と平均点を求めるプログラム
 * 作成者:M.Iizuka
 * 作成日:2024/10/17
 */
public class Exercise6_19 {

	/*
	 * 関数名:main
	 * 概要:クラス数・各クラスの人数・全員の点数を読み込んで、点数の合計点と平均点を求める
	 * 引数:なし
	 * 戻り値:なし
	 * 作成者:M.Iizuka
	 * 作成日:2024/10/17
	 */
	public static void main(String[] args) {
		//入力値を抽出する
		Scanner standardInput = new Scanner(System.in);

		//クラス数
		int sumClass = 0;
		//クラスの人数
		int sumStudent = 0;
		//点数の最小値
		final int MINIMUM_SCORE = 0;
		//点数の最大値
		final int MAX_SCORE = 100;
		//点数
		int scoreValue = 0;

		//クラス数を入力してもらう
		do {
			//クラス数の入力を促す
			System.out.print("クラス数：");
			//入力値を読み込む
			sumClass = standardInput.nextInt();
			//不正な値が入力された場合
			if (sumClass <= 0) {
				//不正であることを表示
				System.out.println("正の整数値を入力してください。");
			}
			//適切な値が入力されるまで入力処理を繰り返す
		} while (sumClass <= 0);

		//点数の配列を生成
		int[][] scoreArray = new int[sumClass][];

		//改行し各クラスの人数の入力を行う
		System.out.println("");
		//クラスの人数を入力してもらう
		for (int classIndex = 0; classIndex < sumClass; classIndex++) {
			//入力値が正しいか確認
			do {
				//クラスの人数の入力を促す
				System.out.print((classIndex + 1) + "組の人数：");
				//入力値を読み込む
				sumStudent = standardInput.nextInt();
				//不正な値が入力された場合
				if (sumStudent <= 0) {
					//不正であることを表示
					System.out.println("正の整数値を入力してください。");
				}
				//適切な値が入力されるまで入力処理を繰り返す
			} while (sumStudent <= 0);

			//クラスの配列を生成
			scoreArray[classIndex] = new int[sumStudent];
			//生徒の点数を入力してしもらう
			for (int studentIndex = 0; studentIndex < sumStudent; studentIndex++) {
				//点数を入力してもらう
				do {
					//生徒の点数の入力を促す
					System.out.print((classIndex + 1) + "組" + (studentIndex + 1) + "番の点数：");
					//入力値を読み込む
					scoreArray[classIndex][studentIndex] = standardInput.nextInt();
					//不正な数値が入力された場合
					if (scoreArray[classIndex][studentIndex] < MINIMUM_SCORE
							|| scoreArray[classIndex][studentIndex] > MAX_SCORE) {
						//不正であることを表示
						System.out.println(MINIMUM_SCORE + "点以上" + MAX_SCORE + "点以下で入力してください。");
					}
					//正しい数値で点数が入力されるまで繰り返す
				} while (scoreArray[classIndex][studentIndex] < MINIMUM_SCORE
						|| scoreArray[classIndex][studentIndex] > MAX_SCORE);
			}
			//改行し次のクラスの入力を行う
			System.out.println("");
		}
		//クラスごとの合計点
		int[] classSumScore = new int[sumClass];
		//クラスごとの平均点
		double[] classAverageScore = new double[sumClass];
		//全体の合計点
		int allScore = 0;
		//全体の生徒数
		int allStudent = 0;
		//全体の平均点
		double allAverageScore = 0;
		//それぞれの合計点を求める
		for (int classIndex = 0; classIndex < scoreArray.length; classIndex++) {
			//クラスの合計点を求める
			for (int studentIndex = 0; studentIndex < scoreArray[classIndex].length; studentIndex++) {
				//クラスの合計点を算出する
				classSumScore[classIndex] += scoreArray[classIndex][studentIndex];
				//全体の生徒数を算出する
				allStudent++;
			}
			//クラスの平均点を算出する
			classAverageScore[classIndex] = (double) classSumScore[classIndex] / scoreArray[classIndex].length;
			//全体の合計点を算出する
			allScore += classSumScore[classIndex];

		}
		//全体の平均点を算出する
		allAverageScore = (double) allScore / allStudent;

		//表の出力
		System.out.println("  組 |\t合計\t平均");
		//見出しの下線の出力
		System.out.println("---------------------");
		//組、合計、平均を出力する
		for (int classIndex = 0; classIndex < sumClass; classIndex++) {
			System.out.printf(" " + (classIndex + 1) + "組 |\t" + classSumScore[classIndex] + "\t\t%.1f",
					classAverageScore[classIndex]);
			//改行し次のクラスの点数出力
			System.out.println("");
		}
		//下線を出力し全体の点数を出力
		System.out.println("---------------------");
		//全体の点数の出力
		System.out.print("  計 |\t" + allScore + "\t\t" + allAverageScore);
	}
}