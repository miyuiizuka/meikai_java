package Chapter07;

//入力ストリーム
import java.util.Scanner;

/*
 *クラス名:Exercise7_07
 *概要:左下が直角の三角形を表示する
 *作成者:M.Iizuka
 *作成日:2024/10/18 
 */
public class Exercise7_07 {

	/*
	 * 関数名:putStars
	 * 概要:文字を指定された段数分、連続して表示する
	 * 引数:inputStep 指定された段数
	 * 戻り値:なし
	 * 作成者:M.Iizuka
	 * 作成日:2024.10.18
	 */
	public static void putStars(int inputStep) {
		//指定された段数分、連続して文字を出力し三角形を表示する
		for (int stepIndex = 1; stepIndex <= inputStep; stepIndex++) {
			//任意の文字を連続して表示する
			putChars('*', stepIndex);
			//次の段へ改行する
			System.out.println();
		}
	}

	/*
	 * 関数名:putChars
	 * 概要:任意の文字を連続して表示する
	 * 引数:stepCharacter 任意の文字,stepIndex 現在の段数
	 * 戻り値:なし
	 * 作成者:M.Iizuka
	 * 作成日:2024/10/18
	 */
	public static void putChars(char stepCharacter, int stepIndex) {
		//任意の文字を連続して表示
		while (stepIndex-- > 0) {
			//文字を表示
			System.out.print(stepCharacter);
		}
	}

	/*
	 * 関数名:main
	 * 概要:左下が直角の三角形を表示する
	 * 引数:なし
	 * 戻り値:なし
	 * 作成者:M.Iizuka
	 * 作成日:2024/10/18
	 */
	public static void main(String[] args) {
		//入力値を抽出する
		Scanner standardInput = new Scanner(System.in);

		//何を表示するか説明
		System.out.println("左下直角の三角形を表示します。");
		//段数の入力を促す
		System.out.print("段数は：");
		//入力された段数を読み込む
		int inputStep = standardInput.nextInt();
		//直角三角形を表示する
		putStars(inputStep);
	}

}
