package com.lohia.shailendra.StringExamples;

public class StringExample1 {

	public static void main(String[] args) {
		
		String str1 = "Shailendra";
		String str2 = "Shailendra";
		String secondString = new String("Shailendra");
		String firstString = new String("Shailendra");
		
		if(firstString == secondString)
		{
			System.out.println("true");
		}else
			System.out.println("false");

		if(str1 == str2){
			System.out.println("Immutable String:: true");
		}else
			System.out.println("Immutable String:: false");
		
		if(secondString.equals(firstString))
			System.out.println("Equality: " + true);
		else
			System.out.println("Not Equality: " + false);
		//}
		
	
	// 2 Example
	String str3 = "abc";
	//StringBuffer stringBuffer = new StringBuffer(str3);
	String string = new String(str3);
	if(str3.equals(string)){
		String str4 = 123 + "4";
		System.out.println("value of str4:" + str4);
	System.out.println("check equality of String: " + str3.equals(string));
	}
	
	String str4 = 123 + "4";

}
	
	
}
