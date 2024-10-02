package Chapter02;

//入力ストリーム
import java.util.Scanner;

/*
 * クラス名:Exercise2_10
 * 概要:姓と名を個別にキーボードに読み込んで、挨拶を行うプログラム
 * 作成者:M.Iizuka
 * 作成日:2024/10/02
 */
public class Exercise2_10 {

	/*
	 * 関数名:main
	 * 概要:姓と名を個別にキーボードに読み込んで、挨拶を行う
	 * 引数:なし
	 * 戻り値:なし
	 * 作成者:M.Iizuka
	 * 作成日:2024/10/02
	 */
	public static void main(String[] args) {
		
		//キーボードから読み込んだ値を抽出するための変数を宣言する
		Scanner standardInput = new Scanner(System.in);
		
		//姓の入力を促す
		System.out.print("姓：");
		//入力された姓を変数に格納する
		String lastName = standardInput.next();
		//名の入力を促す
		System.out.print("名：");
		//入力された名を変数に格納する
		String firstName = standardInput.next();
		
		//挨拶と姓名を表示
		System.out.println( "こんにちは" + lastName + firstName + "さん。");

	}

}
