package Chapter03;

//乱数ストリーム
import java.util.Random;

/*
 * クラス名:Exercise3_17
 * 概要:乱数の値に応じて“グー”、“チョキ”、“パー”を出力するプログラム
 * 作成者:M.Iizuka
 * 作成日:2024/10/07
 */
public class Exercise3_17 {

	/*
	 * 関数名:main
	 * 概要:乱数の値に応じて“グー”、“チョキ”、“パー”を出力する
	 * 引数:なし
	 * 戻り値:なし
	 * 作成者:M.Iizuka
	 * 作成日:2024/10/07
	 */
	public static void main(String[] args) {

		//生成された乱数の値を抽出する
		Random randomNumber = new Random();
		//手の種類の数を設定する
		int sumHand = 3;
		//抽出された乱数を変数に格納する
		int handNumber = randomNumber.nextInt(sumHand);
		//手の種類
		String handName = "";

		//乱数による手の種類
		switch (handNumber) {
		//0が生成された場合
		case 0:
			//グーを格納
			handName = "グー";
			//switch文を抜ける
			break;
		case 1:
			//チョキを格納
			handName = "チョキ";
			//switch文を抜ける
			break;
		case 2:
			//パーを格納
			handName = "パー";
			//switch文を抜ける
			break;
		}

		//手の種類を出力する
		System.out.println(handName);

	}

}
