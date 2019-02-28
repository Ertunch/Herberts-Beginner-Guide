/*
 * This program attempts to declare a variable in an inner scope with the same name as one defined in an outer scope.
 * This program will not compile.
 */

public class C2_6_LifetimeOfVariables {

	public static void main(String[] args) {
		int count; // method level scope, more global
		
		for (count = 0; count < 10; count++) {
		//	int count; //illegal
			
		}
		
	}

}
