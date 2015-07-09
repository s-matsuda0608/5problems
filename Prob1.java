package probrem5;

import java.util.*;

//問１
/*
 * forループ、whileループ、再帰を使用して、リスト内の数字の
 * 合計を計算する三つの関数を記述せよ。
 */
public class Prob1 {

	public static void main(String[] args){

		//arraylist定義、初期値設定(1~10)
		ArrayList<Integer>lst=new ArrayList<Integer>();
		//ArrayList<Integer>lst1=new ArrayList<Integer>();
		for(int i=1;i<=10;i++){
			lst.add(i);
		//	lst1.add(i);
		}

		//結果表示
		//for
		System.out.println("forループ");
		System.out.println(forLoop(lst));

		//while
		System.out.println("whileループ");
		System.out.println(whileLoop(lst));

		//再帰
		System.out.println("再帰");
		System.out.println(saiki(lst));
	}

	//forループのメソッド
	public static int forLoop(ArrayList<Integer> lst){
		int result=0;
		for(int i=0;i<lst.size();i++){
			result=result+lst.get(i);
		}
		return result;
	}

	//whileループのメソッド
	public static int whileLoop(ArrayList<Integer>lst){
		int result=0;
		int i=0;
		while(i<lst.size()){
			result=result+lst.get(i);
			i++;
		}
		return result;
	}

	//再帰のメソッド
	public static int saiki(ArrayList<Integer>lst){
		int result=0;
		if(lst.size()==0){
			return 0;
		}else{
			result=result+lst.get(0);
			lst.remove(0);
			return result+saiki(lst);
		}

	}
}
