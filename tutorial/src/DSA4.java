
public class DSA4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String[] names = {"Veronica", "Esther","Nya","Bob", "Jim","Rylyn", "Henry", "John", "Joe", "OO"};
		
		double[] raisedMoney = {100,348,574,579,204,485,97.56,79.45,937.54,573.678};
		
		boolean[] returnedForm = { true, false, true, false, true, false, true, false, true, false };
		
		for(int i =0; i < names.length; i++) {
			System.out.println("Name:" + names[i] + " $" + raisedMoney[i] + "form:" + returnedForm[i]);
			
		}
		//step 2
		double totalAmt = 0;
		for(int i = 0; i < raisedMoney.length; i++) {
			totalAmt += raisedMoney[i];//add each index to the totalAmt
		}
		double avgRaised = totalAmt / names.length;//calculates avg amount raised
		
		int bigMoneyCount = 0;//tracks how many ppl raised over $200
		
		for(int i = 0; i < raisedMoney.length; i++) {
			//searching for > 200
			//counting the number of ppl over $200
			
			if(raisedMoney[i] > 200) {
				
				System.out.println( names[i] + " Raised " + raisedMoney[i]);
				
				bigMoneyCount++;
			
			}//end if
		}//end for
		
		for(int i = 0; i < returnedForm.length; i++) {
			
			if(returnedForm[i] == false) {
				
				System.out.println(names[i] + " Has not RETURNED FORM");
			}
		}
		
		System.out.println(" Total amount Raised " + totalAmt);
		
		System.out.println(" Avg amount raised " + avgRaised);
		
		double lowestAmt;
		lowestAmt = raisedMoney[0];
		
		for(int i = 0; i < raisedMoney.length; i++) {
			if(raisedMoney[i] < lowestAmt) {
				lowestAmt = raisedMoney[i];//sets new lowest value
				nameIndex = i;
				person = names[i]
			}
		}
	
		System.out.println( "Lowest amount raised: " + lowestAmt + " by "
		
		
	}//end main

}
