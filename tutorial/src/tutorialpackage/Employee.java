package tutorialpackage;

public class Employee {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String[] employeeName = {"Joe", "Jim", "Jill", "John", "Jay"};
		int[] wage = {15,16,21,15,17};
		int[] hoursWorked = new int[5];
		
		hoursWorked[0] = 20;
		hoursWorked[1] = 30;
		hoursWorked[2] = 15;
		hoursWorked[3] = 60;
		hoursWorked[4] = 38;
		
		for(int i = 0; i < wage.length; i++) {
			System.out.println("i: " + i + "Name:" + employeeName[i] + "\twage:" + wage[i]);
		}
		System.out.println();
		
		for(int i = 0; i < wage.length; i++) {
			if(wage[i] > 20) {
				System.out.println(" FIRE name: " + employeeName[i]);
				employeeName[i] = "";
				wage[i] = 0;
			}//end of if
			
		

	}//end for
		for(int i = 0; i < wage.length; i++) {
			System.out.println(i + "Name:" + employeeName[i] + "\twage:" + wage[i] * hoursWorked[i]);
		

}}}
