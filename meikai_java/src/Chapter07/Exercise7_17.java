package Chapter07;

//入力ストリーム
import java.util.Scanner;

/*
 * クラス名:Exercise7_17
 * 概要:探索するキーと同じ値の要素が複数個存在する場合、
 * 配列integerArrayの最も末尾側に位置する要素を見つけ表示する
 * 作成者:M.Iizuka
 * 作成日:2024/10/22
 */
public class Exercise7_17 {

	/*
	 * 関数名:linearSearchR
	 * 概要:探索するキーと同じ値の要素が複数個存在する場合、
	 * 配列integerArrayの最も末尾側に位置する要素を見つける
	 * 引数:optionalArray 任意の配列, keyValue 探す値
	 * 戻り値:keyIndex 最も末尾側に位置する要素番号
	 * 作成者:M.Iizuka
	 * 作成日:2024/10/22
	 */
	public static int linerSearchR(int[] optionalArray, int keyValue) {
		//見つからなかった場合の値を設定(見つかった場合は最も末尾側に位置する要素番号)
		int keyIndex = -1;
		//配列の要素から探す値と一致する最も末尾の要素を見つける
		for (int elementIndex = optionalArray.length - 1; elementIndex >= 0; elementIndex--) {
			//見つかった場合
			if (optionalArray[elementIndex] == keyValue) {
				//現在の要素番号を返す値に設定
				keyIndex = elementIndex;
				//探索終了
				break;
			}
		}
		//探索結果を返す
		return keyIndex;
	}

	/*
	 * 関数名:main
	 * 概要:探索するキーと同じ値の要素が複数個存在する場合、
	 * 配列integerArrayの最も末尾側に位置する要素を見つけ表示する
	 * 引数:なし
	 * 戻り値:なし
	 * 作成者:M.Iizuka
	 * 作成日:2024/10/22
	 */
	public static void main(String[] args) {
		//入力値を抽出する
		Scanner standardInput = new Scanner(System.in);

		//要素数
		int allElement = 0;
		//要素数の入力チェック
		do {
			//要素数の入力を促す
			System.out.print("要素数：");
			//入力値を読み込む
			allElement = standardInput.nextInt();
			//不正な値が入力された場合
			if (allElement <= 0) {
				//正しい値を入力するよう促す
				System.out.println("正の整数で入力してください。");
			}
			//不正な値であれば入力処理を繰り返す
		} while (allElement <= 0);
		//配列を生成
		int[] integerArray = new int[allElement];

		//配列の要素の値を入力してもらう
		for (int elementIndex = 0; elementIndex < allElement; elementIndex++) {
			//要素の値の入力を促す
			System.out.print("integerArray[" + elementIndex + "]：");
			//入力値を配列に格納
			integerArray[elementIndex] = standardInput.nextInt();
		}

		//探す値の入力を促す
		System.out.print("探す値：");
		//入力値を読み込む
		int keyValue = standardInput.nextInt();

		//配列から探す値と同じ値の要素を探索
		int keyIndex = linerSearchR(integerArray, keyValue);

		//見つからなかった場合
		if (keyIndex == -1) {
			//見つからなかったことを表示
			System.out.println("その値の要素は存在しません。");
			//見つかった場合
		} else {
			//最も末尾側に位置する要素番号を表示
			System.out.println("その値はintegerArray[" + keyIndex + "]にあります。");
		}

	}

}
