package tutorialpackage;
import java.util.Random;
public class SuperheroArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String[] Superhero = {"Superman", "Wonderwoman", "Batman" , "Black Panther", "Spiderman"};
		String[] Superpower = {"Fly", "Strength", "Bat mobile", "Speed", "Spider Silk"};
		boolean[] isHuman = {false, true, false, true, true};
		int[] firsthero = new int [Superhero.length ];
		int[] lasthero = new int [Superhero.length];
		
		Random r = new Random();
		
		System.out.println(Superhero[Superhero.length - 5]);
		System.out.println(Superhero[Superhero.length - 1]);
		
		for(int i = 0; i < Superhero.length; i++) {
			System.out.println("One of my superheros is: " + Superhero[i]);
	}
		for(int i = 0; i < Superpower.length; i++) {
			System.out.println("Superhero Name: " + Superhero[i] +  "   " + "Power: " + Superpower[i] + "    " +"Are they human?: "  + isHuman[i]);
			
		}
		
		for(int i = 0; i < Superhero.length; i++) {
			System.out.println(i + " " + Superhero[i] );
		}
		for(int i = 0; i < isHuman.length; i++) {
			if (isHuman[i] == false) {
				Superpower[i] = "None";
			}
			System.out.println(Superpower[i]);
			
		}

}}
                 