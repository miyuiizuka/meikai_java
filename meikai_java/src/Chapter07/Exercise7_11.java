package Chapter07;

//入力ストリーム
import java.util.Scanner;

/*
 * クラス名:Exercise7_11
 * 概要:整数を左右にシフトした値が、２のべき乗での乗算や除算と等しくなることを確認するプログラム
 * 作成者:M.Iizuka
 * 作成日:2024/10/21
 */

public class Exercise7_11 {

	/*
	 * 関数名:printBits
	 * 概要:int型のビット構成を表示
	 * 引数:inputInt 入力された整数
	 * 戻り値:なし
	 * 作成者:M.Iizuka
	 * 作成日:2024/10/21
	 */
	public static void printBits(int inputInt) {
		//ビット構成を調べる
		for (int bitIndex = 31; bitIndex >= 0; bitIndex--) {
			//ビット構成を表示
			System.out.print(((inputInt >>> bitIndex & 1) == 1) ? '1' : '0');
		}
	}

	/*
	 * 関数名:main	
	 * 概要:整数を左右にシフトした値が、２のべき乗での乗算や除算と等しくなることを確認する
	 * 引数:なし
	 * 戻り値:なし
	 * 作成者:M.Iizuka
	 * 作成日:2024/10/21
	 */
	public static void main(String[] args) {
		//入力値を抽出する
		Scanner standardInput = new Scanner(System.in);

		//整数の入力を促す
		System.out.print("整数：");
		//入力値を読み込む
		int inputInt = standardInput.nextInt();
		//シフトする値の入力を促す
		System.out.print("シフトするビット数：");
		//入力値を読み込む
		int shiftBits = standardInput.nextInt();

		//入力された整数のビット構成を表示する
		System.out.println("\n整数" + inputInt + "のビット構成");
		//入力された整数のビット構成を表示
		printBits(inputInt);
		//左シフトした値を表示する
		System.out.println("\n左にシフトした値");
		//左シフトした値を二進数で表示する
		printBits((inputInt << shiftBits));
		//右シフトした値を表示する
		System.out.println("\n右にシフトした値");
		//右シフトした値を二進数で表示する
		printBits((inputInt >> shiftBits));
		//べき乗の底
		final int BASE_INT = 2;
		//べき乗した結果
		int powerInt = 1;
		//べき乗後の値を求める
		for (int exponentIndex = 0; exponentIndex < shiftBits; exponentIndex++) {
			//べき乗後の値
			powerInt *= BASE_INT;
		}

		//整数を2のべき乗で乗算した値を表示
		System.out.println("\n" + BASE_INT + "の" + shiftBits + "乗で乗算した値");
		//整数を2のべき乗で乗算した値
		printBits(inputInt * powerInt);
		//整数を2のべき乗で除算した値を表示
		System.out.println("\n" + BASE_INT + "の" + shiftBits + "乗で除算した値");
		//整数を2のべき乗で除算した値
		printBits(inputInt / powerInt);
	}

}