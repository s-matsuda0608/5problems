package Prob;

import java.util.List;
import java.util.ArrayList;
import java.util.Arrays;

//問２
public class Prob2 {

	// メイン
	public static void main(String[] args) {
		// 使うリストの宣言
		List<Integer> lstA = Arrays.asList(1,3,5,6,9);
		List<String> lstB = Arrays.asList("a","b","c");

		// 組み合わせた結果を保持する用リスト
		List<Object> result = new ArrayList();

		// リストの初期値設定
//		lstA.add(1);
//		lstA.add(3);
//		lstA.add(5);
//		lstA.add(6);
//		lstA.add(9);
//		lstB.add('a');
//		lstB.add('b');
//		lstB.add('c');

		// 組み合わせメソッド呼び出し
		result = comboArray(lstA, lstB);

		// 結果表示
		outArray(result);

	}// メイン終わり

	// 二つのリストを交互に組み合わせるメソッド
	public static ArrayList<Object> comboArray(List<Integer> lst1,
			List<String> lst2) {
		// 組み合わせた結果保持する用
		ArrayList<Object> result = new ArrayList<Object>();

		// 交互に組み合わせるところ
		while (lst1.size() != 0 || lst2.size() != 0) {
			if (lst1.size() != 0) {
				result.add(lst1.get(0));
				lst1.remove(0);
			}

			if (lst2.size() != 0) {
				result.add(lst2.get(0));
				lst2.remove(0);
			}
		}

		return result;
	}// 組み合わせメソッド終わり

	// アレイリストの要素を表示するメソッド
	public static void outArray(List<Object> lst) {
		for (int i = 0; i < lst.size(); i++) {
			System.out.print("[" + lst.get(i) + "]");
			if (i != lst.size() - 1) {
				System.out.print(",");
			}
		}
	}// 表示メソッド終わり

}
