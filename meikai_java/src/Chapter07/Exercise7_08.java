package Chapter07;

//乱数ストリーム
import java.util.Random;
import java.util.Scanner;

/*
 * クラス名:Exercise7_08
 * 概要:a以上b未満の乱数を生成しその値を表示する
 * 作成者:M.Iizuka
 * 作成日:2024/10/18
 */
public class Exercise7_08 {

	/*
	 * 関数名:random
	 * 概要:a以上b未満の乱数を生成する
	 * 引数:inputMinimum 整数a,inputMax 整数b
	 * 戻り値:randomNumber 生成された乱数
	 * 作成者:M.Iizuka
	 * 作成日:2024/10/18
	 */
	public static int random(int inputMinimum, int inputMax) {
		//乱数を抽出する
		Random extractRandom = new Random();
		//生成する乱数
		int randomNumber = 0;

		//bの値がaより小さい場合
		if (inputMinimum > inputMax) {
			//aの値を返却する
			randomNumber = inputMinimum;
			//aの値がbより大きい場合
		} else {
			//a以上b未満の乱数を生成する
			while (true) {
				//b未満の乱数を生成する
				randomNumber = extractRandom.nextInt(inputMax);
				//生成された乱数がa以上の場合
				if (randomNumber >= inputMinimum) {
					//乱数生成を終了
					break;
				}
			}
		}

		//生成された乱数を返却
		return randomNumber;
	}

	/*
	 * 関数名:checkInputNumber
	 * 概要:入力値が正の整数であるか確認
	 * 引数:inputNumber 入力値
	 * 戻り値:check
	 * 作成者:M.Iizuka
	 * 作成日:2024/10/18
	 */
	public static boolean checkInputNumber(int inputNumber) {
		//入力値チェックの変数
		boolean retryInput = true;
		//入力値が正の整数でない場合
		if (inputNumber <= 0) {
			//正の整数を入力するよう表示
			System.out.println("正の整数値を入力してください。");
			//入力値が正の整数の場合
		} else {
			//falseを返却
			retryInput = false;
		}
		//結果を返却
		return retryInput;
	}

	/*
	 * 関数名:main
	 * 概要::a以上b未満の乱数を生成しその値を表示する
	 * 引数:なし
	 * 戻り値:なし
	 * 作成者:M.Iizuka
	 * 作成日:2024/10/18
	 */
	public static void main(String[] args) {
		//入力値を抽出する
		Scanner standardInput = new Scanner(System.in);
		//生成する乱数の最小値
		int inputMinimum = 0;
		//生成する乱数の最大値
		int inputMax = 0;
		//乱数の最小値の入力
		do {
			//生成する乱数の最小値の入力を促す
			System.out.print("整数a：");
			//入力値を読み込む
			inputMinimum = standardInput.nextInt();
			//正しい入力値になるまで繰り返す
		} while (checkInputNumber(inputMinimum));
		//生成する乱数の最大値の入力を促す

		//乱数の最大値の入力
		do {
			//生成する乱数の最大値の入力を促す					
			System.out.print("整数b：");
			//入力値を読み込む
			inputMax = standardInput.nextInt();
			//正しい入力値になるまで繰り返す
		} while (checkInputNumber(inputMax));

		//生成された値を表示する
		System.out.println(random(inputMinimum, inputMax));
	}

}
