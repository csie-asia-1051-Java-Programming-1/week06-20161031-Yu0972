package hw;
import java.util.Scanner ;
public class hw02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn = new Scanner ( System.in ) ;
		System.out.print ( "依序輸入性別、與身高=" ) ;
		System.out.print ( fun ( scn.nextInt( ) , scn.nextFloat ( ) ) ) ;
}
	public static float fun ( int a , float b ) {
		float c = 0 ;
		if ( a == 1 ) {
			c = ( float ) ( ( b - 170 ) * 0.6 + 62 ) ;
	} else {
		if ( a == 2 ) {
			c = ( float ) ( ( b - 158 ) * 0.5 + 52 ) ;
}
	}
		return c ;
	}
}
