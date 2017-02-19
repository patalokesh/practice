package com.linkedlist;

public class Reverse {

	static LinkedListNode reverseLinkedList(LinkedListNode inp)
	{
		LinkedListNode next = null, pre = null;
		LinkedListNode temp = inp;
		while(inp!=null)
		{
			next = inp.next;
			temp.next = pre;
			pre = temp;
			temp = next;
			inp = next;
		}
		return pre;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LinkedListNode<Integer> lln = new LinkedListNode<Integer>();
		//lln.add(3);
		lln.add(5);
		
		lln.add(3);
		lln.add(10);
		LinkedListNode loop = reverseLinkedList(lln);
		while(loop!= null)
		{
			System.out.print(loop.value+"->");
			loop = loop.next;
		}


	}

}
