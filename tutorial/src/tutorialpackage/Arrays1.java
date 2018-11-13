package tutorialpackage;
import java.util.Random;
public class Arrays1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String[] nameArray = {"Christian", "Esther","Nya","Veronica","Scott","Mr.Troung"};
		int[] gradesArray = new int[nameArray.length];
		int avg = 0;
		
		for(int i = 0; i < nameArray.length; i++) {
			System.out.println("Name: " + nameArray[i] + "Grade: " + gradesArray[i]);
		}
		Random r = new Random();
		
		for(int i = 0; i < gradesArray.length; i++) {
			gradesArray[i] = r.nextInt(101);
		}
		for(int i = 0; i < nameArray.length; i++) {
			System.out.println("Name: " + nameArray[i] + "Grade: " + gradesArray[i]);

		}
		gradesArray[5] = 85;
		
		for(int i = 0; i < gradesArray.length; i++) {
			System.out.println("Name: " + nameArray[i] + "Grade: " + gradesArray[i]);
		}
		for(int i = 0; i < gradesArray.length; i++) {
			avg= gradesArray[i];
			
		}
		avg = avg/gradesArray.length;
		System.out.println("class average: " + avg);
		

}}
