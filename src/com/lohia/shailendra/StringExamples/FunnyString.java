/**
 * 
 */
package com.lohia.shailendra.StringExamples;

import java.util.Scanner;

/**
 * @author Shailendra
 *
 */
public class FunnyString {
	
	public static void main(String[] args){
		
		Scanner scanner = new Scanner(System.in);
		int t = scanner.nextInt(); // Number of test cases.
		scanner.nextLine(); // Goto next line
		for(int i= 0;i < t; i++){
			String sstring =scanner.nextLine().trim();	
		String str3 = checkFunnyString(sstring);
		
		System.out.println(str3);
		}
	}
	
	
	public static String checkFunnyString(String str1){
		
		StringBuilder sBuilder = new StringBuilder(str1);
		String str2= sBuilder.reverse().toString();
		
		for(int j = 1;j<str1.length();j++){
			//System.out.println("value of Math.abs((str1.charAt(j) - str1.charAt(j-1))): " +Math.abs(((int)str1.charAt(j) - (int)str1.charAt(j-1))));
			//System.out.println("value of Math.abs((str1.charAt(j) - str1.charAt(j-1))): " +Math.abs(((int)str2.charAt(j) - (int)str2.charAt(j-1))));
			if(!((Math.abs(((int)str1.charAt(j) - (int)str1.charAt(j-1)))) == 
					Math.abs(((int)str2.charAt(j) - (int)str2.charAt(j-1))))){
				
				return "Not Funny";
				
			}
		}
		return "Funny";
		
	}

}







/*public static boolean isFunny(String asx) {
char[] chars = asx.toCharArray();
char[] chars2 = new     StringBuilder(asx).reverse().toString().toCharArray();
    for (int i = 1; i < asx.length(); i++) {
        if (Math.abs((int) chars[i] - (int) chars[i - 1]) != Math.abs((int) chars2[i] - (int) chars2[i - 1])) {
            return false;
        }
    }
    return true;
}

public static void main(String[] args) {
    Scanner in = new Scanner(System.in);
    int t = in.nextInt();
    in.nextLine(); // Discard '\n'
    for(int a0 = 0; a0 <t; a0++){
        String n = in.nextLine().trim();
        String result = (isFunny(n)==true) ? "Funny" : "Not Funny";
        System.out.println(result);

    }
*/
