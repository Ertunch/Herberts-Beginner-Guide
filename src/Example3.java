/*
 * This program illustrates the difference between int and double
 * double is more used.
 * single and double precision values
 */

public class Example3 {

	public static void main(String[] args) {
		int v;
		double x;
		v = 10;
		x = 10.0;
		System.out.println("Original value of v is: " + v);
		System.out.println("Original value of x is: " + x);
		System.out.println(); //print a blank line
		
		//now divide both to 4
		v = v / 4;
		x = x / 4;

		System.out.println("v after division: " + v);
		System.out.println("x after division: " + x);
	}

}
