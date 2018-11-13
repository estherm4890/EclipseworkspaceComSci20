package tutorialpackage;

import java.util.Random;
import java.util.Scanner;

public class Tutorial1 {

	
	public static double circumference(double radius) {
		
		//double diameter = 2 * radius;
		double circumference = 2 * Math.PI * radius;
		
		
		
		return circumference;
	}
		
		for(int i = 0; i < 5; i++) {
			System.out.println("HI Esther");
		}
		
	}
	
	
	
	public static void main(String[] args) {
		int varNum1;
		varNum1 = 10;
		
		int varNum2 = 25;
		
		int varNum3;
		varNum3 = varNum1 + varNum2;
		
		System.out.print(varNum3);
		System.out.println(varNum2);
		System.out.println(varNum1);
		
		printName();
		
if(varNum3 > 5) {
	System.out.println("greater");

	}
else
	System.out.println("less");
		
		String inData;
		Scanner scan = new Scanner( System.in );

		System.out.println("Enter the data:");
		inData = scan.nextLine();

		System.out.println("You entered:" + inData );
		
		int num;
		int square;
		System.out.println("Enter an integer:");
	    num = scan.nextInt();
	    square = num * num ;  // compute the square 

	    System.out.println("The square of " + num + " is " + square);
	    
	    Random rand = new Random();
	    
	    int randomNum = rand.nextInt(11) + 5;
	    
	    System.out.println(randomNum);
	    
	    
	double r = 4.6;
	double c = circumference(r);
	
	system.out.print.ln("circumference is: " + c)
	    
	   
	   
  }

	
	

	

	}//end main

	

//end main

