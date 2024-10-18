package Chapter07;

//入力ストリーム
import java.util.Scanner;

/*
 * クラス名:Exercise7_09
 * 概要:正の整数値を入力させる
 * 作成者:M.Iizuka
 * 作成日:2024/10/18
 */
public class Exercise7_09 {
	//入力値を抽出する
	static Scanner standardInput = new Scanner(System.in);

	/*
	 * 関数名:readPlusInt
	 * 概要:キーボードから正の整数値を読み込んでその値を返却する
	 * 引数:なし
	 * 戻り値：plusInt 正の整数値
	 * 作成者:M.Iizuka
	 * 作成日:2024/10/18
	 */
	public static int readPlusInt() {
		//正の整数値
		int plusInt = 0;
		//正の整数値が入力されるまで再入力
		while (plusInt <= 0) {
			//正の整数値の入力を促す
			System.out.print("正の整数値：");
			//入力値を読み込む
			plusInt = standardInput.nextInt();
		}
		//正の整数値を返却
		return plusInt;
	}

	/*
	 * 関数名:main
	 * 概要:正の整数値を表示する
	 * 引数:なし
	 * 戻り値:なし
	 * 作成者:M.Iizuka
	 * 作成日:2024/10/18
	 */
	public static void main(String[] args) {
		//正の整数値を表示
		readPlusInt();
	}

}
