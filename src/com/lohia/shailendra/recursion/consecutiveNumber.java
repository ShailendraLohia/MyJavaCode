/**
 * 
 */
package com.lohia.shailendra.recursion;

import java.util.Arrays;

/**
 * @author Shailendra
 *
 */
public class consecutiveNumber {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		int[] arrayInt = {10,11,23,33,34,30};
		Arrays.sort(arrayInt);
		arrayInt = consecutiveNumbers(arrayInt,0);
		
		System.out.println("consecutiveNumbers: " + arrayInt[0] + " " + arrayInt[1]);

	}

	public static int[] consecutiveNumbers(int[] arrayInt, int index){

		if(index==arrayInt.length-1)
			return arrayInt;

		Integer firstValue=0;
		Integer secondValue=0;

	
		if((arrayInt[index] + 1) == arrayInt[index + 1])
		{
			firstValue= arrayInt[index];
			secondValue= arrayInt[index + 1];
			arrayInt[0] = firstValue;
			arrayInt[1]= secondValue;
		}
		
		consecutiveNumbers(arrayInt,++index);
		
		return arrayInt;
		//return firstValue.toString() + "and " + secondValue.toString();
	}

}
