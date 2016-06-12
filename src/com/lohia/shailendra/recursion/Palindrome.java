/**
 * 
 */
package com.lohia.shailendra.recursion;

/**
 * @author Shailendra
 *
 */
public class Palindrome {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		String name= "Damad";
		char[] nameChar = name.toCharArray();
		
		
		nameChar = reverseString(nameChar,0);
		String string = new String(nameChar);
		//StringBuilder builder = new StringBuilder(nameChar);
		if(name.equals(string))
			System.out.println("Palindrome");
		else
			System.out.println("Not");

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
}
