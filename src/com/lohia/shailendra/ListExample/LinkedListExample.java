/**
 * 
 */
package com.lohia.shailendra.ListExample;

import java.util.LinkedList;
import java.util.List;

/**
 * @author Shailendra
 *
 */
public class LinkedListExample {
	
	public static void main(String[] args){
	
	List<String> linkedList = new LinkedList();
	linkedList.add("Shailendra");
	linkedList.add("Lohia");
	
	linkedList.remove("Shailendra");
	
	for (String name : linkedList)
	{
		System.out.println(name);
	}
	}

}
