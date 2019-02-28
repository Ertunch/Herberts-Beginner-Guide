
public class C2_8_ShortCircuitOperators {
	public static void main(String[] args) {
		int n, d, q;
		n = 10;
		d = 2;
		
		if (d !=0 && (n%d) == 0)
			System.out.println(d +" is a factor of " + n);
		
		d = 0;
		if (d !=0 && (n%d) == 0) // short circuit 
			System.out.println(d +" is a factor of " + n);
		
		if (d !=0 & (n%d) == 0) // without short circuit zero division error.
			System.out.println(d +" is a factor of " + n);
	}
}
