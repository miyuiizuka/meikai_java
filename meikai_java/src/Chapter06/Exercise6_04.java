package Chapter06;

//乱数ストリーム
import java.util.Random;
//入力ストリーム
import java.util.Scanner;

/*
 * クラス名:Exercise6‗04
 * 概要:配列の全要素に乱数を代入して縦向きの棒グラフで表示するプログラム
 * 作成者:M.Iizuka
 * 作成日:2024/10/11
 */
public class Exercise6_04 {

	/*
	 * 関数名:main
	 * 概要:配列の全要素に乱数を代入して縦向きの棒グラフで表示する
	 * 引数:なし
	 * 戻り値:なし
	 * 作成者:M.Iizuka
	 * 作成日:2024/10/11
	 */
	public static void main(String[] args) {
		//乱数を抽出する
		Random randomNumber = new Random();
		//入力値を抽出する
		Scanner standardInput = new Scanner(System.in);

		//要素数の入力値の変数
		int sumElement = 0;
		//生成する乱数の最大値
		int maxRandom = 10;
		//乱数生成の調整値
		int adjustRandom = 1;

		//正の整数値で要素数を入力してもらう
		do {
			//要素数の入力を促す
			System.out.print("要素数：");
			//入力値を読み込む
			sumElement = standardInput.nextInt();
			//不正であることを知らせる
			if (sumElement <= 0) {
				System.out.println("正の整数を入力してください。");
			}
			//正の整数値でなければ入力し直す
		} while (sumElement <= 0);

		//グラフの数値を格納する配列を用意
		int[] graphArray = new int[sumElement];

		//グラフの数値を配列に格納する
		for (int elementNumber = 0; elementNumber < sumElement; elementNumber++) {
			//グラフの数値をランダムに決める
			graphArray[elementNumber] = adjustRandom + randomNumber.nextInt(maxRandom);
		}

		//グラフの数値を表示させる
		for (int value = maxRandom; value > 0; value--) {
			//全要素を表示させる
			for (int elementNumber = 0; elementNumber < sumElement; elementNumber++) {
				//グラフの数値が満たない場合
				if (value - graphArray[elementNumber] > 0) {
					//何も表示しない
					System.out.print("  ");
					//グラフの数値が満ちている場合
				} else {
					//記号を表示する
					System.out.print("* ");
				}
			}
			//要素の数値の1メモリごとに改行
			System.out.println("");
		}

		//グラフの下線の記号の個数
		int sumUnderLine = sumElement * 2 - 1;
		//グラフの下線を出力
		for (int underLine = 0; underLine < sumUnderLine; underLine++) {
			System.out.print("-");
		}
		//グラフとグラフ下のメモリの間で改行
		System.out.println("");

		//グラフの下にメモリを表示
		for (int indexNumber = 0; indexNumber < sumElement; indexNumber++) {
			//表示させるメモリ
			int memoryNumber = indexNumber % 10;
			//グラフの下にメモリを表示
			System.out.print(memoryNumber + " ");
		}
	}
}
