package com.java.core;

abstract class Food
{
	abstract public void serveFood();
}
class FastFood extends Food
{
	public void serveFood()
	{
		System.out.println("I'm serving FastFood");
	}
}
class Fruits extends Food
{
	public void serveFood()
	{
		System.out.println("I'm serving Fruits");
	}
}
class foodFactory
{
	public Food getFood(String order)
	{
		if(order.equals("FastFood"))
			return new FastFood();
		else if(order.equals("Fruits"))
			return new Fruits();
		else
			return new Fruits();
		
	}
}

public class Factory {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		foodFactory fd=new foodFactory();
		Food foo=fd.getFood("Fruits");
		System.out.println(foo.getClass().getName());
		System.out.println(foo.getClass().getSuperclass().getName());
		foo.serveFood();
		

	}

}
