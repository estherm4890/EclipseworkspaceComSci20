package tutorialpackage;
import java.util.Scanner;
public class storeClass {
	public static String productName[] = {"Clorox","Oxyclean","Tide Pods","Windex","Rope","Apple","Orange","Banana","Kite","Milk",}; //array for names of products
	public static double prices[] = {12.00,14.00,20.00,10.00,25.00,4.00,3.00,5.00,13.00,6.00,}; //Parallel array for the products name
	public static double discount = 1.00; //static double for discount
	public static double total = 0;//static double for the total price
	
	public static int amount[] = {0,0,0,0,0,0,0,0,0,0}; //Int array for amount
	public static void list() { //Function for the list
		for (int i = 0; i <= productName.length - 1;i++) { //For loop for listing out every arrayed variable
	    
			System.out.println(i+1 + "." + productName[i] + " " + prices[i] + "$"); //Prints out product name	
			}
			
		}
		
	
	
	public static void main(String [] args) { //Main Function
		
		int x = 0; //x variable that equals 0 so the while loop can continue
		
		do { //Do while for shopping
		System.out.println("What would you like to buy?"); //Question prompt
		System.out.println("");
		list(); //Calls list to print out the stores contents
		System.out.println("Enter the number of the product you would like to purchase");
		Scanner input = new Scanner(System.in); //Scanner variable
		int productAnswer = input.nextInt(); //Next int input = productAnswer variable
		
		if (11 > productAnswer && productAnswer > 0) { //If variable for correct inputs
			System.out.println("How much/many " + productName[productAnswer - 1] + " would you like?"); //Question prompt
			Scanner input2 = new Scanner(System.in); //Another scanner variable
			int productAmount = input2.nextInt(); //Scanner variable equals the next int input
			amount[productAnswer - 1] = productAmount; //Calculation for the amount to be added into the amount array
			double transaction = amount[productAnswer - 1] * prices[productAnswer - 1] * discount; //transaction variable for current purchase not total
			total += amount[productAnswer - 1] * prices[productAnswer - 1] * discount; //calculation for a cumulative total variable for total price of purchase
			System.out.println(amount[productAnswer - 1] + " " + productName[productAnswer - 1] + " " + transaction + "$"); //Prints out current transaction

			
			
		}
		else if(productAnswer == -1) { //else if for secret discount
			System.out.println("Oh... Discounts just for you sir");
			discount = 0.90; //Discount is changed to 0.90 affecting final calculation
		}
		else { //else for incorrect inputs
			System.out.println("We don't have that sir...");
		}
		
		System.out.println("Would you like to continue shopping"); //Question prompt if they would like to continue shopping or not
		System.out.println("1.Yes");
		System.out.println("2.No");
		Scanner input3 = new Scanner(System.in); //scanner variable
		int questionPrompt1 = input3.nextInt(); // scanner variable = next input
		
		if (questionPrompt1 == 1) { //If statement for yes
		}
		else if (questionPrompt1 == 2) { //else if statement for no
			x = 1; //ends while loop
		}
		else { //else for incorrect input
			System.out.println("I'm going to guess thats a yes");
		}
		
		
		
		}while(x == 0); //End of while loop
		System.out.println("Product    Price    Amount    Total"); 
		for (int i = 0; i <= productName.length - 1;i++) { //For loop that prints out total or in other words every array used
			if (amount[i] > 0) { //If statement for places in array that weren't used at all to not print
				double individualTotal = prices[i] * amount[i] * discount; //Calculation for individual total of singular product groups
				System.out.println(productName[i] + "      " + prices[i] + "       " + amount[i] + "      "  + individualTotal); //Prints out the prices amount and total
			}
			else { //else to do nothing if product is never used
				
			} 
			System.out.println("Total " + total); //Prints out total cost
		}
	    

	
	}

}

