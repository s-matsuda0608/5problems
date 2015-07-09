package practice;

import java.util.ArrayList;
import java.util.Collections;

//問４
public class Prob4 {

	// メイン
	public static void main(String[] args) {

		// ArrayList定義
		ArrayList<String> lst = new ArrayList<String>();

		// リストの中身
		String[] str = { "1", "22", "20", "4", "16" };

		// ArrayListに中身入れる
		for (int i = 0; i < str.length; i++) {
			lst.add(str[i]);
		}

		// outArrayList(lst);
		// lst.get(0).substring(0,0);

		Collections.sort(lst, new Prob4Comparator());

		// 表示
		outArrayList(lst);

	}

	// リスト内のデータ表示
	public static void outArrayList(ArrayList<String> lst) {
		for (int i = 0; i < lst.size(); i++) {
			System.out.print(lst.get(i));
		}
	}

}
