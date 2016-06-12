/**
 * 
 */
package com.lohia.shailendra.recursion;

/**
 * @author Shailendra
 *
 */
public class PrimeNumber {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		int givenNumber = checkPrimeNumber(100);
		if(givenNumber == 1)
		System.out.println("PrimeNumber");
		else
			System.out.println("Not");
	}

	public static int checkPrimeNumber(int primeNumber){
		
		if(primeNumber == 1)
			return 1;
		if(primeNumber == 0)
			return 0;
		
		return checkPrimeNumber(primeNumber % 2);
	}
	
}
