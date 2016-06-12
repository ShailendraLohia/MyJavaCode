/**
 * 
 */
package com.lohia.shailendra.general;

/**
 * @author Shailendra
 *
 */
public class SwapEnds {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		int[] givenArray = {1, 2, 3, 4};
		
		givenArray = swapEnds(givenArray);
		
		for(int i=0;i<givenArray.length;i++){
			System.out.println(givenArray[i]);
		}

	}

	
	public static int[] swapEnds(int[] givenArray){
		
		int firstNumber = givenArray[0];
		int secondNumber = givenArray[(givenArray.length)-1];
		
		firstNumber = firstNumber + secondNumber;
		secondNumber = firstNumber - secondNumber;
		firstNumber = firstNumber - secondNumber;
		
		givenArray[0] = firstNumber;
		givenArray[(givenArray.length)-1] = secondNumber;
		
		return givenArray;
	}
}
