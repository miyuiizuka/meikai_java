package Chapter03;

//入力ストリーム
import java.util.Scanner;

/*
 * クラス名:Exercise3_4
 * 概要:二つの変数に値を読み込み、その大小関係を表示するプログラム
 * 作成者:M.Iizuka
 * 作成日:2024/10/03
 */
public class Exerscise3_4 {

	/*
	 * 関数名:main
	 * 概要:二つの変数に値を読み込み、その大小関係を表示する
	 * 引数:なし
	 * 戻り値:なし
	 * 作成者:M.Iizuka
	 * 作成日:2024/10/03
	 */
	public static void main(String[] args) {
		
		//キーボードから読み込んだ値を抽出する
		Scanner standardInput = new Scanner(System.in);
		
		//変数aの入力を促す
		System.out.print("変数a：");
		//aに入力された値を読み込む
		double a = standardInput.nextDouble();
		//変数bの入力を促す
		System.out.print("変数b：");
		//bに入力された値を読み込む
		double b = standardInput.nextDouble();
				
		//aとbが同じ値であるかを判定する
		if ( a != b ) {
			
			//aがbより大きいかどうかを判定する
			if ( a > b ) {
				//aがbより大きい場合の結果を出力する
				System.out.println("aの方が大きいです。");
			//bがaより大きい場合
			} else {
				//結果を出力する
				System.out.println("ｂの方が大きいです。");	
			}
			
		//ａとｂが同じ場合
		} else {
			//結果を出力する
			System.out.println("ａとｂは同じ値です。");
			
		}
	}

}
