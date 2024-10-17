package Chapter07;

//入力ストリーム
import java.util.Scanner;

/*
 * クラス名:Exercise7_03
 * 概要:読み込んだ三つの整数の中央値を求めて表示するプログラム
 * 作成者:M.Iizuka
 * 作成日:2024/10/17
 */
public class Exercise7_03 {

	/*
	 * 関数名:med
	 * 概要:読み込んだ三つの整数の中央値を求める
	 * 引数:入力された整数値
	 * 戻り値:中央値
	 * 作成者:M.Iizuka
	 * 作成日:2024/10/17
	 */
	public static int med(int firstNumber, int secondNumber, int thirdNumber) {
		//中央値の初期値を設定する
		int medianNumber = firstNumber;

		//二つ目の値が一つ目の値より大きい場合
		if (firstNumber < secondNumber) {
			//三つ目の値が二つ目の値より大きい場合
			if (secondNumber < thirdNumber) {
				//中央値を二つ目の値とする
				medianNumber = secondNumber;
				//三つ目の値が一つ目の値より大きい場合
			} else if (firstNumber < thirdNumber) {
				//中央値を三つ目の値とする
				medianNumber = thirdNumber;
				//一つ目の値が三つ目の値より大きい場合
			} else {
				//中央値を一つ目の値とする
				medianNumber = firstNumber;

			}
			//一つ目の値が、二つ目の値より大きく、三つ目の値より小さい場合
		} else if (firstNumber < thirdNumber) {
			//中央値を一つ目の値とする
			medianNumber = firstNumber;
			//三つ目の値が二つ目の値より大きい場合
		} else if (secondNumber < thirdNumber) {
			//中央値を三つ目の値とする
			medianNumber = thirdNumber;
			//二つ目の値が三つ目の値より大きい場合
		} else {
			//中央値を二つ目の値とする
			medianNumber = secondNumber;
		}
		//中央値を返却
		return medianNumber;
	}

	/*
	 * 関数名:main
	 * 概要:読み込んだ三つの整数の中央値を表示する
	 * 引数:なし
	 * 戻り値:なし
	 * 作成者:M.Iizuka
	 * 作成日:2024/10/17
	 */
	public static void main(String[] args) {
		//入力値を抽出する
		Scanner standardInput = new Scanner(System.in);
		//一つ目の整数の入力を促す
		System.out.print("整数a：");
		//一つ目の入力値を読み込む
		int firstNumber = standardInput.nextInt();
		//二つ目の整数の入力を促す
		System.out.print("整数b：");
		//二つ目の入力値を読み込む
		int secondNumber = standardInput.nextInt();
		//三つ目の整数の入力を促す
		System.out.print("整数c：");
		//三つ目の入力値を読み込む
		int thirdNumber = standardInput.nextInt();

		//中央値を表示する
		System.out.println("中央値は" + med(firstNumber, secondNumber, thirdNumber) + "です。");

	}

}
