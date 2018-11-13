
package tutorialpackage;
import java.util.Scanner; 
import java.util.Random;

public class GuessingGame {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scanWords = new Scanner(System.in); // scanner object to take in words
		Scanner scanNums = new Scanner(System.in); // scanner object to take in number
		
		int decision; // declaring the variable decision
		int guess; // declaring the variable guess
				
		System.out.println("Hi there!"); // greeting to the user
		System.out.println("What's your name gamer? "); // asks for the player's name
		String name = scanWords.nextLine(); // declare name variable and store input
		System.out.println("Welcome to the game of Guessin' " + name + "!");
		System.out.println("So " + name + " do you want to play a game? \n"
				+ "1. Yes I do!\n"
				+ "2. No, not really. "); // asks the person playing if they want to play
		decision = scanNums.nextInt(); // stores input into a decision variable
			
		if (decision == 1) { // what executes if the user wants to play the game
			Random r = new Random();
			int answer = r. nextInt(101); // generates the random number
			System.out.println("Pick a number between 0 and 99."); // prompts the user to guess a number from 0 to 99
			guess = scanNums.nextInt(); // storing the user's guess into guess variable
			while (guess != answer) { // while loop (executes till the user gets the right guess)
				if (guess < answer) { // what executes if the guess is lower than the actual answer
					System.out.println("Aww.  Guess higher."); //prompts the user to guess a higher number
					System.out.println("Pick a number between 0 and 99.");
					guess = scanNums.nextInt(); // updates variable 
				}
				else if (guess > answer) { // what executes if the guess is higher than the actual answer
					System.out.println("Aww.  Guess lower."); // prompts the user to guess a lower
					System.out.println("Pick a number between 0 and 99.");
					guess = scanNums.nextInt(); // updates variable
				}
				else if (guess == answer) { // what executes if the user guessed the answer on the first try
					System.out.println("Congratulations!");
					
				}} // end of while
		
		} // end of if statement 
		else if (decision == 2) { // what executes if the user does not want to play 
			System.out.println("Oh You'll Do Better Next Time");
		} // end of else if
		System.out.println("GREAT JOB!  Thanks for playing!"); // prints into the console when the player has guessed the answer
	} // end of main

}
