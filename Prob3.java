package probrem5;

import java.math.*;

//��R
/*
 * �ŏ���100�̃t�B�{�i�b�`���̃��X�g���v�Z����֐����L�q����B
 * ��`�ł́A�t�B�{�i�b�`����̍ŏ���2�̐����͂P�ƂO�ŁA���̐���
 * �O��2�̍��v�ƂȂ�B�Ⴆ�΁A�ŏ���10�̃t�B�{�i�b�`����́A
 * 0,1,1,2,3,5,8,13,21,34�ƂȂ�B
 */
public class Prob3 {

	public static void main(String[] args){
		BigInteger A=new BigInteger("0");
		BigInteger B=new BigInteger("1");
		BigInteger C=new BigInteger("0");

		System.out.println(A.toString());
		System.out.println(B.toString());

		for(int i=2;i<100;i++){
			C=A.add(B);
			System.out.println(C.toString());
			A=B;
			B=C;
		}
	}
}
