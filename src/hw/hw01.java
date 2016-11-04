package hw;
import java.util.Scanner ;
public class hw01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn = new Scanner ( System.in ) ;
	    	System.out.print ( "輸入溫度=" ) ;
	    	float a = scn.nextFloat ( ) ;
	    	System.out.print ( "輸入1計算華氏為攝氏、輸入2計算攝氏為華氏=" ) ;
	    	float b = scn.nextFloat ( ) ;
	    	System.out.println ( fun (  a , b ) ) ;
}
	public static float fun ( float a , float b ) {
			float c = 0 ;
			if( b == 1 ) {
			c = ( a - 32 ) *  5 / 9  ;
		}else{
			c =  a * 9 / 5 + 32 ;
}
			return c ;
	}
}
