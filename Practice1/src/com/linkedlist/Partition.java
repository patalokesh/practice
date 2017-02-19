package com.linkedlist;

public class Partition {
	
	static LinkedListNode partition(LinkedListNode inp, int x)
	{
		LinkedListNode beforeStart = null;
		LinkedListNode beforeEnd = null;
		LinkedListNode afterStart = null;
		LinkedListNode afterEnd = null;
		
		while(inp!=null)
		{
			LinkedListNode next = inp.next;
			inp.next = null;
			if((int)inp.value < x)
			{
				if(beforeStart == null)
				{
					beforeStart = inp;
					beforeEnd = inp;
				}
				else
				{
					beforeEnd.next = inp;
					beforeEnd = inp;
				}
			}
			else
			{
				if(afterStart == null)
				{
					afterStart = inp;
					afterEnd = inp;
				}
				else
				{
					afterEnd.next = inp;
					afterEnd = inp;
				}				
			}
			inp = next;
		}
		
		if(beforeStart == null)
			return afterStart;
		beforeEnd.next = afterStart; 
		return beforeStart;
	}
	
	static LinkedListNode partition2(LinkedListNode inp, int x)
	{
		LinkedListNode head = inp;
		LinkedListNode tail = inp;
		
		while(inp != null)
		{
			LinkedListNode next = inp.next;
			if((int)inp.value < x)
			{		
				System.out.println("head:");
				inp.next = head;
				head = inp;
			}
			else
			{
				tail.next = inp;
				tail = inp;	
			}
			inp = next;
		}
		tail.next = null;
		return head;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LinkedListNode<Integer> lln = new LinkedListNode<Integer>();
		//lln.add(3);
		lln.add(5);
		
		lln.add(3);
		lln.add(10);
		LinkedListNode loop = lln;
		while(loop!= null)
		{
			System.out.print(loop.value+"->");
			loop = loop.next;
		}

		System.out.println();
		LinkedListNode<Integer> output= partition2(lln, 5);
		
		while(output!= null)
		{
			System.out.print(output.value+"->");
			output = output.next;
		}

		
		

	}

}
