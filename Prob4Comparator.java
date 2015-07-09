package practice;

import java.util.Comparator;

public class Prob4Comparator implements Comparator<String> {

	/*
	 * ①A：X ... B：Y... かつ X > Y のときは A > B ②A：XX000...0、B：XX のときは A < B
	 * ③A：XX0N00...、B：XX のときは A > B ④A：XYN、B：XYN のときは A = B
	 */

	// compareメソッド(並べ替えのルール)
	// 戻り値：A>B→「-1」、A=B→「0」、A<B→「1」
	public int compare(String A, String B) {

		int crsA = 0;
		int crsB = 0;
		int sub;

		while (true) {

			// 調べる文字の残りがあと何個か計算
			int nokoriA = A.length() - crsA;
			int nokoriB = B.length() - crsB;

			// 調べる文字の残りがあるかないか（どっちもあるときは全スルー）
			if (nokoriA == 0 && nokoriB == 0) {// AもBも次がないときは等しい

				return 0;// ④のケース

			} else if (nokoriA == 0) {// 文字列Aのチェックが終端まで来てるとき

				if (isAllZero(B.substring(crsB, B.length()))) {

					return -1;// ~②のケース

				} else {

					return 1;// //~③のケース

				}
				// if (nokoriA == 0)の中の内容と同じ
			} else if (nokoriB == 0) {// 文字列Bのチェックが終端まで来てるとき
				if (isAllZero(A.substring(crsA, A.length()))) {
					return 1;// ②のケース
				} else {
					return -1;// ③のケース
				}
			}

			// 数字1個ずつ比較
			sub = Integer.parseInt(A.substring(crsA, crsA + 1))
					- Integer.parseInt(B.substring(crsB, crsB + 1));
			if (sub > 0) {
				return -1;// ①のケース
			} else if (sub < 0) {
				return 1;// ~①のケース

			} else {// 比較した数字が等しいとき
				crsA++;
				crsB++;
			}

		}
	}

	// 入力された文字列がすべて"0"であるかチェックするメソッド
	public boolean isAllZero(String str) {

		for (int i = 0; i < str.length(); i++) {
			if (Integer.parseInt(str.substring(i, i + 1)) != 0) {
				return false;// 0以外が混じっているとき
			}
		}
		return true;// 全部0のとき
	}
}
