package Chapter07;

/*
 * クラス名:Exercise7_05
 * 概要:『こんにちは。』と表示して改行するプログラム
 * 作成者:M.Iizuka
 * 作成日:2024/10/18
 */
public class Exercise7_05 {

	/*
	 * 関数名:hello
	 * 概要:『こんにちは。』と表示して改行する
	 * 引数:outputString 表示させたい文字
	 * 戻り値:なし
	 * 作成者:M.Iizuka
	 * 作成日:2024/10/18
	 */
	public static void hello() {
		String outputString = "こんにちは。";
		//文字を表示し改行する
		System.out.println(outputString);
	}

	/*
	 * 関数名:main
	 * 概要:『こんにちは。』と表示して改行する
	 * 引数:なし
	 * 戻り値:なし
	 * 作成者:M.Iizuka
	 * 作成日:2024/10/18
	 */
	public static void main(String[] args) {
		//表示させる
		hello();

	}

}
