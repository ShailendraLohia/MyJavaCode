/**
 * 
 */
package com.lohia.shailendra.HashMapExample;

import java.util.HashMap;
import java.util.Map;

import org.omg.Messaging.SyncScopeHelper;

/**
 * @author Shailendra
 *
 */
public class HashMapExample1 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		String name = "Shailendra";

		Map<String,Integer> countOfChar = countNumberOfCharacter(name);

		System.out.println("count of char" + countOfChar);
		//System.out.println();

	}

	public static Map<String,Integer> countNumberOfCharacter(String name)
	{
		Map<String,Integer> lengthOfChar = new HashMap();
		int iValue =1;
		if(name.length() > 0){
			for(int index =0;index < name.length();index++){
				//if Map already contains key, increment the value of key by 1.
				if(lengthOfChar.containsKey(Character.toString(name.charAt(index)))){
					int lvValue= lengthOfChar.get(Character.toString(name.charAt(index)));
					lvValue = lvValue + 1;
					lengthOfChar.remove(Character.toString(name.charAt(index)));
					lengthOfChar.put(Character.toString(name.charAt(index)), lvValue)	;

				}else
					lengthOfChar.put(Character.toString(name.charAt(index)), iValue)	;
			}

		}
		return lengthOfChar;
	}

}
