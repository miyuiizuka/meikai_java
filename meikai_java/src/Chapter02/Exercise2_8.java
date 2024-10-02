package Chapter02;

//乱数ストリーム
import java.util.Random;
//入力ストリーム
import java.util.Scanner;

/*
 * クラス名:Exercise2_8
 * 概要:キーボードから読み込んだ整数値プラスマイナス5の範囲の整数値をランダムに生成して表示するプログラム
 * 作成者:M.Iizuka
 * 作成日:2024/10/02
 */
public class Exercise2_8 {
	
	/*
	 * 関数名:main
	 * 概要:キーボードから読み込んだ整数値プラスマイナス5の範囲の整数値をランダムに生成して表示する
	 * 引数:なし
	 * 戻り値:なし
	 * 作成者:M.Iizuka
	 * 作成日:2024/10/02
	 */
	public static void main(String[] args) {
		
		//キーボードから読み込んだ値を抽出するための変数を宣言する
		Scanner standardInput = new Scanner(System.in);
		//整数値の入力を促す
		System.out.print("整数値：");
		//整数値を読み込み、変数に格納する
		int inputInt = standardInput.nextInt();
		//加減する整数値の範囲を変数に格納する
		int rangeInt = 5;
		
		//生成される整数値の範囲の最大値を求める
		int maxInt = inputInt + rangeInt;
		//最大値から引く乱数の範囲を求める
		int rangeRandom = rangeInt * 2 + 1;
		
		//乱数を抽出するための変数を宣言する
		Random randomInt = new Random();
		//最大値から引く乱数を生成する
		int minusRandomInt = randomInt.nextInt( rangeRandom );
		//ランダムに生成された整数値を出力する
		System.out.println("その値の±5の乱数を生成しました。それは" + (maxInt - minusRandomInt) + "です。");
				
		
	}

}
