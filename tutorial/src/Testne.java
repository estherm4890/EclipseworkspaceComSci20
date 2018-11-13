import java.util.Scanner;
public class Testne {
	
	public static boolean isSingleDigit(int x, int y, int z) {
		if (x > 0)  {
			//system.out.println("Single Digit");
			return true;
		}
		else {
			return false;
		}
		
		
		
		
		}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		isSingleDigit(1,2,3);
		System.out.println("Single Digit:" + isSingleDigit(1,2,3));
		
		if (isSingleDigit(1,2,3) == true) {
			System.out.println(" Single digit");
		}

	}

}
