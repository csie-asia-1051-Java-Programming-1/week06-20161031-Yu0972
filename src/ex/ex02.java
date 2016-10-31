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
		Scanner scn = new Scanner ( System.in ) ;
		System.out.print ( "輸入 m =" ) ;
		int m = scn.nextInt () ;
		System.out.print ( "輸入 n =" ) ;
		int n = scn.nextInt () ;
		fun1( m , n );
	}
	public static void fun1( int m , int n ) {
		int x = 1 ;
		int y = 1 ;
		int z = 1 ;
		for ( int a = 1 ; a <= m ; a ++ ) {
			x = x * a ;
		}
		for ( int b = 1 ; b <= n ; b ++ ) {
			y = y * b ;
		}
		for ( int c = 1 ; c <= ( m - n ) ; c ++ ) {
			z = z * c ;
		}
		System.out.println( x / ( y * z ) );
	}
}