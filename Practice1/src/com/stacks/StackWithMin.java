package com.stacks;

import java.util.Stack;

class StackModified
{
	private int value;
	private StackModified top;
	private StackModified next;
	private Stack<Integer> s2;
		
	void push(int value)
	{
		StackModified s1 = new StackModified();
		s1.value = value;
		if(top == null)
		{
			top = s1;
			s2 = new Stack<Integer>();
			s2.push(value);
		}
		else
		{
			if(min() > value)
			{
				s2.push(value);
			}
			s1.next = top;
			top = s1;
		}
	}
	int min()
	{
		if(s2 == null || s2.isEmpty())
		{
			return Integer.MAX_VALUE;
		}
		else
			return s2.peek();
	}
	
	int pop()
	{
		if(top==null)
			return 0;
		if(this.top.value == min())
		{
			s2.pop();
		}
		int temp = top.value;
		top = top.next;
		return temp;
	}
}

public class StackWithMin {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		StackModified sm = new StackModified();
		
		sm.push(5);
		sm.push(6);
		sm.push(3);
		sm.push(7);
		sm.pop();
		sm.pop();
		sm.pop();
		sm.pop();
		sm.pop();
		System.out.println(sm.min());
		Stack sc = new Stack();
	}

}
