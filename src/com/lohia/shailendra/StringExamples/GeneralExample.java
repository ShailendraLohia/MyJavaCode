/**
 * 
 */
package com.lohia.shailendra.StringExamples;

/**
 * @author Shailendra
 *
 */
public class GeneralExample {
	public static void main(String[] args){
		
		String str = "hello";
		String str2 = "world";
		String result = str + str2;	
		int count=0;
		for(char c : /*"abcdefghijklmnopqrstuvwxyz"*/result.toCharArray())
		{
			//if(count>0)
			{if(str.indexOf(c) > -1 && str2.indexOf(c) > -1){
				System.out.println("YES");
				count++;
				break;
			}
			}
				//System.out.println("NO");
		}
		if(count==0)
			System.out.println("NO");
	}

}
