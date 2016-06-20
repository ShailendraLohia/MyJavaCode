/**
 * 
 */
package com.lohia.shailendra.recursion;

/**
 * @author Shailendra
 *
 */
public class changePi {

	/**
	 * @param args
	 */
	public static void main(String[] args) {


		String str="xpipix";
		
		String result = replacePi(str);
		System.out.println(result);

	}
	
	public static String replacePi(String str){
		System.out.println(str);
		if(str.length()==0){
			return str;
		}
		
		if(str.indexOf("pi") == -1){
			return str;
		}
		else
		{	StringBuilder sb = new StringBuilder(str.replace("pi", "3.14"));
			
			System.out.println(sb.toString());
			return replacePi(sb.toString());
		}
		
	}

}
