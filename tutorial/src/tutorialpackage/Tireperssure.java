package tutorialpackage;
import java.util.Scanner;
import java.util.Random;
public class Tireperssure {

	public static boolean tirePressureCheck(int r1, int r2, int p) {
		int range1 = r1;//not necessary
		
		if(p >= r1 && p <= r2) {
			//system.out.print("Pressure Good");
			return true;
		}
		else {
			//System.out.println("No Good);
			return false;
		}
	}// end main tire pressure check
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Random randy = new Random();
		int randNum = randy.nextInt(10) + 30;
		tirePressureCheck(30,35,32);//calling method
		System.out.println("Pressure is Good:" + tirePressureCheck(30,35,32));
		System.out.println(randNum);
		
		if(tirePressureCheck(30,35,32) == true) {
			System.out.println("good");
					
		}//end if tire pressure

	}// end main

}
