/**
 * 
 */
package com.lohia.shailendra.recursion;

/**
 * @author Shailendra
 *
 */
public class Fab_recursion {
	
	//private int data;
	//private Fab_recursion user;
	

	//Without recursion
	public static int[] Fibonacci_withoutRecursion(int number)
	{
		int[] fibonacciArray = new int[number];
		fibonacciArray[0] = 0;
		fibonacciArray[1] = 1;
		
		for(int iIndex=2; iIndex < fibonacciArray.length;iIndex++){
			fibonacciArray[iIndex] = fibonacciArray[iIndex - 1] + fibonacciArray[iIndex -2];
		}
		
		return fibonacciArray;
	}
	
	//With Recursion
	public static int Fibonacci_withRecursion(int number)
	{
		if(number == 1)
		return 1;
		
		if(number == 2)
			return 1;
		
		return Fibonacci_withRecursion(number - 1) + Fibonacci_withRecursion(number - 2);
	}
	
	public static void main(String[] args){
		
		//int[] fibonacciArray = Fibonacci_withoutRecursion(15);
		
		for(int iIndex=1;iIndex <15;iIndex++)

			System.out.println("Fibonacci Series" + Fibonacci_withRecursion(iIndex));
		
		
	}
}
