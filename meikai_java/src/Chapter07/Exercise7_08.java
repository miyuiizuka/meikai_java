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
			//調整値
			int ajustInt = 1;
			//最大値からランダムに引く数を決定
			int randomMinus = extractRandom.nextInt(inputMax - inputMinimum) + ajustInt;
			//乱数を生成する
			randomNumber = inputMax - randomMinus;
		}

		//生成された乱数を返却
		return randomNumber;
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
		//生成する乱数の最小値の入力を促す
		System.out.print("整数a：");
		//入力値を読み込む
		int inputMinimum = standardInput.nextInt();
		//生成する乱数の最大値の入力を促す					
		System.out.print("整数b：");
		//入力値を読み込む
		int inputMax = standardInput.nextInt();

		//生成された値を表示する
		System.out.println(random(inputMinimum, inputMax));
	}

}
