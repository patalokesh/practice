package com.linkedlist;

public class Palindrome {

	static boolean isPalindrome_Reverse(LinkedListNode node)
	{
		LinkedListNode slow = node, fast = node, next = null, prev =null;
		
		while(fast !=null && fast.next !=null)
		{
			next = slow.next;
			fast = fast.next.next;
			slow.next = prev;
			prev = slow;
			slow = next;		
		}
		
		if(fast != null)
		{
			LinkedListNode temp = slow.next;
			slow.next = null;
			slow = temp;
		}
		
		while(slow != null)
		{
			if(slow.value != prev.value)
				return false;
			slow = slow.next;
			prev = prev.next;
		}
		return true;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// TODO Auto-generated method stub
				LinkedListNode<Integer> lln = new LinkedListNode<Integer>();
				lln.add(0);
				lln.add(1);
				lln.add(1);
				lln.add(0);
				System.out.println(isPalindrome_Reverse(lln));

	}

}
