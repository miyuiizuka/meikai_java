package Chapter04;

//入力ストリーム
import java.util.Scanner;

/*
 * クラス名:Exercise4_05
 * 概要:正の整数値をカウントダウンする処理において、
 * 後置減分演算子が前置減分演算子になっていた場合の出力結果を検討するプログラム
 * 作成者:M.Iizuka
 * 作成日:2024/10/08
 */
public class Exercise4_05 {

	/*
	 * 関数名:main
	 * 概要:正の整数値をカウントダウンする処理において、
	 * 後置減分演算子が前置減分演算子になっていた場合の出力結果を検討する
	 * 引数:なし
	 * 戻り値:なし
	 * 作成者:M.Iizuka
	 * 作成日:2024/10/08
	 */
	public static void main(String[] args) {
		//入力された数値を抽出する
		Scanner standrdInput = new Scanner(System.in);

		//行う処理を表示
		System.out.println("カウントダウンします。");
		//入力された数値
		int inputInt = 0;

		//数値の入力をしてもらう
		do {
			//正の整数値の入力を促す
			System.out.print("正の整数値：");
			//入力された数値を代入
			inputInt = standrdInput.nextInt();
			//0より大きい数値が入力されるまで繰り返す
		} while (inputInt <= 0);

		//カウントダウンを行う
		while (inputInt >= 0) {
			//カウントダウンを表示（1つ減少後の値が出力される）
			System.out.println(--inputInt);
		}

	}

}
