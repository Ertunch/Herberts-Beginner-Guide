//You can repeatedly execute a sequence of code by creating a loop.
//simplest form for (initialization;condition;iteration) statement;
//initialization loop control variable to an initial value. if condition is true it iterates otherwise loop terminates


public class ForDemo {

	public static void main(String[] args) {
		
		int count;
		
		for(count = 0;count<5;count = count +1)//counter is loop control variable. initialized to 0.
			// first the conditional test is performed and then do the job then iteration part.
			// until test is false it's going to perform. count++ is the same with count = count + 1;
			System.out.println("This is count: " + count);
		System.out.println("Done");

	}

}
