package Chapter07;

//入力ストリーム
import java.util.Scanner;

/*
 * クラス名:Exercise7_32
 * 概要:byte型、short型、int型、long型数値の内部のビットを表示する
 * 作成者:M.Iizuka
 * 作成日:2024/10/24
 */
public class Exercise7_32 {

	/*
	 * 関数名:prinBits
	 * 概要:内部のビットを表示
	 * 引数:inputValue 入力された値
	 * 戻り値:なし
	 * 作成者:M.Iizuka
	 * 作成日:2024/10/24
	 */
	public static void printBits(byte inputValue) {
		//型の最上位ビット
		final int MOST_SIGNIFICANT_BIT = 7;
		//ビット構成を表示
		for (int bitIndex = MOST_SIGNIFICANT_BIT; bitIndex >= 0; bitIndex--) {
			//最上位ビットからビット値を表示
			System.out.print(((inputValue >>> bitIndex & 1) == 1) ? '1' : '0');
		}
	}

	/*
	 * 関数名:prinBits
	 * 概要:内部のビットを表示
	 * 引数:inputValue 入力された値
	 * 戻り値:なし
	 * 作成者:M.Iizuka
	 * 作成日:2024/10/24
	 */
	public static void printBits(short inputValue) {
		//型の最上位ビット
		int MOST_SIGNIFICANT_BIT = 15;
		//ビット構成を表示
		for (int bitIndex = MOST_SIGNIFICANT_BIT; bitIndex >= 0; bitIndex--) {
			//最上位ビットからビット値を表示
			System.out.print(((inputValue >>> bitIndex & 1) == 1) ? '1' : '0');
		}
	}

	/*
	 * 関数名:prinBits
	 * 概要:内部のビットを表示
	 * 引数:inputValue 入力された値
	 * 戻り値:なし
	 * 作成者:M.Iizuka
	 * 作成日:2024/10/24
	 */
	public static void printBits(int inputValue) {
		//型の最上位ビット
		int MOST_SIGNIFICANT_BIT = 31;
		//ビット構成を表示
		for (int bitIndex = MOST_SIGNIFICANT_BIT; bitIndex >= 0; bitIndex--) {
			//最上位ビットからビット値を表示
			System.out.print(((inputValue >>> bitIndex & 1) == 1) ? '1' : '0');
		}
	}

	/*
	 * 関数名:prinBits
	 * 概要:内部のビットを表示
	 * 引数:inputValue 入力された値
	 * 戻り値:なし
	 * 作成者:M.Iizuka
	 * 作成日:2024/10/24
	 */
	public static void printBits(long inputValue) {
		//型の最上位ビット
		int MOST_SIGNIFICANT_BIT = 63;
		//ビット構成を表示
		for (int bitIndex = MOST_SIGNIFICANT_BIT; bitIndex >= 0; bitIndex--) {
			//最上位ビットからビット値を表示
			System.out.print(((inputValue >>> bitIndex & 1) == 1) ? '1' : '0');
		}
	}

	/*
	 * 関数名:main
	 * 概要:byte型、short型、int型、long型数値の内部のビットを表示する
	 * 引数:なし
	 * 戻り値:なし
	 * 作成者:M.Iizuka
	 * 作成日:2024/10/24
	 */
	public static void main(String[] args) {
		//入力値を抽出する
		Scanner standardInput = new Scanner(System.in);
		//byte型の整数値を入力してもらう
		System.out.print("byte型整数：");
		//入力値を読み込む
		byte byteValue = standardInput.nextByte();
		//short型の整数値を入力してもらう
		System.out.print("short型整数：");
		//入力値を読み込む
		short shortValue = standardInput.nextShort();
		//int型の整数値を入力してもらう
		System.out.print("int型整数：");
		//入力値を読み込む
		int intValue = standardInput.nextInt();
		//long型の整数値を入力してもらう
		System.out.print("long型整数：");
		//入力値を読み込む
		long longValue = standardInput.nextLong();

		//改行しbyte型のビット構成を表示
		System.out.println("");
		//byte型整数のビット構成を表示
		printBits(byteValue);
		//改行しshort型のビット構成を表示
		System.out.println("");
		//short型整数のビット構成を表示
		printBits(shortValue);
		//改行しint型のビット構成を表示
		System.out.println("");
		//int型整数のビット構成を表示
		printBits(intValue);
		//改行しlong型のビット構成を表示
		System.out.println("");
		//long型整数のビット構成を表示
		printBits(longValue);
	}

}
