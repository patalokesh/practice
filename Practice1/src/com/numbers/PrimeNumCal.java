package com.numbers;

import java.util.Scanner;

public class PrimeNumCal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Enter the for prime numbers limit to print(Starting from 2):");
		Scanner sc=new Scanner(System.in);
		PrimeNumCal pc=new PrimeNumCal();
		if(sc.hasNext())
		{
			int lim=sc.nextInt();
			int count=0;
			if(lim>2)
			{
				System.out.println("Prime numbers are:");
				for (int i = 2; i < lim; i++) {
					if(pc.primeNums(i))
					{
						System.out.print(i+" ");
						count++;
					}
				}	
				System.out.println();
				System.out.println("Total number of prime nums are "+count);
			}
			else
			{
				System.out.println("Please enter the limit greate than 2 ,as prime numbers start from 2");
			}
		}


	}

	public boolean primeNums(int num)
	{
		for (int i = 2; i < num; i++) {
			if(num%i==0)
				return false;
		}
		return true;
	}

}
