/**
 * 
 */
package com.lohia.shailendra.StringExamples;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Scanner;
import java.util.Set;

/**
 * @author Shailendra
 *
 */
public class TwoStrings {

	public static void main(String[] args){

		Scanner scan = new Scanner(System.in);
		int numString = scan.nextInt();
		int sum=0;

		Set<Character> charSet = new HashSet<Character>();
		List<String> list = new ArrayList();
		for(int j=0;j<numString;j++){
			//charSet.clear();
			for(int i=0;i<numString;i++){
				String str = scan.next();
				sum = sum + str.length();
				
				for (char c : str.toCharArray()) {
					charSet.add(c);
				}
			}

			if(charSet.size() == sum){
				list.add("NO");
				sum = 0;
				charSet.clear();
				//System.out.println("NO");
			}else{
				list.add("YES");
				sum = 0;
				charSet.clear();
			}
				//System.out.println("YES");
		}	
		
		for(int i=0;i<list.size();i++){
			System.out.println(list.get(i));
		}
	}

}
