package com.java.core;

import java.util.HashSet;

public class Hs {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Employee e1=new Employee(10);
		Employee e2=new Employee(20);
		Employee e3=new Employee(30);
		Employee e4=new Employee(40);
		Employee e5=new Employee(50);
		HashSet<Employee> hs=new HashSet<Employee>();
		hs.add(e1);
		hs.add(e2);
		hs.add(e3);
		hs.add(e4);
		hs.add(e5);
		System.out.println(hs.size());
		System.out.println(hs.contains(new Employee(40)));
		System.out.println(hs.remove(new Employee(40)));
		System.out.println(hs.size());
	}

}

class Employee extends HashSet
{
	public int age;
	public Employee(int age)
	{
		this.age=age;
	}
	public boolean equals(Object o)
	{
		Employee emp=(Employee)o;
		if(emp.age==age)
			return true;
		return false;
	}
}
