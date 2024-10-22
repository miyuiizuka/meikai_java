package Chapter07;

//入力ストリーム
import java.util.Scanner;

/*
 * クラス名:Exercise7_14
 * 概要:整数のposビット目を最下位として連続するn個のビットを、
 * 1にした値、0にした値、反転した値を表示する
 * 作成者:M.Iizuka
 * 作成日:2024/10/22
 */
public class Exercise7_14 {
	//int型のビット数
	static final int INT_MOST_SIGNIFICANT_BITS = 31;

	/*
	 * 関数名:checkInputValue
	 * 概要:入力値チェック
	 * 引数:minimumValue 下限, maxValue 上限
	 * 戻り値:inputError 入力チェック結果
	 * 作成者:M.Iizuka
	 * 作成日:2024/10/22
	 */
	public static boolean checkInputValue(int inputValue, int inputMinimumValue, int inputMaxValue) {
		//不正な入力値
		boolean inputError = true;
		//入力値が不正な場合
		if (inputValue < inputMinimumValue || inputValue > inputMaxValue) {
			//不正であることを表示
			System.out.println(inputMinimumValue + "以上" + inputMaxValue + "以下で入力してください。");
			//入力値が正しい場合
		} else {
			//何も表示しない
			inputError = false;
		}
		//入力値が正しいか返す
		return inputError;
	}

