/*
 * Demonstrates Block of Code - Semicolons and positioning
 * 
 * The main reason for their existence is to create logically inseparable units of code.
 * a block is not terminated by semicolon but closing brace.
 * Java doesn't recognize the end of the line as a terminator.
 * Indentation is also very important. indent one level after opening brace, move back out one level after closing each brace.
 */

public class C1_7_BlockDemo {

	public static void main(String[] args) {
		double i, j, d;
		
		i = 5;
		j = 10;
		
		 //the target of this if is a block
		
		if(i != 0) {
			System.out.println("i doesnt equal to zero");
			d = j / i;
			System.out.println("j / i is " + d);
		}

	}

}
