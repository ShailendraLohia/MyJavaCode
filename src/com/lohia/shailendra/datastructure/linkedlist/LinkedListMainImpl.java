/**
 * 
 */
package com.lohia.shailendra.datastructure.linkedlist;

/**
 * @author Shailendra
 *
 */
public class LinkedListMainImpl {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		LinkedListImpl linkedListImpl = new LinkedListImpl();
		linkedListImpl.insertNodeAtGivenPosition(100, 1);		
		linkedListImpl.insertNodeAtGivenPosition(200, 1);
		linkedListImpl.removeNodeFromBegin();
		System.out.println("LinkedList " + linkedListImpl);

	}

}
