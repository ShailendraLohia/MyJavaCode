/**
 * 
 */
package com.lohia.shailendra.recursion;

/**
 * @author Shailendra
 *
 */
public class pairStar {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		String str = "hello";
		String result = pairStarr(str);
		
		System.out.println(result);

	}
	
	public static String pairStarr(String str){
		
		if(str.length()==1){
			return str;
		}
		
		if(str.charAt(str.length()-1)==str.charAt(str.length()-2)){
			char c= str.charAt(str.length()-1);
			StringBuilder sb = new StringBuilder(str);
			sb = sb.insert((sb.length()-1), '*');
			//System.out.println(sb.toString());
			//System.out.println((sb.substring(0, sb.length()-1)).toString());
			//sb=(sb.substring(0, str.length()-1)).toString();
			return pairStarr((sb.substring(0, sb.length()-1)).toString())+c;
		}
		//return str;
		else{
			char c= str.charAt(str.length()-1);
			StringBuilder sb = new StringBuilder(str);
			String s=pairStarr((sb.substring(0, sb.length()-1)).toString());
			return s+c;
		}
	}

}
