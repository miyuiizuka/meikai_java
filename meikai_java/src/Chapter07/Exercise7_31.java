package Chapter07;

//入力ストリーム
import java.util.Scanner;

/*
 * クラス名:Exercise7_31
 * 概要:入力された整数のint型、long型、float型、double型の絶対値を求め表示する
 * 作成者:M.Iizuka
 * 作成日:2024/10/24
 */
public class Exercise7_31 {

	/*
	 * 関数名:absolute
	 * 概要:入力された値の絶対値を求める
	 * 引数:inputValue 入力された値
	 * 戻り値:絶対値
	 * 作成者:M.Iizuka
	 * 作成日:2024/10/24
	 */
	public static int absolute(int inputValue) {
		//負数であれば符号を反転する
		int absoluteValue = inputValue < 0 ? -inputValue : inputValue;
		//絶対値を返す
		return absoluteValue;
	}

	/*
	 * 関数名:absolute
	 * 概要:入力された値の絶対値を求める
	 * 引数:inputValue 入力された値
	 * 戻り値:絶対値
	 * 作成者:M.Iizuka
	 * 作成日:2024/10/24
	 */
	public static long absolute(long inputValue) {
		//負数であれば符号を反転する
		long absoluteValue = inputValue < 0 ? -inputValue : inputValue;
		//絶対値を返す
		return absoluteValue;
	}

	/*
	 * 関数名:absolute
	 * 概要:入力された値の絶対値を求める
	 * 引数:inputValue 入力された値
	 * 戻り値:絶対値
	 * 作成者:M.Iizuka
	 * 作成日:2024/10/24
	 */
	public static float absolute(float inputValue) {
		//負数であれば符号を反転する
		float absoluteValue = inputValue < 0 ? -inputValue : inputValue;
		//絶対値を返す
		return absoluteValue;
	}

	/*
	 * 関数名:absolute
	 * 概要:入力された値の絶対値を求める
	 * 引数:inputValue 入力された値
	 * 戻り値:絶対値
	 * 作成者:M.Iizuka
	 * 作成日:2024/10/24
	 */
	public static double absolute(double inputValue) {
		//負数であれば符号を反転する
		double absoluteValue = inputValue < 0 ? -inputValue : inputValue;
		//絶対値を返す
		return absoluteValue;
	}

	/*
	 * 関数名:main
	 * 概要:整数xのint型、long型、float型、double型の絶対値を求め表示する
	 * 引数:なし
	 * 戻り値:なし
	 * 作成者:M.Iizuka
	 * 作成日:2024/10/24
	 */
	public static void main(String[] args) {
		//入力値を抽出する
		Scanner standardInput = new Scanner(System.in);

		//int型の整数値を入力してもらう
		System.out.print("int型整数：");
		//入力値を読み込む
		int intValue = standardInput.nextInt();
		//longe型の整数値を入力してもらう
		System.out.print("long型整数：");
		//入力値を読み込む
		long longValue = standardInput.nextLong();
		//float型の整数値を入力してもらう
		System.out.print("float型整数：");
		//入力値を読み込む
		float floatValue = standardInput.nextFloat();
		//double型の整数値を入力してもらう
		System.out.print("double型整数：");
		//入力値を読み込む
		double doubleValue = standardInput.nextDouble();
		
		//結果出力前に改行
		System.out.println("");
		//int型の絶対値
		System.out.println(intValue + "のint型の絶対値は" + absolute(intValue) + "です。");
		//long型の絶対値
		System.out.println(longValue + "のlong型の絶対値は" + absolute(longValue) + "です。");
		//float型の絶対値
		System.out.println(floatValue + "のfloat型の絶対値は" + absolute(floatValue) + "です。");
		//double型の絶対値
		System.out.println(doubleValue + "のdouble型の絶対値は" + absolute(doubleValue) + "です。");
	}

}
