/**
 * 
 */
package com.lohia.shailendra.general;

/**
 * @author Shailendra
 *
 */
public class Fix45 {

	/**
	 * @param args
	 */
	
	
	public static void main(String[] args) {
		
		
		
		
		
		int[] givenArray = {5, 4, 9, 4, 9, 5};
		
		givenArray = fix45(givenArray);
		
		System.out.println(givenArray);

	}
	
	public static int[] fix45(int[] nums) {
		
		int t=0;
		  for(int i=0; i< nums.length ; i++)
		     for(int j=0;j<nums.length ; j++)

		     if(nums[i]==5 && nums[j]==4)
		     {
		      t=nums[j+1];
		      nums[j+1]=nums[i];
		      nums[i]=t;
		     }
		     return nums;
		
		//return nums;
		  
	}

}
