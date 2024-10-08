package Chapter04;

//入力ストリーム
import java.util.Scanner;

/*
 * クラス名:Exercise4_06_2
 * 概要:読み込んだ個数だけ記号を連続して表示するプログラム
 * ただし、読み込んだ値が１未満であれば改行文字を出力しない。
 * 作成者:M.Iizuka
 * 作成日:2024/10/08
 */
public class Exercise4_06_2 {

	/*
	 * 関数名:main
	 * 概要:読み込んだ個数だけ記号を連続して表示する（ループ回数の初期値が1の場合）
	 * 引数:なし
	 * 戻り値:なし
	 * 作成者:M.Iizuka
	 * 作成日:2024/10/08 
	 */
	public static void main(String[] args) {
		//入力された値を抽出する
		Scanner standardInput = new Scanner(System.in);

		//個数の入力を促す
		System.out.print("何個*を表示しますか：");
		//入力された値
		int inputInt = standardInput.nextInt();

		//ループ回数の初期値
		int indexNumber = 1;
		//ループ回数の初期値より大きい数値を入力した場合
		if (inputInt >= indexNumber) {

			//入力された回数分、繰り返す
			while (indexNumber <= inputInt) {
				//＊を出力
				System.out.print('*');
				//ループ回数を一つカウント
				indexNumber++;
			}
			//改行
			System.out.println();
		}
	}

}
