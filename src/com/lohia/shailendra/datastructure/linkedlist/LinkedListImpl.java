/**
 * 
 */
package com.lohia.shailendra.datastructure.linkedlist;

/**
 * @author Shailendra
 *
 */
public class LinkedListImpl {
	
	private ListNode headNode;
	private int length;
	
	// constructor
	
	public LinkedListImpl(){
		length =0;
	}
	
	// Get HeadNode from list
	
	public ListNode getHeadNode()
	{
		return headNode;
	}
	
	// Insert node at beginning
	public void insertNodeAtBegin(ListNode newNode)
	{
		newNode.setNextNode(headNode);
		headNode = newNode;
		length++;
	}
	
	// Insert node at last
	
	public void insertNodeAtLast(ListNode newNode){
		if(null != headNode){
			headNode = newNode;
		}/*else{
			ListNode node = headNode;
			while(null != node.getNextNode())
				node= node.getNextNode();
			node.setNextNode(newNode);
			length++;
		}*/ else{
			ListNode node,anotherNode;
			for(node = headNode;(anotherNode=node.getNextNode()) !=null; node = anotherNode);
				node.setNextNode(newNode);
			length++;
		}
	}
	
	// Insert node at given position
	
	public void insertNodeAtGivenPosition(int data,int position){
		// check position, if less than 0
		if(position < 0)
		{
			position=0;
		}
		// position greater than length of list
		if(position > length){
			position = length;
		}
		
		// headNode null check
		if(null == headNode)
		{
			headNode = new ListNode(data);
		}
		// Adding node at postion 0
		else if(position == 0)
		{
			ListNode newNode = new ListNode(data);
			newNode.setNextNode(headNode);
			headNode = newNode;
		}else{ // Adding node at given position
			ListNode newNode = headNode;
			for(int iIndex = 1;iIndex < position; iIndex++){
				newNode = newNode.getNextNode();
			}
			ListNode newNodeInserted = new ListNode(data);
			if(position == 1){
				newNodeInserted.setNextNode(newNode);
			}else{
			newNodeInserted.setNextNode(newNode.getNextNode());
			newNode.setNextNode(newNodeInserted);
			}
		}
		length = length + 1;
		
		System.out.println("Length of LinkedList" + length);
		//System.out.println("Data of node" + headNode.getData());
		
	}
	
	public void removeNodeFromBegin()
	{
		ListNode node = headNode;
		if(null != node)
		{
			headNode = node.getNextNode();
			node.setNextNode(null);
		}
		length = length -1;
		
		System.out.println("Inside removeNodeFromBegin:: Length of LinkedList" + length);
	}

	public void removeNodeFromEnd(){
		ListNode node = headNode;
		ListNode previousNode = new ListNode(10);
		
		while(null != node.getNextNode()){
			previousNode = node;
			node = node.getNextNode();
		}
		previousNode.setNextNode(null);
		length = length -1;
	}
	
	public void removeMatchingNode(ListNode givenNode)
	{
		if(null == headNode)
		{
			return;
		}
		if(null == headNode.getNextNode() && headNode.equals(givenNode)){
			headNode = headNode.getNextNode();
			length =length -1;
			
		}else return;
		
		// if list has more than one list and first node matched with given node
		if(headNode.equals(givenNode)){
			headNode = headNode.getNextNode();
			length =length -1;
		}
		
		ListNode node = headNode;
		while(null !=node.getNextNode())
		//if(null != headNode.getNextNode())
		{			
			if(node.equals(givenNode)){
				node.setNextNode(givenNode.getNextNode());
				length = length -1;
				//node = givenNode.getNextNode();
			}
			node = node.getNextNode();
		}
		
	}
	
	public void removeNodeAtGivenPosition(int position)
	{
		
	}
}
