package Chapter07;

//入力ストリーム
import java.util.Scanner;

/*
 * クラス名:Exercise7_13
 * 概要:整数のposビット目を1にした値、0にした値、反転した値を表示する
 * 作成者:M.Iizuka
 * 作成日:2024/10/21
 */
public class Exercise7_13 {
	//int型のビット数
	static final int INT_MOST_SIGNIFICANT_BITS = 31;

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
			System.out.print(((inputInt >>> bitIndex & 1) == 1) ? '1' : '0');
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
	 * 関数名:set
	 * 概要:整数のposビット目を1にした値を返す
	 * 引数:inputInt 入力した整数, posBit 何ビット目の値か
	 * 戻り値:setInt posビット目を1にした値
	 * 作成者:M.Iizuka
	 * 作成日:2024/10/21
	 */
	public static int set(int inputInt, int posBit) {
		//posビット目を1にした値
		int setInt = 0;
		//posビット目が0の場合
		if ((inputInt >>> posBit & 1) == 0) {
			//posビット目を1にした値を求める
			setInt = inputInt + calculatePower(posBit);
			//posビット目が1の場合
		} else {
			//何も変えずに入力値をそのまま返す
			setInt = inputInt;
		}
		//posビット目を1にした値を返す
		return setInt;
	}

	/*
	 * 関数名:reset
	 * 概要:整数のposビット目を0にした値を返す
	 * 引数:inputInt 入力した整数, posBit 何ビット目の値か
	 * 戻り値:resetInt posビット目を0にした値
	 * 作成者:M.Iizuka
	 * 作成日:2024/10/21
	 */
	public static int reset(int inputInt, int posBit) {
		//posビット目を0にした値
		int resetInt = 0;
		//posビット目が1の場合
		if ((inputInt >>> posBit & 1) == 1) {
			//posビット目を0にした値を求める
			resetInt = inputInt - calculatePower(posBit);
			//posビット目が0の場合
		} else {
			//何も変えずに入力値をそのまま返す
			resetInt = inputInt;
		}
		//posビット目を0にした値を返す
		return resetInt;
	}

	/*
	 * 関数名:inverse
	 * 概要:整数のposビット目を反転した値を返す
	 * 引数:inputInt 入力した整数, posBit 何ビット目の値か
	 * 戻り値:inverseInt posビット目を反転した値
	 * 作成者:M.Iizuka
	 * 作成日:2024/10/21
	 */
	public static int inverse(int inputInt, int posBit) {
		//posビット目を反転した値
		int inverseInt = 0;
		//posビット目が1の場合
		if ((inputInt >>> posBit & 1) == 1) {
			//posビット目を0にした値を求める
			inverseInt = inputInt - calculatePower(posBit);
			//posビット目が0の場合
		} else {
			//posビット目を1にした値を求める
			inverseInt = inputInt + calculatePower(posBit);
		}
		//posビット目を反転した値を返す
		return inverseInt;
	}

	/*
	 * 関数名:main
	 * 概要:整数のposビット目を1にした値、0にした値、反転した値を表示する
	 * 引数:なし
	 * 戻り値:なし
	 * 作成者:M.Iizuka
	 * 作成日:2024/10/21
	 */
	public static void main(String[] args) {
		//入力値を抽出する
		Scanner standardInput = new Scanner(System.in);
		//整数値の入力を促す
		System.out.print("整数：");
		//入力値を読み込む
		int inputInt = standardInput.nextInt();
		//回転させるビット数
		int posBit = 0;
		//回転させるビット数を入力してもらう
		do {
			//回転させるビット数の入力を促す
			System.out.print("何ビット目：");
			//入力値を読み込む
			posBit = standardInput.nextInt();
			//最上位ビット数を超えたら
			if (posBit > INT_MOST_SIGNIFICANT_BITS) {
				//不正解であることを表示
				System.out.println(INT_MOST_SIGNIFICANT_BITS + "以下で入力してください。");
			}
		} while (posBit > INT_MOST_SIGNIFICANT_BITS);

		//入力された整数のビット構成を表示する
		System.out.println("\n整数" + inputInt + "のビット構成");
		//入力された整数のビット構成を表示
		printBits(inputInt);
		//posビット目を1にした値を表示
		System.out.println("\n" + posBit + "ビット目を1にした値");
		//posビット目を1にした値を求め、そのビット構成を表示する		
		printBits(set(inputInt, posBit));
		//posビット目を0にした値を表示
		System.out.println("\n" + posBit + "ビット目を0にした値");
		//posビット目を1にした値を求め、そのビット構成を表示する		
		printBits(reset(inputInt, posBit));
		//posビット目を反転した値を表示
		System.out.println("\n" + posBit + "ビット目を反転した値");
		//posビット目を反転した値を求め、そのビット構成を表示する
		printBits(inverse(inputInt, posBit));
	}

}
