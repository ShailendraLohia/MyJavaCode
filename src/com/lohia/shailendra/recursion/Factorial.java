/**
 * 
 */
package com.lohia.shailendra.recursion;

/**
 * @author Shailendra
 *
 */
public class Factorial {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		int factorialOfNum = calculateFactorial_recursion(5);
		System.out.println("Factorial of given number: " + factorialOfNum);

	}
	// Without recursion
	public static int calculateFactorial(int factorialNum){
		
		int muliplication = 1;
		
		while(factorialNum > 0){
			muliplication = muliplication * factorialNum;
			factorialNum--;
		}
		
		return muliplication;
	}
	
	
	// With recursion
	public static int calculateFactorial_recursion(int factorialNum){
		
		if(factorialNum <= 1)
			return 1;
		else{
			return factorialNum * calculateFactorial_recursion(factorialNum - 1);
		}
			
		
		
	}

}