	/*
	 * 関数名:confirmtBit
	 * 概要:int型のビットの値を確認
	 * 引数:inputInt 入力された整数
	 * 戻り値:bitValue
	 * 作成者:M.Iizuka
	 * 作成日:2024/10/21
	 */
	public static int confirmBit(int inputInt, int bitIndex) {
		//ビットの値
		int bitValue = 0;
		//ビットの値を確認
		bitValue = (((inputInt >>> bitIndex & 1) == 1) ? 1 : 0);
		//ビットの値を返す
		return bitValue;
	}

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
		for (int bitIndex = INT_MOST_SIGNIFICANT_BITS; bitIndex >= 0; bitIndex--) {
			//ビット構成を表示
			System.out.print(confirmBit(inputInt, bitIndex));
		}
	}

	/*
	 * 関数名:calculatePower
	 * 概要:posBit乗の計算
	 * 引数:posBit 何ビット目の値か
	 * 戻り値:powerInt posBit乗後の値
	 * 作成者:M.Iizuka
	 * 作成日:2024/10/21
	 */
	public static int calculatePower(int posBit) {
		//べき乗の底
		final int BASE_INT = 2;
		//べき乗した結果
		int powerInt = 1;
		//べき乗後の値を求める
		for (int exponentIndex = 0; exponentIndex < posBit; exponentIndex++) {
			//べき乗後の値
			powerInt *= BASE_INT;
		}
		//posBit乗後の値を返す
		return powerInt;
	}

	/*
	 * 関数名:setN
	 * 概要:整数のposビット目を最下位として連続するn個のビットを1にした値を返す
	 * 引数:inputValue 入力された整数, posBit 最下位とするビット, consecutiveValue 連続するビット数
	 * 戻り値:setValue 1にした値
	 * 作成者:M.Iizuka
	 * 作成日:2024/10/22
	 */
	public static int setN(int inputValue, int posBit, int consecutiveValue) {
		//1にした値
		int setValue = 0;
		//整数のビット構成を調べ、十進数の値を求める
		for (int bitIndex = INT_MOST_SIGNIFICANT_BITS; bitIndex >= 0; bitIndex--) {
			//1をセットするビットの場合
			if (bitIndex < (posBit + consecutiveValue) && bitIndex >= posBit) {
				//1にセットした十進数の値を足す
				setValue += calculatePower(bitIndex);
				//何も変えないビットの場合
			} else {
				//ビットの十進数の値を足す
				setValue += ((confirmBit(inputValue, bitIndex)) * calculatePower(bitIndex));
			}
		}
		//1にした値を返す
		return setValue;
	}

	/*
	 * 関数名:resetN
	 * 概要:整数のposビット目を最下位として連続するn個のビットを0にした値を返す
	 * 引数:inputValue 入力された整数, posBit 最下位とするビット, consecutiveValue 連続するビット数
	 * 戻り値:resetValue 0にした値
	 * 作成者:M.Iizuka
	 * 作成日:2024/10/22
	 */
	public static int resetN(int inputValue, int posBit, int consecutiveValue) {
		//0にした値
		int resetValue = 0;
		//整数のビット構成を調べ、十進数の値を求める
		for (int bitIndex = INT_MOST_SIGNIFICANT_BITS; bitIndex >= 0; bitIndex--) {
			//0をセットするビットの場合
			if (bitIndex < (posBit + consecutiveValue) && bitIndex >= posBit) {
				//何も足さない
				resetValue += 0;
				//何も変えないビットの場合
			} else {
				//ビットの十進数の値を足す
				resetValue += (confirmBit(inputValue, bitIndex) * calculatePower(bitIndex));
			}
		}
		//0にした値を返す
		return resetValue;
	}

	/*
	 * 関数名:inverseN
	 * 概要:整数のposビット目を最下位として連続するn個のビットを反転した値を返す
	 * 引数:inputValue 入力された整数, posBit 最下位とするビット, consecutiveValue 連続するビット数
	 * 戻り値:inverseNValue 反転した値
	 * 作成者:M.Iizuka
	 * 作成日:2024/10/22
	 */
	public static int inverseN(int inputValue, int posBit, int consecutiveValue) {
		//反転した値
		int inverseValue = 0;
		//整数のビット構成を調べ、十進数の値を求める
		for (int bitIndex = INT_MOST_SIGNIFICANT_BITS; bitIndex >= 0; bitIndex--) {
			//反転した値をセットするビットの場合
			if (bitIndex < (posBit + consecutiveValue) && bitIndex >= posBit) {
				//1をセットするビットの場合
				if (confirmBit(inputValue, bitIndex) == 0) {
					//ビットの十進数の値を足す
					inverseValue += calculatePower(bitIndex);
					//0をセットするビットの場合
				} else {
					//何も足さない
					inverseValue += 0;
				}
				//何も変えないビットの場合
			} else {
				//ビットの十進数の値を求める
				inverseValue += (confirmBit(inputValue, bitIndex) * calculatePower(bitIndex));
			}
		}
		//反転した値を返す
		return inverseValue;
	}

	/*
	 * 関数名:main
	 * 概要:整数のposビット目を最下位として連続するn個のビットを、
	 * 1にした値、0にした値、反転した値を表示する
	 * 引数:なし
	 * 戻り値:なし
	 * 作成者:M.Iizuka
	 * 作成日:2024/10/22
	 */
	public static void main(String[] args) {
		//入力値を抽出する
		Scanner standardInput = new Scanner(System.in);
		//入力値チェック変数
		boolean inputError = true;
		//入力値の下限
		int inputMinimumValue = 0;
		//入力値の上限
		int inputMaxValue = 0;

		//整数値の入力を促す
		System.out.print("整数：");
		//入力値を読み込む
		int inputValue = standardInput.nextInt();

		//最下位ビット
		int posBit = 0;
		//最下位ビット入力チェック
		do {
			//最下位とするposビットの入力を促す
			System.out.print("最下位とするビット：");
			//入力値を読み込む
			posBit = standardInput.nextInt();
			//下限
			inputMinimumValue = 0;
			//上限
			inputMaxValue = INT_MOST_SIGNIFICANT_BITS;
			//入力チェック
			inputError = checkInputValue(posBit, inputMinimumValue, inputMaxValue);
			//入力値が不正であれば繰り返す
		} while (inputError);

		//連続するビット数
		int consecutiveValue = 0;
		//連続するビット数入力チェック
		do {
			//連続するビット数の入力を促す
			System.out.print("連続するビット数：");
			//入力値を読み込む
			consecutiveValue = standardInput.nextInt();
			//下限
			inputMinimumValue = 1;
			//上限
			inputMaxValue = INT_MOST_SIGNIFICANT_BITS - posBit + 1;
			//入力チェック
			inputError = checkInputValue(consecutiveValue, inputMinimumValue, inputMaxValue);
			//入力値が不正であれば繰り返す
		} while (inputError);

		//入力された整数のビット構成を表示する
		System.out.println("\n整数" + inputValue + "のビット構成");
		//入力された整数のビット構成を表示
		printBits(inputValue);
		//整数のposビット目を最下位として連続するn個のビットを1にした値を表示する
		System.out.println("\n1にした値");
		//整数のposビット目を最下位として連続するn個のビットを1にした値を表示する
		printBits(setN(inputValue, posBit, consecutiveValue));
		//整数のposビット目を最下位として連続するn個のビットを0にした値を表示する
		System.out.println("\n0にした値");
		//整数のposビット目を最下位として連続するn個のビットを0にした値を表示する
		printBits((resetN(inputValue, posBit, consecutiveValue)));
		//整数のposビット目を最下位として連続するn個のビットを反転した値を表示する
		System.out.println("\n反転した値");
		//整数のposビット目を最下位として連続するn個のビットを反転した値を表示する
		printBits((inverseN(inputValue, posBit, consecutiveValue)));
	}

}
