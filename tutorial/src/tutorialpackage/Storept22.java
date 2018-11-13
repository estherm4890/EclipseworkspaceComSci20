package tutorialpackage;
import java.util.Scanner;
public class Storept22 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String[] Product = {"Dove Shampoo", "Sented Soap", "Chocolate", "Lays Potato Chips", "Gum", "Candy", "Cereal", "Tic Tacs", "IceCream", "Iphone" };
		 double prices[] = {20.00, 10.00, 1.30, 2.20, 1.50, 5.30, 10.40, 60.00, 40.34, 1500.00};
		double discount = 1.00;
		double total = 0;
		int amount = 0;
		int list = 0;
		
		for(int i = 0; i <= Product.length -1; i++) {
			System.out.println( i + 1 +  ". "+  Product[i] + " Costs Are :"  + prices[i]);
		}
		
		int y = 0;
		
		do {
			System.out.println("Hi there, What would You Like to Buy: ");
			System.out.println("");
			
		}
			
		

	}

}
