package com.arrays;

import java.util.Stack;
import java.util.Queue;

public class Notation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str[]={"4", "13", "+"};
		System.out.println(operation(str[0],str[1],str[2]));
		System.out.println(polish(str));

	}
	public static String polish(String a[])
	{
		Stack s=new Stack();
		for(int i=0;i<a.length;i++)
		{
			if(a[i].equals("+")||a[i].equals("-")||a[i].equals("*")||a[i].equals("/"))
				s.push(operation(s.pop(),s.pop(),a[i]));
			else
				s.push(a[i]);
		}
		return (String) s.pop();
	}



	public static String operation(Object object,Object object2,String opr)
	{
		int i=convert((String)object);
		int j=convert((String)object2);
		if(opr.equals("+"))
			return String.valueOf(i+j);
		else if(opr.equals("-"))
			return String.valueOf(i-j);
		else if(opr.equals("*"))
			return String.valueOf(i*j);
		else if(opr.equals("/"))
			return String.valueOf(i/j);
		else
			return null;
	}

	public static int convert(String str)
	{
		if(str.equals("0"))
			return 0;
		else if(str.equals("1"))
			return 1;
		else if(str.equals("2"))
			return 2;
		else if(str.equals("3"))
			return 3;
		else if(str.equals("4"))
			return 4;
		else if(str.equals("5"))
			return 5;
		else if(str.equals("6"))
			return 6;
		else if(str.equals("7"))
			return 7;
		else if(str.equals("8"))
			return 8;
		else if(str.equals("9"))
			return 9;
		else
			return 0;
	}
}
