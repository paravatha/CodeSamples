package com.codesamples;
/*
 * Description:
 * 
 * Given a currency with denominations of 100, 50, 20, 10, 5 and 1 write a method MakeChange that 
 * takes an integer amount representing the total change to make and return an integer representing 
 * the smallest possible number of bills to return.  For example a call of MakeChange(135) would result 
 * in a return value of 4 (1 one hundred bill, 1 twenty bill, 1 ten bill and 1 five bill).
 * 
 * @Author Prasad Paravatha
 */
public class CurrencyDenomination {
	
	//Default denomination is US currency notes.
	private int [] denominations = {100, 50, 20, 10, 5, 1 };

	/*
	 * Getter for denominations
	 */
	public int[] getDenominations() {
		return denominations;
	}

	/*
	 * Setter for denominations
	 */
	public void setDenominations(int[] denominations) {
		this.denominations = denominations;
	}

	/*
	 *  Given a currency with denominations this method returns 
	 *  an integer representing the smallest possible number of bills.
	 *  @param amount an integer amount to be processed
	 *  @return an integer representing number of bills
	 */
	public int makeChange(int amount) {
		
		//Initialize variables
		int noOfBills  = 0 ;
		
		//Calculate number of bills for a given currency denomination.
		for (int count = 0; count < denominations.length; count++ ) {
			noOfBills += amount / denominations[count];
			amount = amount % denominations[count];
		}
			
		System.out.println("Number of dollar bills = " + noOfBills);
		return noOfBills;
	}
}
