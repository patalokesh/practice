package com.java.core;

import java.util.Scanner;

class MyClass implements Cloneable {

    public Object clone() {
        Object o = null;
        try {
    	    o = super.clone();
        } catch (CloneNotSupportedException ex) {
        }
        return o;
    }

}
class Human implements Cloneable
{
	public String name;
	public Human()
	{
		
	}
	public Human(String s)
	{
		name=s;
	}
	public Object clone()
	{
		Object o = null;
        try {
    	    o = super.clone();
        } catch (CloneNotSupportedException ex) {
        }
        return o;
	}
}
public class Clone {

	public static void main(String[] args) {
		Scanner in=new Scanner(System.in);
		Human h1=new Human(in.next());
		Human h2=(Human)h1.clone();
		System.out.println(h1.name);
		System.out.println(h2.name);
		
		
	}

}
