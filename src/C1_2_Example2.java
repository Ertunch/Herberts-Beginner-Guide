/* This demonstrates a variable
 
 */

public class C1_2_Example2 {

	public static void main(String[] args) {
		int myVar1;       // Declares a variable, syntax: type varName
							//int can hold whole numbers.
		
		int myVar2;       // its also possible to declare two variables at the same time int var1,var2;
		
		myVar1 = 1024;   // this assigns 1024 to myVar1, assignment operator is equal sign. 
		                 //it copies the value on its right side into the variable on its left
		
		System.out.println("myVar1 contains " + myVar1); // chain the items to chow in println()
		
		myVar2 = myVar1 / 2;
		System.out.print("myVar2 contains myVar1 / 2: ");
		System.out.println(myVar2);
	}

}
