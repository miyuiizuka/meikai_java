package Chapter03;

//入力ストリーム
import java.util.Scanner;

/*
 * クラス名:Exercise3_15
 * 概要:二つの整数値を降順にソートするプログラム
 * 作成者:M.Iizuka
 * 作成日:2024/10/07
 */
public class Exercise3_15 {

	/*
	 * 関数名:main
	 * 概要:二つの整数値を降順にソートするプログラム
	 * 引数:なし
	 * 戻り値:なし
	 * 作成者:M.Iizuka
	 * 作成日:2024/10/07
	 */
	public static void main(String[] args) {

		//入力された値を抽出する
		Scanner standardInput = new Scanner(System.in);

		//一つ目の変数の入力を促す
		System.out.print("整数ａ：");
		//入力された値を変数に格納する
		int firstInt = standardInput.nextInt();
		//二つ目の変数の入力を促す
		System.out.print("整数ｂ：");
		//入力された値を変数に格納する
		int secondInt = standardInput.nextInt();

		//一つ目のほうが大きい場合
		if (firstInt > secondInt) {
			//並べ替えるために変数に一つ目の値を保存する
			int sortInt = firstInt;
			//小さいほうを代入する
			firstInt = secondInt;
			//大きいほうを代入する
			secondInt = sortInt;
		}
		//降順にソートしたことを表示する
		System.out.println("ａ≦ｂとなるようにソートしました。");
		//ソート後の小さいほうの変数を出力する
		System.out.println("変数ａは" + firstInt + "です。");
		//ソート後の大きいほうの変数を出力する
		System.out.println("変数ｂは" + secondInt + "です。");
	}

}
