/**
 * 
 */
package com.lohia.shailendra.general;

/**
 * @author Shailendra
 *
 */
public class MaxSpan {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		int[] givenArray = {1, 5, 2, 1, 4, 4, 4};
		
		System.out.println(spanOfNumbers(givenArray));

	}

	
	public static int spanOfNumbers(int[] givenArray){
		
		int firstNumber = givenArray[0];
		int lastNumber = givenArray[(givenArray.length) -1];
		int count =2;
		
		for(int i=1;i<((givenArray.length)-1);i++){
			
			if((givenArray[i]== firstNumber) || (givenArray[i]== lastNumber))
			
				count++;
		}
		
		return count;
	}
}
