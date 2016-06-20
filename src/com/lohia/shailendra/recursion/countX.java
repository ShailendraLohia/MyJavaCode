/**
 * 
 */
package com.lohia.shailendra.recursion;

/**
 * @author Shailendra
 *
 */
public class countX {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		String str="xxhixx";
		int count = countXChar(str);
		
		System.out.println(count);

	}
	
	public static int countXChar(String str){
		
		if(str.length()==0)
			return 0;
		
		if(str.charAt(str.length()-1) == 'x'){
			return 1 + countXChar(str.substring(0, str.length()-1));
		}
		return countXChar(str.substring(0, str.length()-1));
	}
	
	

}
