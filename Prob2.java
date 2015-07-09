package probrem5;

import java.util.*;

//問２
/*
 * 交互に要素を取ることで、２つのリストを結合する関数を記述せよ。
 * 例えば、[a,b,c]と[1,2,3]という2つのリストを与えると、その関数は
 * [a,1,b,2,c,3]というリストを返す。
 */
public class Prob2 {

	public static void main(String[] args){
		//ArrayList２つ定義
		ArrayList<Object>lst1=new ArrayList<Object>();
		ArrayList<Object>lst2=new ArrayList<Object>();

		//lst1の中身(1~6)
		for(int i=0;i<7;i++){
			lst1.add(i);
		}

		//lst2の中身
		lst2.add("aiueo");
		lst2.add("asdfg");
		lst2.add("qwerty");
		lst2.add("ppppp");
		lst2.add("matsuda");

		//リスト表示
		System.out.print("lst1：");
		listOut(lst1);

		System.out.print("lst2：");
		listOut(lst2);

		System.out.print("Comb：");
		listOut(combList(lst1,lst2));

	}

	//2つのArrayListを交互に組み合わせて１つのArrayListにするメソッド
	public static ArrayList<Object> combList(ArrayList<Object>lst1,ArrayList<Object>lst2){
		ArrayList<Object>result=new ArrayList<Object>();
		int i=0;
		int j=0;
		while(i<lst1.size() || j<lst2.size()){
			if(i<lst1.size()){
				result.add(lst1.get(i));
				i++;
			}
			if(j<lst2.size()){
				result.add(lst2.get(j));
				j++;
			}
		}
		return result;
	}

	//ArrayListの中身表示するメソッド
	public static void listOut(ArrayList<Object>lst){
		System.out.print("{");
		for(int i=0;i<lst.size();i++){
			if(i!=0){
				System.out.print(",");
			}
			System.out.print("["+lst.get(i)+"]");
		}
		System.out.println("}");
	}
}
