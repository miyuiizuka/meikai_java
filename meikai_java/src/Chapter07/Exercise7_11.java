package Chapter07;

//入力ストリーム
import java.util.Scanner;

/*
 * クラス名:Exercise7_11
 * 概要:整数を左右にシフトした値が、２のべき乗での乗算や除算と等しくなることを確認するプログラム
 * 作成者:M.Iizuka
 * 作成日:2024/10/21
 */

public class Exercise7_11 {

	/*
	 * 関数名:main	
	 * 概要:整数を左右にシフトした値が、２のべき乗での乗算や除算と等しくなることを確認する
	 * 引数:なし
	 * 戻り値:なし
	 * 作成者:M.Iizuka
	 * 作成日:2024/10/21
	 */

	public static void main(String[] args) {
		//入力値を抽出する
		Scanner standardInput = new Scanner(System.in);
	
		//整数の入力を促す
		System.out.print("整数：");
		//入力値を読み込む
		int inputInt = standardInput.nextInt();
		//シフトする値の入力を促す
		System.out.print("シフトするビット数：");
		//入力値を読み込む
		int shiftBits = standardInput.nextInt();
		//シフトした値を表示することを示す
		System.out.println("\nシフトした値");
		//左シフトした値を表示する
		System.out.println(inputInt + " << " + shiftBits + " = " + (inputInt << shiftBits));
		//右シフトした値を表示する
		System.out.println(inputInt + " >> " + shiftBits + " = " + (inputInt >> shiftBits));

		//べき乗の底
		final int BASE_INT = 2;
		//べき乗した結果
		int powerInt = 1;
		//べき乗後の値
		for (int exponentIndex = 0; exponentIndex < shiftBits; exponentIndex++) {
			powerInt *= BASE_INT;
		}

		//べき乗後の値を表示
		System.out.println("\n"+BASE_INT + "の" + shiftBits + "乗で乗算・除算した値");
		//整数を2のべき乗で乗算した値
		System.out.println(inputInt + " × " + powerInt + " = " + (inputInt * powerInt));
		//整数を2のべき乗で除算した値
		System.out.println(inputInt + " ÷ " + powerInt + " = " + (inputInt / powerInt));
	}

}