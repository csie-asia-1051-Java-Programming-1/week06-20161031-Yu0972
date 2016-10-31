package ex;
import java.util.Scanner;
/*
 * Topic: 使用者輸入兩個整數，透過函數呼叫輸出排列組合函數 C(m,n)。公式: C(m,n) = m!/n!(m-n)!
 * Date: 2016/10/31
 * Author: 105021045 郭毓呈
 */

public class ex02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn = new Scanner (System.in) ;
		System.out.print("輸入 m =");
		long m = scn.nextInt () ;
		System.out.print("輸入 n =");
		long n = scn.nextInt () ;
		fun1(m, n);
	}
	public static void fun1( long m , long n ) {
		long t = 1 ;
		long u = 1 ;
		for ( long a = m ; a > 0 ; a -- ) {
			t = t * a ;
		for ( long b = n ; b > 0 ; b -- ) {
			u = u * b ;
	}
}
		System.out.println(t/u);
	}
}