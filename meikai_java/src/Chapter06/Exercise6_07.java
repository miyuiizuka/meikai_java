package Chapter06;

//乱数ストリーム
import java.util.Random;
//入力ストリーム
import java.util.Scanner;

/*
 * クラス名:Exercise6_07
 * 概要:探索するキー値と同じ値の要素が複数個存在する場合、最も末尾側に位置する要素を見つけるプログラム
 * 作成者:M.Iizuka
 * 作成日:2024/10/15
 */
public class Exercise6_07 {

	/*
	 * 関数名:main
	 * 概要:探索するキー値と同じ値の要素が複数個存在する場合、最も末尾側に位置する要素を見つける
	 * 引数:なし
	 * 戻り値:なし
	 * 作成者:M.Iizuka
	 * 作成日:2024/10/15
	 */
	public static void main(String[] args) {
		//乱数を抽出する
		Random randomNumber = new Random();
		//入力値を抽出する
		Scanner standardInput = new Scanner(System.in);

		//要素数
		final int SUM_ELEMENT = 12;
		//配列を宣言
		int[] randomNumberArray = new int[SUM_ELEMENT];
		//生成する乱数の最大値
		int maxRandomNumber = 9;

		//それぞれの要素に乱数を格納する
		for (int elementIndex = 0; elementIndex < SUM_ELEMENT; elementIndex++) {
			//要素に0～9の乱数を読み込む
			randomNumberArray[elementIndex] = randomNumber.nextInt(maxRandomNumber + 1);
		}

		//配列の全要素の値を表示することを伝える
		System.out.print("配列randomNumberArrayの全要素の値\n{ ");
		//全要素の値を表示する
		for (int elementIndex = 0; elementIndex < SUM_ELEMENT; elementIndex++) {
			//要素の値を表示する
			System.out.print(randomNumberArray[elementIndex] + " ");
		}
		//全要素の値を表示した後の記号
		System.out.println("}");

		//探す値
		int keyNumber = 0;

		//探す値の入力をしてもらう
		do {
			//探す値の入力を促す
			System.out.print("探す数値：");
			//入力値を読み込む
			keyNumber = standardInput.nextInt();
			//不正な値が入力された場合
			if (keyNumber < 0 || keyNumber > maxRandomNumber) {
				//不正であることを表示
				System.out.println("0～9の数値を入力してください。");
			}
			//正しい数値が入力されるまで繰り返す
		} while (keyNumber < 0 || keyNumber > maxRandomNumber);

		//数値を探すためのインデックス
		int keyIndex = 0;
		//逆から数値を探す
		for (keyIndex = SUM_ELEMENT-1; keyIndex >= 0; keyIndex--) {
			//数値が見つかった場合
			if (randomNumberArray[keyIndex] == keyNumber) {
				//探索終了
				break;
			}
		}
		//数値が見つかった場合の出力
		if (keyIndex >= 0) {
			//探索成功の結果を表示
			System.out.println("それはrandomNumberArray[" + keyIndex + "]にあります。");
			//数値が見つからなかった場合
		} else {
			//探索失敗の結果を表示
			System.out.println("それはありません。");
		}
	}

}
