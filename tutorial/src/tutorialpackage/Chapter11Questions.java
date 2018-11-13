package tutorialpackage;
import java.util.Scanner;
public class Chapter11Questions {

	public static void main(String[] args) {
		System.out.println("Enter your Name or Item You Want To Reverse :");
		
		Scanner read = new Scanner(System.in); // Scans the name
		String str = read.nextLine(); // Reads the line or name
		String reverse = ""; // CREATING A VARIABLE AND INITIALIZING IT
		str = str.toLowerCase(); // is a variable that lower cases the word
		
		for(int i = str.length()- 1; i >= 0; i--) { // TAKES THE LETTER AT THE END AND COUNTS DOWN
			
			reverse = reverse + str.charAt(i);// combines the name with the number of letters
		}
		
		System.out.println(" Reversed string IS :");
		System.out.println(reverse);
	

	}

}
