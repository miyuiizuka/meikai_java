package Chapter03;

//入力ストリーム
import java.util.Scanner;

/*
 * クラス名:Exercise3_8
 * 概要:入力された点数に応じて評価を判定するプログラム
 * 作成者:M.Iizuka
 * 作成日:2024/10/03
 */
public class Exercise3_8 {

	/*
	 * 関数名:main
	 * 概要:入力された点数に応じて評価を判定する
	 * 引数:なし
	 * 戻り値:なし
	 * 作成者:M.Iizuka
	 * 作成日:2024/10/03
	 */
	public static void main(String[] args) {

		//キーボードから読み込んだ値を抽出する
		Scanner standardInput = new Scanner(System.in);
		//点数の入力を促す
		System.out.print("点数：");
		//入力された点数を変数に格納する
		int inputScore = standardInput.nextInt();
		
		//点数の最小値を設定する
		final int MINIMUM_SCORE = 0;
		//点数の最大点を設定する
		final int MAX_SCORE = 100;
		
		//不可の最大値を設定する
		int failingMaxScore = 59;
		//可の最小値を設定する
		int passingMinimumScoe = failingMaxScore + 1;
		//可の最大値を設定する
		int passingMaxScore = 69;
		//良の最小値を設定する
		int goodMinimumScoe = passingMaxScore + 1;		
		//良の最大値を設定する
		int goodMaxScore = 79;
		//優の最小値を設定する
		int excellentMinimumScoe = goodMaxScore + 1;
		

		//0点以上100点以下の点数が入力されているか判定する
		if (inputScore >= MINIMUM_SCORE && inputScore <= MAX_SCORE) {
			//0点から59点の場合
			if (inputScore >= MINIMUM_SCORE && inputScore <= failingMaxScore) {
				//評価を出力する
				System.out.println("不可");
				//60点から69点の場合	
			} else if (inputScore >= passingMinimumScoe && inputScore <= passingMaxScore) {
				//評価を出力する
				System.out.println("可");
				//70点から79点の場合
			} else if (inputScore >= goodMinimumScoe && inputScore <= goodMaxScore) {
				//評価を出力する
				System.out.println("良");
				//80点から100点の場合
			} else if (inputScore >= excellentMinimumScoe && inputScore <= MAX_SCORE) {
				//評価を出力する
				System.out.println("優");
			}
			//点数が不正である場合
		} else {
			//正しい点数を入力するよう促す
			System.out.println(MINIMUM_SCORE + "点以上" + MAX_SCORE + "点以下の点数を入力してください。");
		}

	}

}
