package Chapter04;

//入力ストリーム
import java.util.Scanner;

/*
 * クラス名:Exercise4_17
 * 概要:読み込んだ整数値のすべての約数とその個数を表示するプログラム
 * 作成者:M.Iizuka
 * 作成日:2024/10/09
 */
public class Exercise4_17 {

	/*
	 * 関数名:main
	 * 概要:読み込んだ整数値のすべての約数とその個数を表示する
	 * 引数:なし
	 * 戻り値:なし
	 * 作成者:M.Iizuka
	 * 作成日:2024/10/09
	 * 
	 */
	public static void main(String[] args) {
		//入力された値を抽出する
		Scanner standardInput = new Scanner(System.in);

		//入力を促す
		System.out.print("整数値：");
		//入力された値を読み込む
		int inputNumber = standardInput.nextInt();
		//負の整数値が入力された場合
		if (inputNumber < 0) {
			//正の同値に置き換える
			inputNumber = -inputNumber;
		}
		//約数の個数の合計
		int sumDivisor = 0;

		//約数を表示する
		for (int indexNumber = 1; indexNumber <= inputNumber; indexNumber++) {
			//割り切れる場合
			if (inputNumber % indexNumber == 0) {
				//約数をカウント
				sumDivisor++;
				//約数を表示
				System.out.println(indexNumber);
			}
		}
		//約数の合計個数を表示
		System.out.println("約数は" + sumDivisor + "個です。");

	}

}
