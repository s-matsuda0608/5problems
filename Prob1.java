package Prob;

import java.util.ArrayList;

//プログラマ 5つの問題（問１）
public class Prob1 {

	// メインクラス
	public static void main(String[] args) {

		// 用いるリストの宣言(whileメソッドで中身消えちゃうから再帰用にもう一つ宣言)
		ArrayList<Integer> testList = new ArrayList<Integer>();

		// リストの初期値設定(1~10) 
		for (int i = 1; i <= 10; i++) {
			testList.add(i);
		}

		// 結果を保持する用の変数宣言
		int result = 0;

		// forループで計算するメソッドの呼び出し、表示
		result = forLoop(testList);
		System.out.println("forループ");
		System.out.println(result);

		// whileループ
		result = whileLoop(testList);
		System.out.println("whileループ");
		System.out.println(result);

		// 再帰呼び出し
		result = saiki(testList);
		System.out.println("再帰呼び出し");
		System.out.println(result);
	}

	// for文で合計計算
	public static int forLoop(ArrayList<Integer> lst) {

		int result = 0;

		for (int i = 0; i < lst.size(); i++) {
			result = result + lst.get(i);
		}

		return result;
	}

	// while文で合計計算
	public static int whileLoop(ArrayList<Integer> lst) {

		int result = 0;

		int i=0;
		while (i<lst.size()) {
			result = result + lst.get(i);
			i++;
		}

		return result;
	}

	// 再帰呼び出しで合計計算
	public static int saiki(ArrayList<Integer> lst) {

	 return lst.isEmpty() ?  0 : lst.remove(0)+ saiki(lst);
		
//		if (lst.isEmpty()) {
//			return 0;
//		} else {
//			return lst.remove(0)+ saiki(lst);
//		}
	}
}
