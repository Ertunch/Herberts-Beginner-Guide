
public class C2_11_PrimeNumbers {

	public static void main(String[] args) {
		int i, j;
		boolean isprime;
		
		for (i = 2; i < 100; i++) {
			 isprime = true;
			 
			 // see if the number is evenly divisible
			 for (j = 2; j <= i / j; j++) 
				 if ((i%j) == 0) 
					 isprime = false;
			 
			 if (isprime)System.out.println(i + " is prime.");
		}
	}

}