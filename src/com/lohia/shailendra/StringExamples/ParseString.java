/**
 * 
 */
package com.lohia.shailendra.StringExamples;

/**
 * @author Shailendra
 *
 */
public class ParseString {
	public static void main(String[] args){
		
		String str = "{CUST_REF:BearerToken58804304,TRIP:99},{CUST_REF:BearerToken5880544304,TRIP:99}";
		String str1 = "{CUST_REF:BearerToken58804304,TRIP:99}";
		parse(str);
		
	}
	
	public static void parse(String str1){
		//System.out.println(str1.indexOf(","));
		//System.out.println(str1.startsWith("{CUST_REF", str1.indexOf(",")));
		//System.out.println(str1.subSequence(str1.indexOf("CUST_REF"), str1.indexOf(",")));
		String[] strSplit = str1.split("},");
		
		for(int i=0;i<strSplit.length;i++){
			//System.out.println(strSplit[i]);
			//strSplit[i].replaceAll("CUST_REF", "cust")/*.replaceAll("}", "")*/;
			String[] againSplit = strSplit[i].split(",");
			for(int j=0;j<againSplit.length;j++){
				System.out.println(againSplit[j]);
				//System.out.println(againSplit.length);
			}
		}
		
		//System.out.println(str1.substring(str1.indexOf("CUST_REF"), str1.indexOf(",")));
	}

}
