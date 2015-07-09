package practice;

import java.math.BigInteger;

//問３
public class Prob3 {

	// メイン
	public static void main(String[] args) {

		// フィボナッチ数列のメソッド
		fibo(100);

	}// メイン終わり

	// フィボナッチ数列を任意の項数表示するメソッド
	public static void fibo(int numOfTimes) {
		// 最初の２項宣言
		BigInteger a0 = new BigInteger("0");
		BigInteger a1 = new BigInteger("1");

		// 最初の2項を表示
		System.out.println(a0);
		System.out.println(a1);

		// 計算用
		BigInteger a2 = new BigInteger("0");

		// 3項目から計算して出力
		for (int i = 2; i < numOfTimes; i++) {
			a2 = a0.add(a1);
			System.out.println(a2);
			a0 = a1;
			a1 = a2;
		}
	}// フィボナッチ数列表示メソッド終わり
}
