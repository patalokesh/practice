package com.java.core;

import java.util.*;
class Parent{
	public void print()
	{
		System.out.println("In Parent");
	}
	public void Parent()
	{
		System.out.println("constructor Parent");
	}
}


public class ClassStatic extends Parent{
	public void ClassStatic()
	{
		//super();
		System.out.println("constructor child");
	}
	public void print()
	{
		System.out.println("In Child");
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*Parent p = new Parent();
		p.print();*/
		
		List<Integer> a = new ArrayList<Integer>();
		a.add(1);
		a.add(2);
		a.add(3);
		a.add(4);
		a.add(5);
		
		ListIterator<Integer> i = a.listIterator(a.size()); // Get the list iterator from the last index
		while (i.hasPrevious()) {
		    System.out.println(i.previous());
		}

	}

}
