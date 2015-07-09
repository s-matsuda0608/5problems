package probrem5;

import java.math.*;

//問３
/*
 * 最初の100個のフィボナッチ数のリストを計算する関数を記述せよ。
 * 定義では、フィボナッチ数列の最初の2つの数字は１と０で、次の数は
 * 前の2つの合計となる。例えば、最初の10個のフィボナッチ数列は、
 * 0,1,1,2,3,5,8,13,21,34となる。
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
