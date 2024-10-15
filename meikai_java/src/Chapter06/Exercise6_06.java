package Chapter06;

//入力ストリーム
import java.util.Scanner;

/*
 * クラス名:Exercise6_06
 * 概要:テストの点数の合計点・平均点・最高点・最低点を表示するプログラム
 * 作成者:M.Iizuka
 * 作成日:2024/10/15
 */
public class Exercise6_06 {

	/*
	 * 関数名:main
	 * 概要:テストの点数の合計点・平均点・最高点・最低点を表示する
	 * 引数:なし
	 * 戻り値:なし
	 * 作成者:M.Iizuka
	 * 作成日:2024/10/15
	 */
	public static void main(String[] args) {
		//入力値を抽出する
		Scanner standardInput = new Scanner(System.in);

		//人数
		int sumPeople = 0;
		//人数の入力が正しいか判定
		do {
			//人数の入力を促す
			System.out.print("人数：");
			//入力値を読み込む
			sumPeople = standardInput.nextInt();
			//入力値が不正な値の場合
			if (sumPeople <= 0) {
				//不正であることを表示
				System.out.println("正の整数を入力してください。");
			}
			//正しい数値が入力されるまで繰り返す
		} while (sumPeople <= 0);

		//点数
		int[] testScore = new int[sumPeople];
		//個々の点数を入力してもらう
		for (int scoreIndex = 0; scoreIndex < sumPeople; scoreIndex++) {
			//点数の入力が正しいか判定
			do {
				//点数の入力を促す
				System.out.print((scoreIndex + 1) + "番の点数：");
				//入力値を読み込む
				testScore[scoreIndex] = standardInput.nextInt();
				//入力値が不正な値の場合
				if(testScore[scoreIndex]<0) {
					//不正であることを表示
					System.out.println("0以上の整数を入力してください。");
				}
				//正しい数値が入力されるまで繰り返す
			}while(testScore[scoreIndex]<0);
			
		}

		//合計点
		int sumScore = 0;
		//平均点
		double averageScore = 0;
		//最高点
		int maxScore = testScore[0];
		//最低点
		int minimumScore = testScore[0];

		//それぞれの点数を算出する
		for (int scoreIndex = 0; scoreIndex < testScore.length; scoreIndex++) {
			//合計点の算出
			sumScore += testScore[scoreIndex];
			//平均点の算出
			averageScore = (double) sumScore / sumPeople;
			//最高点の算出
			if (testScore[scoreIndex] > maxScore) {
				//最高点を更新
				maxScore = testScore[scoreIndex];
			}
			//最低点の算出
			if (testScore[scoreIndex] < minimumScore) {
				//最低点を更新
				minimumScore = testScore[scoreIndex];
			}

		}
		//合計点を表示する
		System.out.println("合計点は" + sumScore + "点です。");
		//平均点を表示する
		System.out.println("平均点は" + averageScore + "点です。");
		//最高点を表示する
		System.out.println("最高点は" + maxScore + "点です。");
		//最低点を表示する
		System.out.println("最低点は" + minimumScore + "点です。");

	}

}