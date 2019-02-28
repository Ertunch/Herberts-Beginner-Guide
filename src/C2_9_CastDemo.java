//Demonstrates Casting

public class C2_9_CastDemo {

	public static void main(String[] args) {
		double x, y;
		byte b;
		int i;
		char ch;
		
		x = 10.0;
		y = 3.0;
	
		i = (int)  (x/y);// cast double to int - truncation happens here
		System.out.println("Integer outcome of x/y: " + i);
		
		i = 100;
		b = (byte) i; // no loss of information
		System.out.println("The value of b: " + b);
		
		b = 88;
		ch = (char) b; // cast between incompatible types
		System.out.println("ch: " + ch);
		
		
			
	}

}
