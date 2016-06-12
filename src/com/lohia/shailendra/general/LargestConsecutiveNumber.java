/**
 * 
 */
package com.lohia.shailendra.general;

import java.util.ArrayList;
import java.util.List;

/**
 * @author Shailendra
 *
 */
public class LargestConsecutiveNumber {
	
	public static void main(String[] args){
		
		int[] givenArray = {22,23,9,10,11,3,4};
		List<Integer> list = largestConsNumber(givenArray);
		
		for(int i: list){
			System.out.println(i);
		}
	}
	
	
	public static List<Integer> largestConsNumber(int[] givenArray){
		
		if(givenArray.length ==0){
			
		}
		
		int sum = 0;
		List<Integer> list = new ArrayList(2);
		
		for(int i=1;i<givenArray.length;i++){
			
			if(((givenArray[i-1]+1) == givenArray[i]) && sum < (givenArray[i-1] + givenArray[i])){
				
				list.clear();
				list.add(givenArray[i-1]);
				list.add(givenArray[i]);
				
				sum = list.get(0) + list.get(1);
			}
		}
		
		return list;
	}

}
