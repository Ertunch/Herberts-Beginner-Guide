/*
 * print a table of conversion up to 100
 * Every 10 line, it will give blank line as well
 * 
 */
public class C1_8_GalToLitTable {

	public static void main(String[] args) {
		
		double gallons, liters;
		int counter;
		
		counter = 0;
		for (gallons = 1; gallons<=100; gallons++) {
			liters = gallons * 3.7854;
			System.out.println(gallons + " gallons is "+ liters + " liters.");
			counter++;
			//every 10th line print blank line
			if (counter==10) {
				System.out.println();
				counter = 0;
			}
		}
	} 

}
