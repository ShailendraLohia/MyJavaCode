/**
 * 
 */
package ArrayPractice;

import java.lang.reflect.Method;

/**
 * @author Shailendra
 *
 */
public class ArraySolution {
	
	public static void main( String args[] )
    {
        Printer myPrinter=new Printer();
        Integer[] intArray = { 1, 2, 3 };
        Double[] doubleArray = {1.33,3.44};
        String[] stringArray = {"Hello","World"};
        myPrinter.printArray( intArray  );
        myPrinter.printArray( stringArray );
        myPrinter.printArray(doubleArray);
        int count=0;
      for (Method method : Printer.class.getDeclaredMethods()) {
            String name = method.getName();
            if(name.equals("printArray"))
              count++;
        }
        
        if(count>1)System.out.println("Method overloading is not allowed!");
        assert count==1;

    }
	
	

}

class Printer{
	public <Z> void printArray(Z[] array){
		
		for(Z item: array){
	        System.out.println(item);
	    }
		
	}
}
