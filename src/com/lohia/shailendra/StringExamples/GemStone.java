/**
 * 
 */
package com.lohia.shailendra.StringExamples;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

/**
 * @author Shailendra
 *
 */
public class GemStone {
	public static void main(String[] args){
		
		Scanner scan  = new Scanner(System.in);
	    int numString = scan.nextInt();
	    int count = 0;
	    int [] arrayChars = new int[26];
	    Set<Character> charSet = new HashSet<Character>();

	    for(int i = 0; i< numString; i++) {
	        String str = scan.next();


	        for (char c : str.toCharArray()) {
	          charSet.add(c);
	        }

	        for (char s : charSet) {
	            int x = (int)s-97;
	            int j = arrayChars[x];
	            int k = arrayChars[x] + 1;
	           // arrayChars[x]++;
	            arrayChars[x] = arrayChars[x] + 1;

	            if(arrayChars[x] >= numString){
	                count++;
	            }
	        }

	        charSet.clear();      
	    }

	    System.out.println(count);
	}

}
