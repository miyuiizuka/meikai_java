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
		
		//0点から59点の場合
		if ( inputScore >= 0 && inputScore <= 59 ) {
			//評価を出力する
			System.out.println("不可");
		//60点から69点の場合の評価を出力する	
		} else if ( inputScore >= 60 && inputScore <= 69 ) {
			System.out.println("可");
		//70点から79点の場合の評価を出力する
		} else if ( inputScore >= 70 && inputScore <= 79 ) {
			System.out.println("良");
		//80点から100点の場合の評価を出力する
		} else if ( inputScore >= 80 && inputScore <= 100 ) {
			System.out.println("優");
		}
		
	}

}
