//The moon's gravity is about 17 percent that of earth's. Write a program that computes your effective weight on the moon.
// Chapter 1 Self Test Question 9

public class C1_9_MoonsGravity {

	public static void main(String[] args) {
		double WeightOnMoon, WeightOnEarth;
		
		WeightOnEarth = 113.4;
		WeightOnMoon = WeightOnEarth * 0.17;
		System.out.println("Your weight on the Moon would be " + WeightOnMoon );
		
	}

}
