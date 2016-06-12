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
public class TwoStrings2 {
	
	public static void main(String[] args){
		List<String> list = determineSubString();
		for(int i=0;i<list.size();i++){
			System.out.println(list.get(i));
		}
	}
	
	public static List<String> determineSubString(){
		
		Scanner scan = new Scanner(System.in);
		int numString = scan.nextInt();
		List<String> list = new ArrayList();
		
		for(int i=0;i<numString;i++){
			String str = scan.next();
			String str2 = scan.next();
			String result = str + str2;
			boolean flag = true;
			for(char c : "abcdefghijklmnopqrstuvwxyz".toCharArray()){
				
				if(str.indexOf(c) > -1 && str2.indexOf(c) > -1){
					list.add("YES");
					flag = false;
					break;
				}
			}
			if(flag)
				list.add("NO");
		}
		
		return list;
		
	}

	

}
