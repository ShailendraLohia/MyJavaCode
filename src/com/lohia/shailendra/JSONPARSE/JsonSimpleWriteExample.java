/**
 * 
 */
package com.lohia.shailendra.JSONPARSE;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import org.json.simple.parser.ParseException;
import java.util.Iterator;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;

/**
 * @author Shailendra
 *
 */
public class JsonSimpleWriteExample {
	
	public static void main(String[] args){
		
		JSONParser parser = new JSONParser();
		
		try{
			Object obj = parser.parse(new FileReader("test.json"));
			JSONObject jsonObject = (JSONObject)obj;
			
			String name = (String)jsonObject.get("name");
			//System.out.println("name: " + name);
			System.out.println(name);
			Long age = (Long)jsonObject.get("age");
			System.out.println("age: " + age);
			
			JSONArray jsonArray = (JSONArray)jsonObject.get("messages");
			Iterator iterator = jsonArray.iterator();
			
			while (iterator.hasNext()) {
				System.out.println(iterator.next());
			}
		}catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} catch (ParseException e) {
			e.printStackTrace();
		}
	}

}
