/**
 * 
 */
package ArrayPractice;

import java.util.Scanner;

/**
 * @author Shailendra
 *
 */
public class BinarySearch {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		int[] givenArray = {3,6,13,21,36,47,63,81,97};
		Scanner scanner = new Scanner(System.in);
		int element = scanner.nextInt();
		
		int elementFound = searchElement(givenArray,element);
		System.out.println("Element Found At given Array location: " + elementFound);

	}
	
	public static int searchElement(int[] array,int element){
		
		int start=0;
		int end= array.length -1;
		
		while(start<=end){
			int mid = (start+end)/2;
			if(array[mid] == element){
				return mid;
			}else if(element < array[mid]){
				end= mid;
			}else{
				start = mid + 1;
			}
		}
		
		return -1;
	}

}
