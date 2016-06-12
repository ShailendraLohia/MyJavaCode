package com.lohia.shailendra.HashMapExample;

import java.util.Arrays;
import java.util.HashMap;

public class HashMapExample2 {

	public static void main(String[] args) {
	
		//HashMap<Employee,Integer> map = new HashMap();
		int array1[] = {2,4,-1,10};
		Arrays.sort(array1);
		for (int number : array1) {
			   System.out.println("Number = " + number);
			   }
		
		Employee emp1 = new Employee(1,"Shailendra");
		Employee emp2 = new Employee(1,"Shailendra");
		
		//map.put(emp1, 1);
		//map.put(emp2, 2);
		
		if (emp1.equals(emp2))
			System.out.println("Equality: " + true);
		else
			System.out.println("Not Equality :" + false);
		
		
		if(emp1 == emp2){
			System.out.println("Reference Equality: " + true);
		}else
			System.out.println("Reference Not Equality: " + false);

	}
	
	

}

class Employee{
	private int employeeNum;
	private String employeeName;
	
	public Employee(int employeeNum, String employeeName){
		this.employeeNum = employeeNum;
		this.employeeName = employeeName;
	}
	
	
	
	
	
}