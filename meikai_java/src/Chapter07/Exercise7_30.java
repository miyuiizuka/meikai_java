package Chapter07;

//入力ストリーム
import java.util.Scanner;

/*
 * クラス名:Exercise7_30
 * 概要:二つのint型整数の最小値、三つのint型整数の最小値、配列の要素の最小値を求め表示する
 * 作成者:M.Iizuka
 * 作成日:2024/10/24
 */
public class Exercise7_30 {
	//入力値を抽出する
	static Scanner standardInput = new Scanner(System.in);

	/*
	 * 関数名:inputValue
	 * 概要:入力処理
	 * 引数:titleString 入力してもらう内容
	 * 戻り値:inputValue 入力値
	 * 作成者:M.Iizuka
	 * 作成日:2024/10/24
	 */
	public static int inputValue(String titleString) {
		//入力してもらう内容を表示
		System.out.print(titleString + "：");
		//入力値を読み込む
		int inputValue = standardInput.nextInt();
		//入力値を返す
		return inputValue;
	}

	/*
	 * 関数名:min
	 * 概要:二つの整数の最小値を求める
	 * 引数:firstValue 一つ目の整数, secondValue 二つ目の整数
	 * 戻り値:最小値
	 * 作成者:M.Iizuka
	 * 作成日:2024/10/24
	 */
	public static int min(int firstValue, int secondValue) {
		//小さいほうを最小値とする
		int minimunValue = firstValue < secondValue ? firstValue : secondValue;
		//最小値を返す
		return minimunValue;
	}

	/*
	 * 関数名:min
	 * 概要:三つの整数の最小値を求める
	 * 引数:firstValue 一つ目の整数, secondValue 二つ目の整数, thirdValue 三つ目の整数
	 * 戻り値:最小値
	 * 作成者:M.Iizuka
	 * 作成日:2024/10/24
	 */
	public static int min(int firstValue, int secondValue, int thirdValue) {
		//一つ目の値を最小値とする
		int minimumValue = firstValue;
		//最小値より二つ目のほうが小さい場合
		if (minimumValue > secondValue) {
			//二つ目の値を最小値とする
			minimumValue = secondValue;
		}
		//最小値より三つ目のほうが小さい場合
		if (minimumValue > thirdValue) {
			//三つ目の値を最小値とする
			minimumValue = thirdValue;
		}
		//最小値を返す
		return minimumValue;
	}

	/*
	 * 関数名:min
	 * 概要:配列の要素の最小値を求める
	 * 引数:optionalArray 任意の配列
	 * 戻り値:要素の最小値
	 * 作成者:M.Iizuka
	 * 作成日:2024/10/24
	 */
	public static int min(int[] optionalArray) {
		//最小値を最初の要素に設定
		int minimumValue = optionalArray[0];
		//要素の最小値を求める
		for (int elementIndex = 1; elementIndex < optionalArray.length; elementIndex++) {
			//現在のインデックスの要素と最小値を比較して小さいほうを最小値とする
			minimumValue = minimumValue < optionalArray[elementIndex] ? minimumValue : optionalArray[elementIndex];
		}
		//最小値を返す
		return minimumValue;
	}

	/*
	 * 関数名:main
	 * 概要:二つのint型整数の最小値、三つのint型整数の最小値、配列の要素の最小値を求め表示する
	 * 引数:なし
	 * 戻り値:なし
	 * 作成者:M.Iizuka
	 * 作成日:2024/10/24
	 */
	public static void main(String[] args) {
		//一つ目の整数の入力
		int firstValue = inputValue("整数ａ");
		//二つ目の整数の入力
		int secondValue = inputValue("整数ｂ");
		//三つ目の整数の入力
		int thirdValue = inputValue("整数ｃ");

		//配列を生成することを表示
		System.out.println("\n配列の要素数と要素の値を入力してください。");
		//要素数
		int allElement = 0;
		//要素数の入力チェック
		do {
			//要素数の入力
			allElement = inputValue("要素数");
			//不正な値が入力された場合
			if (allElement <= 0) {
				//正しい値を入力するよう促す
				System.out.println("正の整数で入力してください。");
			}
			//不正な値であれば入力処理を繰り返す
		} while (allElement <= 0);
		//配列を生成
		int[] optionalArray = new int[allElement];

		//配列の要素の値を入力してもらう
		for (int elementIndex = 0; elementIndex < allElement; elementIndex++) {
			//要素の値の入力を促す
			System.out.print("optionalArray[" + elementIndex + "]：");
			//入力値を配列に格納
			optionalArray[elementIndex] = standardInput.nextInt();
		}

		//最小値の出力の前に改行
		System.out.println("");
		//二つの整数の最小値を表示する
		System.out.println(firstValue + "と" + secondValue + "の最小値は" + min(firstValue, secondValue) + "です。");
		//三つの整数の最小値を表示する
		System.out
				.println((firstValue + "と" + secondValue + "と" + thirdValue + "の最小値は"
						+ min(firstValue, secondValue, thirdValue) + "です。"));
		//配列の要素の最小値を表示する
		System.out.println("optionalArrayの最小値は" + min(optionalArray) + "です。");
	}

}
