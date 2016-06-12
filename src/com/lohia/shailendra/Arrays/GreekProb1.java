package com.lohia.shailendra.Arrays;

import java.util.HashMap;
import java.util.LinkedHashMap;

import java.util.Map;

import java.util.Set;



public class GreekProb1 {
	public static void main(String[] args) {

		int[] array = {1, 5, 7, -1,2,4};
		
		Map<Integer,Integer> map = new HashMap();
		int sum = 6;
		int countFlag = 0;
		
		for(int i=0;i<array.length;i++){
			if(map.containsValue(array[i])){
				map.put(array[i], (sum - array[i]));
				countFlag++;
			}else{
				map.put(array[i], (sum - array[i]));
			}
		}
		System.out.println("Number of pairs whose sum is: " + countFlag);
	}
}


