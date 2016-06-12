/**
 * 
 */
package com.lohia.shailendra.general;

/**
 * @author Shailendra
 *
 */
public class LazyInitializedSingleton {
	
private static LazyInitializedSingleton instance;
    
    private LazyInitializedSingleton(){}
    
    public static LazyInitializedSingleton getInstance(){
        if(instance == null){
            instance = new LazyInitializedSingleton();
        }
        return instance;
    }

}
