/**
 * 
 */
package com.lohia.shailendra.recursion;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

/**
 * @author Shailendra
 *
 */
public class Vowels {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		String string = "Shailendra";
		
		char[] arrayChar =string.toCharArray();
		
		arrayChar = countOfVowels(arrayChar,0);
		
		/*List<Character> list = new ArrayList();
		
		for(int i =0; i<arrayChar.length;i++){
			if(arrayChar[i] !=' ')
				list.add(arrayChar[i]);*/
		for(int i =0; i<arrayChar.length;i++)
			if(arrayChar[i] !='\u0000')					
			   System.out.println("Reverse String is: " + arrayChar[i] );
		

	}
	
	public static char[] countOfVowels(char[] arrayChar, int index){
		
		if(arrayChar.length == index){
			return arrayChar;
		}
		
		char letter = '\u0000';
		if(arrayChar[index] == 'a' || arrayChar[index] =='e' || arrayChar[index] =='i')
			 letter = arrayChar[index];

		countOfVowels(arrayChar,++index);
		
		arrayChar[arrayChar.length - index] = letter;
		return arrayChar;
	}

}
