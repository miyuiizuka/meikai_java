package Chapter07;

//入力ストリーム
import java.util.Scanner;

/*
 * クラス名:Exercise7_12
 * 概要:整数を左右に指定分ビット回転した値を表示する
 * 作成者:M.Iizuka
 * 作成日:2024/10/21
 */
public class Exercise7_12 {

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
	 * 関数名:rRotate
	 * 概要:整数を右に指定分ビット回転した値を返す
	 * 引数:inputInt 入力された整数. rotateBits 回転させるビット数
	 * 戻り値:rRotateInt ビット回転後の値	 
	 * 作成者:M.Iizuka
	 * 作成日:2024/10/21
	 */
	public static int rRotate(int inputInt, int rotateBits) {
		//ビット回転後の値
		int rRotateInt = 0;
		//回転後のビット構成を求める
		for (int bitIndex = 31; bitIndex >= 0; bitIndex--) {
			//回転後の二進数の値
			int binaryInt = ((inputInt >>> (bitIndex + rotateBits) & 1) == 1) ? 1 : 0;
			//べき乗の底
			final int BASE_INT = 2;
			//べき乗した結果
			int powerInt = 1;
			//べき乗後の値を求める
			for (int exponentIndex = 0; exponentIndex < bitIndex; exponentIndex++) {
				//べき乗後の値
				powerInt *= BASE_INT;
			}
			//二進数を十進数に変換
			binaryInt *= powerInt;
			//ビット回転後の値を求める
			rRotateInt += binaryInt;
		}
		//ビット回転後の値を返す
		return rRotateInt;
	}

	/*
	 * 関数名:lRotate
	 * 概要:整数を左に指定分ビット回転した値を返す
	 * 引数:inputInt 入力された整数. rotateBits 回転させるビット数
	 * 戻り値:lRotateInt ビット回転後の値	 
	 * 作成者:M.Iizuka
	 * 作成日:2024/10/21
	 */

	public static int lRotate(int inputInt, int rotateBits) {
		//ビット回転後の値
		int lRotateInt = 0;
		//左への回転を右への回転に変換
		rotateBits = 32 - rotateBits;

		//回転後のビット構成を求める
		for (int bitIndex = 31; bitIndex >= 0; bitIndex--) {
			//回転後の二進数の値
			int binaryInt = ((inputInt >>> (bitIndex + rotateBits) & 1) == 1) ? 1 : 0;
			//べき乗の底
			final int BASE_INT = 2;
			//べき乗した結果
			int powerInt = 1;
			//べき乗後の値を求める
			for (int exponentIndex = 0; exponentIndex < bitIndex; exponentIndex++) {
				//べき乗後の値
				powerInt *= BASE_INT;
			}
			//二進数を十進数に変換
			binaryInt *= powerInt;
			//ビット回転後の値を求める
			lRotateInt += binaryInt;
		}
		//ビット回転後の値を返す
		return lRotateInt;
	}

	/*
	 * 関数名:main
	 * 概要:整数を左右に指定分ビット回転した値を表示する
	 * 引数:なし
	 * 戻り値:なし	 
	 * 作成者:M.Iizuka
	 * 作成日:2024/10/21
	 */
	public static void main(String[] args) {
		//入力値を抽出する
		Scanner standardInput = new Scanner(System.in);
		//整数値の入力を促す
		System.out.print("整数値：");
		//入力値を読み込む
		int inputInt = standardInput.nextInt();
		//回転させるビット数の入力を促す
		System.out.print("ビット数：");
		//入力値を読み込む
		int rotateBits = standardInput.nextInt();

		//入力された整数のビット構成を表示する
		System.out.println("\n整数" + inputInt + "のビット構成");
		//入力された整数のビット構成を表示
		printBits(inputInt);
		//右に回転した値を表示
		System.out.println("\n右に" + rotateBits + "ビット回転した値");
		//右に回転した値を求める
		int rRotateInt = rRotate(inputInt, rotateBits);
		//右に回転した値のビット構成を表示
		printBits(rRotateInt);
		//左に回転した値を表示
		System.out.println("\n左に" + rotateBits + "ビット回転した値");
		//左に回転した値を求める
		int lRotateInt = lRotate(inputInt, rotateBits);
		//右に回転した値のビット構成を表示
		printBits(lRotateInt);
	}

}
