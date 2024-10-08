package Chapter04;

//入力ストリーム
import java.util.Scanner;

/*
 * クラス名:Exercise4_08
 * 概要:正の整数値を読み込み、その桁数を出力するプログラム
 * 作成者:M.Iizuka
 * 作成日:2024/10/08
 */
public class Exercise4_08 {

	/*
	 * 関数名:main
	 * 概要:正の整数値を読み込み、その桁数を出力する
	 * 作成者:M.Iizuka
	 * 作成日:2024/10/08
	 */
	public static void main(String[] args) {
		//入力された値を抽出する
		Scanner standardInput = new Scanner(System.in);
		//入力可能な数値の基準値を設定する
		final int INPUT_MINIMUM_NUBER = 0;
		//入力された値
		int inputNumber = 0;
		//正しい数値が入力してもらう
		do {
			//整数値の入力を促す
			System.out.print("整数値：");
			//入力された値を読み込む
			inputNumber = standardInput.nextInt();
			//不正な値が入力された場合
			if (inputNumber <= INPUT_MINIMUM_NUBER) {
				//正しい数値を入力するよう促す
				System.out.println("正の整数値を入力してください。");
			}
			//正しい数値が入力されるまで繰り返す
		} while (inputNumber <= INPUT_MINIMUM_NUBER);
		
		//桁数
		int digitNumber = 0;
		
		//桁数をカウントする
		while(inputNumber>0) {
			//入力された値の桁が１つ減る（桁を一つ減らすため10で割る）
			inputNumber/=10;
			//桁数が１カウントされる
			digitNumber++;
		}
		//桁数を出力する
		System.out.println("その値は"+digitNumber+"桁です。");
	}

}
