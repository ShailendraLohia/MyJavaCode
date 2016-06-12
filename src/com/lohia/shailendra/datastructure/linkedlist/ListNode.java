/**
 * 
 */
package com.lohia.shailendra.datastructure.linkedlist;

/**
 * @author Shailendra
 *
 */
public class ListNode {
	
	private int data;
	private ListNode nextNode;
	
	// parametrized constructor
	public ListNode(int data)
	{
		this.data = data;
	}
	public int getData() {
		return data;
	}
	public void setData(int data) {
		this.data = data;
	}
	
	public ListNode getNextNode() {
		return nextNode;
	}
	public void setNextNode(ListNode nextNode) {
		this.nextNode = nextNode;
	}
	
	
	

}
