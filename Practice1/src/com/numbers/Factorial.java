package com.numbers;

import java.util.Scanner;

public class Factorial {
	
	public static int factorial(int num)
	{
		int fact=1;
		
		while(num>1)
		{			
			fact=fact*num;
			num=num-1;
		}		
		return fact;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		if(sc.hasNext())
		{
			int dig=sc.nextInt();
			if(dig<0)
			{
				System.out.println("Factorial not defined for negative numbers");
			}
			else
			{
			System.out.println(factorial(dig));
			}
		}

	}

}
