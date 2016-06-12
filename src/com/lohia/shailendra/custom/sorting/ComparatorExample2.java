/**
 * 
 */
package com.lohia.shailendra.custom.sorting;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;

/**
 * @author Shailendra
 *
 */
public class ComparatorExample2 {
	
	public static void main(String[] args){
	      Scanner in = new Scanner(System.in);
	      int testCases = Integer.parseInt(in.nextLine());
	      
	      List<Student> studentList = new ArrayList<Student>();
	      while(testCases>0){
	         int id = in.nextInt();
	         String fname = in.next();
	         double cgpa = in.nextDouble();
	         
	         Student st = new Student(id, fname, cgpa);
	         studentList.add(st);
	         
	         testCases--;
	      }
	      
	     
	     
	     Collections.sort(studentList,ComparatorExample2.cgpaComparator);
	      
	         for(Student st: studentList){
	         System.out.println(st.getFname());
	      }
	   }
	
	public static Comparator<Student> cgpaComparator = new Comparator<Student>() {

		@Override
		public int compare(Student s1, Student s2) {
			

            if(s2.getCgpa() == s1.getCgpa()){
            	if((s1.getFname()).equals(s2.getFname())){
            		return (s1.getId() > s2.getId())? 1 : -1;            		
            	}
                return s1.getFname().compareTo(s2.getFname());
            }else{
                return (s2.getCgpa() > s1.getCgpa())? 1 : -1;    
            }

    
			
		}
    	 
     };

}


class Student{
	   private int id;
	   private String fname;
	   private double cgpa;
	   public Student(int id, String fname, double cgpa) {
	      super();
	      this.id = id;
	      this.fname = fname;
	      this.cgpa = cgpa;
	   }
	   public int getId() {
	      return id;
	   }
	   public String getFname() {
	      return fname;
	   }
	   public double getCgpa() {
	      return cgpa;
	   }
	}