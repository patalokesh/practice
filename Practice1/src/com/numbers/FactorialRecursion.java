package com.numbers;

import java.util.*;

public class FactorialRecursion {

	public static int fact(int n)
	{
		int fact=1;
		if(n>1)
		{
			fact=n*fact(n-1);
		}
		return fact;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		if(sc.hasNext())
		{
			int num=sc.nextInt();
			if(num<0)
				System.out.println("Factorial is not defined for negative num");
			else
				System.out.println(fact(num));
		}
		

	}

}
