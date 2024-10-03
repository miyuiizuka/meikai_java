package Chapter03;

//入力ストリーム
import java.util.Scanner;

/*
 * クラス名:Exercise3_10
 * 概要:二つの整数値の差が基準値以下の場合とそうでない場合の結果を表示するプログラム
 * 作成者:M.Iizuka
 * 作成日:2024/10/03
 */
public class Exercise3_11 {

	/*
	 * 関数名:main
	 * 概要:二つの整数値の差が基準値以下の場合とそうでない場合の結果を表示する
	 * 引数:なし
	 * 戻り値:なし
	 * 作成者:M.Iizuka
	 * 作成日:2024/10/03
	 */
	public static void main(String[] args) {

		//キーボードから読み込んだ値を抽出する
		Scanner standardInput = new Scanner(System.in);
		//整数Aの値の入力を促す
		System.out.print("整数Ａ：");
		//入力された値を変数に格納する
		int firstInt = standardInput.nextInt();
		//整数Bの値の入力を促す
		System.out.print("整数Ｂ：");
		//入力された値を変数に格納する
		int secondInt = standardInput.nextInt();

		//基準値を設定する
		int standardInt = 10;
		//二つの値の差を求める
		int differenceInt = firstInt - secondInt;
		//差の絶対値を求める
		int absoluteDifferenceInt = differenceInt < 0 ? -differenceInt : differenceInt;
		//出力する数字を決定する
		int outputInt = absoluteDifferenceInt <= standardInt ? standardInt : (standardInt + 1);
		
		//差の絶対値が基準値以下であるかを判定する
		if (absoluteDifferenceInt <= standardInt) {
			//基準値以下の場合の結果を表示する
			System.out.println("それらの差は" + outputInt + "以下です。");
		//基準値より大きい場合
		} else {
			//結果を出力する
			System.out.println("それらの差は" + outputInt + "以上です。");

		}

	}

}
