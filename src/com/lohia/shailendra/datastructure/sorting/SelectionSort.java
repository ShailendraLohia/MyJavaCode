/**
 * 
 */
package com.lohia.shailendra.datastructure.sorting;

import java.util.Arrays;

/**
 * @author Shailendra
 * 
 * Remember smallest element position instead of smallest element
 *
 */
public class SelectionSort {

	public static void main(String[] args)
	{
		int[] unsortedArray = {23,12,34,3,90,16,1,42};
		int[] arraySorted = sortedArray(unsortedArray);

		for(int iIndex=0;iIndex <arraySorted.length;iIndex++)

			System.out.println("Sorted Array" + arraySorted[iIndex]);
	}


	public static int[] sortedArray(int[] unArray)
	{
		for(int iIndex=0;iIndex < unArray.length;iIndex++){
			int minimum = iIndex; // Remember position

			for(int jIndex=iIndex+1;jIndex < unArray.length;jIndex++)
			{
				if(unArray[minimum] > unArray[jIndex]){
					minimum = jIndex; //Remember smallest element position
				}
			}
			// Swap smallest element with first for loop current index
			if(unArray[iIndex] != unArray[minimum])
			{
				int temp = unArray[iIndex];
				unArray[iIndex] = unArray[minimum];
				unArray[minimum] = temp;
			}
		}

		return unArray;
	}

}
