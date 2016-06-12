/**
 * 
 */
package com.lohia.shailendra.StringExamples;

import java.util.Scanner;

/**
 * @author Shailendra
 *
 */
public class AlternatingCharacters {
	
	public static void main(String[] args){
		
		Scanner scanner = new Scanner(System.in);
		int numberOfTestCases =  scanner.nextInt();
		scanner.nextLine();
		
		for(int i =0;i<numberOfTestCases; i++){
			String sstring = scanner.nextLine().trim();
			int count = countDeletion(sstring);
			System.out.println(count);
		}
	}
	
	public static int countDeletion(String str1){
		int count = 0;
		for(int i=1; i <str1.length();i++){
			if(str1.charAt(i) == str1.charAt(i-1))
			count++;
		}
		return count;
	}

}
