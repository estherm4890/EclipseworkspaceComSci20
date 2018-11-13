package tutorialpackage;
import java.util.Scanner;

public class HalloweenMonsters {
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		String[] HalloweenMonster = {"Vampire", "Mummy", "Franckentstein", "Zombie", "Skeleton", "Werewolf", "Player"};
		
		System.out.println("Enter player name: ");//prompt
		HalloweenMonster[HalloweenMonster.length - 1] = "Player: " + input.nextLine();
		
		int[] coins = new int[HalloweenMonster.length];
		
		//add coins
		for(int i = 0; i < HalloweenMonster.length; i++) {
			coins[i] = (int)(Math.random() * 8) + 2;
			System.out.println(HalloweenMonster[i] + "has " + coins[i] + " GOLD COINS.");
		}
		
		String[] Abilities = new String[HalloweenMonster.length];
		
		Abilities[0] = "Fangs";
		Abilities[1] = "Sand Powers";
		Abilities[2] = "Fire!!!";
		Abilities[3] = "dECAY";
		Abilities[4] = "bones";
		Abilities[5] = "Claws";
		Abilities[6] = "EVERYTHING!!!!!!!!";
		
		System.out.println();
		
		for(int i = 0; i < HalloweenMonster.length; i++) {
			System.out.println(HalloweenMonster[i] + " WILL ATTACK WITH " + Abilities[i]);
		}
		
		int[] hp= new int[HalloweenMonster.length];
		for(int i = 0; i < HalloweenMonster.length; i++) {
			hp[i] = (int)(Math.random() * 15 + 2);
		}
		//prints hp
		for(int i = 0; i < HalloweenMonster.length; i++) {
			System.out.println(HalloweenMonster[i] + " has " + hp[i] + " HEALTH POINTS");
		}
		System.out.println("The " + HalloweenMonster[2] + " Ate a Teenager, how " + "Many coins did it get? ");//taking a number from user input
		coins[2] += input.nextInt();// adding coins to coins[2]
		input.nextLine();//gets rid of the enter thing
		 
		
		
		System.out.println(HalloweenMonster[3] +" Morphs into what?:");
		HalloweenMonster[2] = input.nextLine();
		
		System.out.println("The HalloweenMonster is a: " + HalloweenMonster[2]);
		int totalCoins = coins[HalloweenMonster.length-1];
		int turns = 0;
		
		
		while(hp[hp.length-1] > 0) {
			int randomHalloweenMonster = (int)(Math.random() *  HalloweenMonster.length);
			if(randomHalloweenMonster != HalloweenMonster.length-1) {
				int HITTHEMONSTER = (int)(Math.random() * 2);
				
				if(HITTHEMONSTER % 2 == 0) { //
					int randomDmg = (int)(Math.random() * 2 + 1);
					hp[HalloweenMonster.length - 1] -= randomDmg;//subtracting the 
					System.out.println(HalloweenMonster[randomHalloweenMonster] + " hit you for " + randomDmg + " hp! " + hp[HalloweenMonster.length-1] + " hp LEFT.");
					
					
					
				}//end second if
				else {
					System.out.println(" Player hits with " + Abilities[HalloweenMonster.length-1] + " " + HalloweenMonster[randomHalloweenMonster] + "Runs away. IT'S GONE " + coins[randomHalloweenMonster] + " coins ");
					totalCoins += coins[randomHalloweenMonster];
				}
				turns++;
			}//end if
			
			System.out.println();
			}//end while
		
		System.out.println(" You runs away " + totalCoins + " Coins " + "and lasted " + turns + " Turns.");
	}//end main

}
