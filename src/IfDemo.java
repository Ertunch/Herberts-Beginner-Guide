/*
 * Inside a method, execution proceeds from top to bottom.
 * However it's possible to alter the flow through the use of various program control statements.
 * if (condition) statement; condition is boolean.
 * 
 */

public class IfDemo {

	public static void main(String[] args) {
		if (10<11) System.out.println("10 is less than 11"); 
		// this is going to be displayed since the condition is true
		
		if(10<9) System.out.println("This wont be displayed."); // condition is false.
		// ==, !=, <, >, <=, >= relational operators which can be used in condition.
		
		int a, b, c;
		a = 2;
		b = 3;
		
		if (a<b) System.out.println("a is less than b");
		if (a==b) System.out.println("a is equal to b - You won't see this");
		c = a -b;
		System.out.println("c contains -1");
		
		if (c>=0) System.out.println("c is non-negative");
		if (c<0) System.out.println("c is negative");
		
	}

}
