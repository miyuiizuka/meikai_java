package Chapter03;

//入力ストリーム
import java.util.Scanner;

/*
 * クラス名:Exercise3_7
 * 概要:正の整数値を読み込み、3で割った値に応じてその結果を出力するプログラム
 * 作成者:M.Iizuka
 * 作成日:2024/10/03
 */
public class Exercise3_7 {

	/*
	 * 関数名:main
	 * 概要:正の整数値を読み込み、3で割った値を出力する
	 * 引数:なし
	 * 戻り値:なし
	 * 作成者:M.Iizuka
	 * 作成日:2024/10/03
	 */
	public static void main(String[] args) {

		//キーボードから読み込んだ値を抽出する
		Scanner standardInput = new Scanner(System.in);
		//入力を促す
		System.out.print("整数値：");
		//入力された値を読み込む
		int inputInt = standardInput.nextInt();

		//割る数を格納する変数を宣言する
		int divideNumber = 3;
		//余りを格納する変数を宣言する
		int remaindNumber = 0;

		//入力された値が正の整数値であるかを判定する
		if (inputInt > 0) {
			//入力された値を指定した値で割り、その余りを変数に格納する
			remaindNumber = inputInt % divideNumber;

			//割り切れるかどうかを判定する
			if (remaindNumber == 0) {
				//割り切れる場合の結果を出力する
				System.out.println("その値は" + divideNumber + "で割り切れます。");
			//割り切れない場合
			} else {
				//余りを出力する
				System.out.println("その値を" + divideNumber + "で割った余りは" + remaindNumber + "です。");
			}

		//入力された値が正の整数値でない場合	
		} else {
			//結果を出力する
			System.out.println("正でない値が入力されました。");
		}

	}

}
