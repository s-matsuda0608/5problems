package probrem5;

import java.util.*;

//��Q
/*
 * ���݂ɗv�f����邱�ƂŁA�Q�̃��X�g����������֐����L�q����B
 * �Ⴆ�΁A[a,b,c]��[1,2,3]�Ƃ���2�̃��X�g��^����ƁA���̊֐���
 * [a,1,b,2,c,3]�Ƃ������X�g��Ԃ��B
 */
public class Prob2 {

	public static void main(String[] args){
		//ArrayList�Q��`
		ArrayList<Object>lst1=new ArrayList<Object>();
		ArrayList<Object>lst2=new ArrayList<Object>();

		//lst1�̒��g(1~6)
		for(int i=0;i<7;i++){
			lst1.add(i);
		}

		//lst2�̒��g
		lst2.add("aiueo");
		lst2.add("asdfg");
		lst2.add("qwerty");
		lst2.add("ppppp");
		lst2.add("matsuda");

		//���X�g�\��
		System.out.print("lst1�F");
		listOut(lst1);

		System.out.print("lst2�F");
		listOut(lst2);

		System.out.print("Comb�F");
		listOut(combList(lst1,lst2));

	}

	//2��ArrayList�����݂ɑg�ݍ��킹�ĂP��ArrayList�ɂ��郁�\�b�h
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

	//ArrayList�̒��g�\�����郁�\�b�h
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
