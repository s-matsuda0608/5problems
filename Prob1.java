package probrem5;

import java.util.*;

//��P
/*
 * for���[�v�Awhile���[�v�A�ċA���g�p���āA���X�g���̐�����
 * ���v���v�Z����O�̊֐����L�q����B
 */
public class Prob1 {

	public static void main(String[] args){

		//arraylist��`�A�����l�ݒ�(1~10)
		ArrayList<Integer>lst=new ArrayList<Integer>();
		//ArrayList<Integer>lst1=new ArrayList<Integer>();
		for(int i=1;i<=10;i++){
			lst.add(i);
		//	lst1.add(i);
		}

		//���ʕ\��
		//for
		System.out.println("for���[�v");
		System.out.println(forLoop(lst));

		//while
		System.out.println("while���[�v");
		System.out.println(whileLoop(lst));

		//�ċA
		System.out.println("�ċA");
		System.out.println(saiki(lst));
	}

	//for���[�v�̃��\�b�h
	public static int forLoop(ArrayList<Integer> lst){
		int result=0;
		for(int i=0;i<lst.size();i++){
			result=result+lst.get(i);
		}
		return result;
	}

	//while���[�v�̃��\�b�h
	public static int whileLoop(ArrayList<Integer>lst){
		int result=0;
		int i=0;
		while(i<lst.size()){
			result=result+lst.get(i);
			i++;
		}
		return result;
	}

	//�ċA�̃��\�b�h
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
