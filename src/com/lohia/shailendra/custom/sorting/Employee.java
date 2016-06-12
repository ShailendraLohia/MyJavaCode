/**
 * 
 */
package com.lohia.shailendra.custom.sorting;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Date;
import java.util.List;

/**
 * @author Shailendra
 *
 */
class Employee implements Comparable<Employee>{
	
	private String name;
	private int age;
	//private Date doj;
	private int salary;
	
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	/*public Date getDoj() {
		return doj;
	}
	public void setDoj(Date doj) {
		this.doj = doj;
	}*/
	public int getSalary() {
		return salary;
	}
	public void setSalary(int salary) {
		this.salary = salary;
	}
	
	@Override
	public int compareTo(Employee emp) {
		// TODO Auto-generated method stub
		return this.salary - emp.salary;
	}
	
public Employee(String name,int age,/*Date doj,*/int salary){
	
	this.name = name;
	this.age = age;
	//this.doj = doj;
	this.salary = salary;
	
}
	
public static void main(String[] args){
	
	Employee emp1 = new Employee("Shailendra",30,38000);
	Employee emp2 = new Employee("Ritu",27,35000);
	
	List<Employee> list = new ArrayList();
	
	list.add(emp1);
	list.add(emp2);
	
	for(Employee emp : list){
	System.out.println("Before sort" + emp.getSalary());
	}
	Collections.sort(list);
	
	for(Employee emp : list){
	System.out.println("After sort" + emp.getSalary());
	}
}

}


