/**
 * 
 */
package com.lohia.shailendra.JSONPARSE;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
/**
 * @author Shailendra
 *
 */
public class JsonSimpleExample {
	
	public static void main(String[] args){
		
		
		JSONObject obj = new JSONObject();
		obj.put("name", "Shailendra");
		obj.put("age", new Integer(32));
		JSONArray list = new JSONArray();
		
		list.add("msg 1");
		list.add("msg 2");
		list.add("msg 3");
		
		obj.put("messages", list);
		
		try {
			File file=new File("test.json");

			FileWriter fileWriter = new FileWriter(file);
			fileWriter.write(obj.toJSONString());
			fileWriter.flush();
			fileWriter.close();

		} catch (IOException e) {
			e.printStackTrace();
		}
		
		System.out.print(obj);
	}

}
