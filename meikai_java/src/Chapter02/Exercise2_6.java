package Chapter02;

//入力ストリーム
import java.util.Scanner;

/*
 * クラス名:Exercise2_6
 * 概要:三角形の底辺と高さを読み込んで、その面積を表示するプログラム
 * 作成者:M.Iizuka
 * 作成日:2024/10/02
 */
public class Exercise2_6 {

	/*
	 * 関数名:main
	 * 概要:三角形の底辺と高さを読み込んで、その面積を表示する
	 * 引数:なし
	 * 戻り値:なし
	 * 作成者:M.Iizuka
	 * 作成日:2024/10/02
	 */
	public static void main(String[] args) {
		
		//プログラム内容の説明を表示する
		System.out.println("三角形の面積を求めます。");
		
		//キーボードから読み込んだ値を抽出するための変数を宣言する
		Scanner standardInput = new Scanner(System.in);
		
		//底辺の入力を促す
		System.out.print("底辺：");
		//底辺の変数に実数値を読み込む
		double baseNumber = standardInput.nextDouble();
		
		//高さの入力を促す
		System.out.print("高さ：");
		//高さの変数に実数値を読み込む
		double heightNumber = standardInput.nextDouble();
		
		//面積を計算し出力する
		System.out.println("面積は" + baseNumber * heightNumber / 2 + "です。");
				

	}

}
