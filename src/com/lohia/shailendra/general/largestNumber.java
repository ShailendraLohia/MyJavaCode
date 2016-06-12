/**
 * 
 */
package com.lohia.shailendra.general;

/**
 * @author Shailendra
 *
 */
public class largestNumber {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		int[] givenArray = {2,-1,9,1,6};

		System.out.println("Largest Number is: " + findLargestNumber(givenArray));
	}

	
	public static int findLargestNumber(int[] givenInputs){
		
		if(givenInputs.length == 0){
			return -1;
		}
		int largestNumber = givenInputs[0];
		for(int i=1;i<givenInputs.length;i++){
			
			if(largestNumber < givenInputs[i]){
				largestNumber = givenInputs[i]; 
			}
		}
		
		
		return largestNumber;
	}
}
