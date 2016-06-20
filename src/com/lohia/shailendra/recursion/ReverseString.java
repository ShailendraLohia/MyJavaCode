/**
 * 
 */
package com.lohia.shailendra.recursion;

/**
 * @author Shailendra
 *
 */
public class ReverseString {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		String name= "aamad";
		char[] nameChar = name.toCharArray();
		
		
		nameChar = reverseString(nameChar,0);
		
		System.out.println(7%10);
		for(int i =0; i<nameChar.length;i++)
		System.out.println("Reverse String is: " + i + " " + nameChar[i]);

	}
	
	public static char[] reverseString(char[] charName, int index){
		
		if(charName.length == index)
		{
			return charName;
		}
		
		//char letter =charName[charName.length - index--];
		char letter =charName[index++];
		reverseString(charName,index);
		charName[charName.length - index] = letter;
		
		return charName;
		
		
		
	}
	
	/*public static String reverseGivenString(char[] stringArray){
		//int index=0;
		if(stringArray.length==0){
			return stringArray.toString();
		}
		
		char letter =stringArray[stringArray.length -1];		
		reverseGivenString(stringArray);
		stringArray[stringArray.length - ] = letter;
	}*/

}
