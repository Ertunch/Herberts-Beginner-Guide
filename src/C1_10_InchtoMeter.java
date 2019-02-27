//
public class C1_10_InchtoMeter {

	public static void main(String[] args) {
		
			
			double inches, meters;
			int counter;
			
			counter = 0;
			
			for (inches = 1; inches<=144; inches++) {
				meters = inches / 39.37;
				System.out.println(inches + " inches is "+ meters + " meters.");
				counter++;
				//every 10th line print blank line
				if (counter==12) {
					System.out.println();
					counter = 0;
				}
			
		} 

	}

}
