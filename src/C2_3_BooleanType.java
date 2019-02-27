
public class C2_3_BooleanType {

	public static void main(String[] args) {
		boolean b;
		
		b = false;
		System.out.println("b is: " + b);
		
		b = true;
		System.out.println("b is: " + b);

		if(b) System.out.println("This is executed.");
		
		b = false;
		if(b) System.out.println("This is not executed.");
		
		//Outcome of relational operator is a bolean value
		System.out.println("10>9 is : "+ (10>9));// '>' is a relational operator, '+' has higher precedence so we used the parenthesis


	}

}
