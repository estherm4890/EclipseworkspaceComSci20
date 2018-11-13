package tutorialpackage;
import java.util.Scanner;
public class NewStore {

	public static void main(String[] args) {
		Scanner scanWords = new Scanner(System.in);// makes variable that has words
		Scanner scanNums = new Scanner(System.in);// makes variable that has numbers
		double SkippingRopeprice = 1.00;// prices
		double Chocolateprice = 700.00;
		double EyeShadowprice = 13.00;
		double price = 0;// total price of sale
		final double TAX = 0.05;// final = can't change through out the code
		
		
		System.out.println("What's your name?: ");// prompt user to print name
		String name = scanWords.nextLine();
		
		System.out.println("\nWelcome" + name + " to Nyakuar's Drug Store");// prints out drug store name
		
		System.out.println("\nWhat would you like to buy?\n" // gives the user options on what to buy
				+ "0. Exit\n"
				+ "1. Skipping Rope\n" 
				+ "2. Chocolate(Hershey's Cookies and Cream)\n" 
				+ "3. Eye Shadow" );
	int itemNum = scanNums.nextInt();// stores
		
		
		while(itemNum != 0) {
			System.out.println("How many do you want?");// ask's user how much they want to buy
			
			int qty = scanNums.nextInt();// prices of items
			
			if(itemNum == 1) {
				price = SkippingRopeprice * qty + price;
			}
			else if(itemNum == 2) {
				price = Chocolateprice * qty + price;
			}
			else if(itemNum == 3) {
				price += EyeShadowprice * qty;
			}
			else {
				System.out.println("Sorry We Don't Sell That");// product not avaliable
			}
			System.out.println("\nWhat would you like to buy?\n" // gives the user options on what to buy
					+ "0. Exit\n"
					+ "1. Skipping Rope\n" 
					+ "2. Chocolate(Hershey's Cookies and Cream)\n" 
					+ "3. Eye Shadow" );
			itemNum = scanNums.nextInt();// stores
		}//end while loop
		System.out.println("Your TOTAL is:" + price);
		System.out.println("TAX is:" + price * TAX);
		double totalPrice = price + TAX + price;
		System.out.println(" Your Total with TAX is:" + totalPrice); 
		System.out.println("ThankYou for shopping at NYAKUAR'S DRUG STORE! Have A GOOD DAY!!");// end of shopping
		
		
		
		
	

	}

}
