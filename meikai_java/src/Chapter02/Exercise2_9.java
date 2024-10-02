package Chapter02;

//乱数ストリーム
import java.util.Random;

/*
 * クラス名:Exercise2_9
 * 概要:0.0以上1.0未満、0.0以上10.0未満、-1.0以上1.0未満のそれぞれの実数値をランダムに生成して表示するプログラム
 * 作成者:M.Iizuka
 * 作成日:2024/10/02
 */
public class Exercise2_9 {

	/*
	 * 関数名:main
	 * 概要:0.0以上1.0未満、0.0以上10.0未満、-1.0以上1.0未満のそれぞれの実数値をランダムに生成して表示する
	 * 引数:なし
	 * 戻り値:なし
	 * 作成者:M.Iizuka
	 * 作成日:2024/10/02
	 */
	public static void main(String[] args) {
		
		//乱数を抽出するための変数を宣言する
		Random randomNumber = new Random();
		//0.0以上1.0未満の実数値をランダムに生成する
		double randomDouble = randomNumber.nextDouble();
		
		//0.0以上1.0未満の生成された実数値を表示する
		System.out.println( randomDouble );
		
		//0.0以上1.0未満の実数値をランダムに生成する
		randomDouble = randomNumber.nextDouble();
		//10.0未満になる整数値の最大値を設定する
		int maxInt = 10; 
		//整数値をランダムに生成する
		int randomInt = randomNumber.nextInt( maxInt );
		//0.0以上10.0未満の生成された実数値（実数値＋整数値）を表示する
		System.out.println( randomDouble + randomInt );
		
		//0.0以上1.0未満の実数値をランダムに生成する
		randomDouble = randomNumber.nextDouble();
		//実数値の最大値を変数に格納する
		maxInt = 1;
		//実数値の最小値を変数に格納する
		int minimumInt = -1;
		//実数値の範囲を求める
		int rangeInt = maxInt - minimumInt;
		//最小値に足す乱数を生成する
		randomInt = randomNumber.nextInt( rangeInt );
		//-1.0以上1.0未満の生成された実数値を表示する
		System.out.println( minimumInt + randomInt + randomDouble );
		

	}

}
