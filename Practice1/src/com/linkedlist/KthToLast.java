package com.linkedlist;

import java.util.*;
class LinkedListNode<E>{
	E value;
	LinkedListNode<E> next;
	 public void add(E value)
	 {
		 if(this.value==null)
		 {
			 this.value = value;
		 }
		 else
		 {
			 LinkedListNode<E> runner = this;
			 while(runner.next!=null)
			 {
				 runner = runner.next;
			 }
			 LinkedListNode<E> newNode = new LinkedListNode<E>();
			 newNode.value = value;
			 runner.next = newNode;
		 }
	 }
}

public class KthToLast {
	
	static int printKthToLast(LinkedListNode inp, int k)
	{
		if(inp == null)
			return 0;
		int index = printKthToLast(inp.next, k)+1;
		
		if(index == k)
		{
			System.out.println("Kth index value is:"+inp.value);
		}
		System.out.println("each: "+index);
		return index;
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LinkedListNode lln = new LinkedListNode();
		lln.add(1);
		lln.add(2);
		lln.add(3);
		lln.add(4);
		lln.add(5);
		
		System.out.println(printKthToLast(lln, 2));
		
		

	}

}
