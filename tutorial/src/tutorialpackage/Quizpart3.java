package tutorialpackage;

public class Quizpart3 {
	
	
	public static double smallest (double x, double y, double z) {
		double small = x;// variable gets made
	
		if(x > y) { // if x is greater that y...
			small = y;/// small number is y
			
		}	
		if (y > z) {// if y is greater than z...
			small = z;// small number is z
		}
		if (z > x) {// if z is greater that x...
			small = x;// small number is x
		}
		
	
		
		return small;// returns the smallest number	
	
	}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(smallest(17, 64, 2));// runs through the code to determine the smallest number
		System.out.println(smallest(38, 4, 6));// runs through the code to determine the smallest number
		System.out.println(smallest(50, 78, 8));// runs through the code to determine the smallest number

	}

}
