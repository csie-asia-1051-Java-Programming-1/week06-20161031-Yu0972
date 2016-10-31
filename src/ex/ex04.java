package ex;
import java.util.Scanner;
/*
 * Topic: 撰寫一函數void square(arr)，在呼叫square(arr) 函數後，一維陣列arr 裡的每一個元素皆會被平方。例如:輸入1 3 5 7, 則輸出1  9   25  49
 * Date: 2016/10/31
 * Author: 105021045 郭毓呈
 */

public class ex04 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn = new Scanner ( System.in ) ;
		System.out.print( "多少筆資料=" ) ;
		int n = scn.nextInt ( ) ;
		int [] arr = new int [ n ] ;
		for ( int i = 0 ; i < n ; i ++ ) {
			System.out.print( "第" + ( i + 1 ) + "筆資料=" ) ;
			arr [ i ] = scn.nextInt ( ) ;
		}
        c ( arr , n ) ;
        for ( int a = 0 ; a < n ; a ++ ) {
        	System.out.print( arr [ a ] + " " );	
        }
	}
	public static int [ ] c ( int [ ] arr , int n ) {
		for ( int a = 0 ; a < n ; a ++ ) {
		arr [ a ] *= arr [ a ] ;
	}
		return arr ;
	}
}
