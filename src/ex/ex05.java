package ex;
import java.util.Scanner;
/*
 * Topic: 使用者輸入一個大正整數值，請設計一個函數fun1(n)可以計算該大數字裡的數字總合。例如:輸入: 4832 則輸出 17
 * Date: 2016/10/31
 * Author: 105021045 郭毓呈
 */

public class ex05 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn = new Scanner ( System.in ) ;
		System.out.print ( "輸入一大正整數=" ) ;
		int n = scn.nextInt ( ) ;
		System.out.print ( fun1 ( n ) ) ;
}
	public static int fun1 ( int n ) {
		int a = 0 ;
		while ( n > 0 ) {
			a = a + n % 10 ;
			n /= 10 ;
}
		return a ;
	}
}
