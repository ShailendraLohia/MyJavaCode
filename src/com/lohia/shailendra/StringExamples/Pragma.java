/**
 * 
 */
package com.lohia.shailendra.StringExamples;

import java.util.HashSet;

/**
 * @author Shailendra
 *
 */
public class Pragma {
	
	public static void main(String[] args){
		
		String input1 ="We promptly judged antique ivory buckles for the next prize";
		String input2 = "Shailendra Kumar Lohia";
		String output = validatePragma(input2);
		
		System.out.println(output);
	}
	
	
	public static String validatePragma(String str){
		
		
		HashSet<Character> set = new HashSet<Character>();
		
		for(int iChar=0;iChar<str.length();iChar++){
			if(str.charAt(iChar) != ' '){
				set.add(str.charAt(iChar));
			}
		}
		
		if(set.size() == 26){
			//System.out.println("Pragma");
			return "Pragma";
		}else{
				//System.out.println("Not Pragma");
				return "Not Pragma";
			}
		
		//return null;
		}
		
	}


/*String s = new Scanner(System.in).nextLine().toLowerCase();

int val = (1 << 26) - 1;
int res = 0;
for(int i = 0; i < s.length(); ++i){
    int c = s.charAt(i) - 'a';
    if(c>= 0 && c< 26)
        res |= 1 << c;
}
System.out.println(val == res ? "pangram" : "not pangram");
*/