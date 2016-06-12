/**
 * 
 */
package com.lohia.shailendra.datastructure.sorting;

/**
 * @author Shailendra
 *
 */
public class InsertionSort {

	/**
	 * @param args
	 */
	public static void main(String[] args) 
	{
		int[] unsortedArray = {23,12,34,3,90,16,1,42};
		
		int[] arraySorted = sortedArray(unsortedArray);

		for(int iIndex=0;iIndex <arraySorted.length;iIndex++)

			System.out.println("Sorted Array" + arraySorted[iIndex]);

	}
	
	public static int[] sortedArray(int[] unsortedArray)
	{
		for(int iIndex=1;iIndex < unsortedArray.length; iIndex++){
			int arrayElement = unsortedArray[iIndex];
			int jIndex =iIndex;
			
			while(jIndex >0 && (unsortedArray[jIndex - 1] > arrayElement))
			{
				
				unsortedArray[jIndex] = unsortedArray[jIndex -1];
				jIndex = jIndex -1;
				unsortedArray[jIndex]= arrayElement;
			}
			
			
		}
		
		return unsortedArray;
	}

}
