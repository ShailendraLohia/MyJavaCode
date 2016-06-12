/**
 * 
 */
package com.lohia.shailendra.HashMapExample;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

/**
 * @author Shailendra
 *
 */
public class HashMapExample3 {
	
	public static void main(String[] args){
		
		Map<String,Integer> hashMap = new HashMap();
		
		hashMap.put("Shailendra", 32);
		hashMap.put("Ritu", 29);
		
		// First way
		Iterator it = hashMap.entrySet().iterator();
		while (it.hasNext()) {
	        Map.Entry pair = (Map.Entry)it.next();
	        System.out.println(pair.getKey() + " = " + pair.getValue());
	        //it.remove(); // avoids a ConcurrentModificationException
	    }
		
		//2nd Way
		//iterating over keys only
		for (String key : hashMap.keySet()) {
		    System.out.println("2nd Way: Key = " + key);
		}

		//iterating over values only
		for (Integer value : hashMap.values()) {
		    System.out.println("2nd Way: Value = " + value);
		}
	}

}
