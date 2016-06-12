/**
 * 
 */
package com.lohia.shailendra.ListExample;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

/**
 * @author Shailendra
 *
 */
public class ArrayListExample {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		ArrayList<String> arrayList = new ArrayList();
		arrayList.add("Shailendra");
		arrayList.add("Lohia");
	
		//List<Integer>[] intList = new List<Integer>[5]; -- This type of generic array is not allowed
		
		//Collections.synchronizedCollection(Collection c)
		// synchronized collection
		Collections.synchronizedList(arrayList);
		//readOnly collection
		Collections.unmodifiableList(arrayList);
		System.out.println("Befor remove element from Arraylist: Size of arrayList: " + arrayList.size());
		
		/*for(String name: arrayList) {
			System.out.println(name);
		}*/
		
		Iterator iterator = arrayList.iterator();
		while(iterator.hasNext())
		{
			String name = (String)iterator.next();
			if(name.equals("Shailendra")){
				iterator.remove();
				//arrayList.remove(0);
				// Since Iterator is fail-fast property, it does not allow to add any element in list during iteration.
			//arrayList.add("Kumar");
			}
		}
		System.out.println("Size of arrayList: " + arrayList.size());	
		

	}

}
