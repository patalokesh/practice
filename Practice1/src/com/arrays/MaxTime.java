package com.arrays;

import java.util.ArrayList;

public class MaxTime {
	
	public static String maxTime(ArrayList<Integer> inp)
	{
		Integer a=-1,b=-1,c=-1,d=-1;
		Integer i=2,j=3;
		
		while(i>=0)
		{
			if(inp.contains(i))
			{
				a=i;
				inp.remove(i);
				break;
			}
			i--;
		}
		if(a==-1)
			return "not possible";
		if(a==2)
		{
			while(j>=0)
			{
				if(inp.contains(j))
				{
					b=j;
					inp.remove(b);
					break;
				}
				j--;
			}
			if(b==-1)
				return "not possible";
		}
		else
		{
			int temp=Integer.max(inp.get(0),inp.get(1));
			b= Integer.max(temp, inp.get(2));
			inp.remove(b);	
		}
		int temp1=inp.get(0);
		int temp2=inp.get(1);
		if(temp1<6 && temp2<6)
		{
			c=Integer.max(temp1, temp2);
			d=Integer.min(temp1, temp2);
		}
		else if(temp1<6)
		{
			c=temp1;
			d=temp2;
		}
		else if(temp2<6)
		{
			c=temp2;
			d=temp1;
		}
		else
			return "not possible";
		StringBuilder sb=new StringBuilder();
		sb.append(a);
		sb.append(b);
		sb.append(':');
		sb.append(c);
		sb.append(d);
		System.out.println(a+""+b+""+c+""+d);
		return sb.toString();
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Integer> arr=new ArrayList<Integer>();
		arr.add(9);
		arr.add(9);
		arr.add(3);
		arr.add(4);
		System.out.println(maxTime(arr));
	}

}
