/**
 * 
 */
package ArrayPractice;

import java.util.Arrays;
import java.util.Scanner;

/**
 * @author Shailendra
 *
 */
public class SearchElement {
	
	
	public static void main(String[] args){
		
		Scanner scanner = new Scanner(System.in);
		int element = scanner.nextInt();
		int[] readArray = {23,45,12,56,789,20};
		
		int result = search(readArray,element);
		System.out.println(result);
		
	}
	
	public static int search(int[] inputArray, int elementToBeSearched){
		
		Arrays.sort(inputArray);
		
		for(int i=0;i<inputArray.length;i++){
			if(inputArray[i] == elementToBeSearched){
				return inputArray[i];
			}else{
				if(inputArray[i] > elementToBeSearched)
				{
					//break;
					return inputArray[i]; 
				}
			}
		}
		
		return 1;
	}

}
