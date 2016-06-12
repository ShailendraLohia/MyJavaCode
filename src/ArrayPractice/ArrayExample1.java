package ArrayPractice;

public class ArrayExample1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] firstArray = {10,20,30,40,50};
		
		int sum = sumOfElements(firstArray);
		System.out.println("Addition of Numbers: " + sum);

	}
	
	public static int sumOfElements(int[] firstArray)
	{
		int sum = 0;
		for(int i : firstArray)
		{
			sum = sum + i;
		}
		
		return sum;
	}

}
