package com.numbers;

import java.util.*;

public class Powerof2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		while(sc.hasNext())
		{
			System.out.println(isPower2(sc.nextInt()));
		}


	}
	public static boolean isPower2(int num)
	{
		if(num==0||num==1||num%2!=0)
			return false;
		if(num==2)
			return true;
		return isPower2(num/2);
		/*while(true)
		{
			//System.out.println(num);
			boolean bol=false;
			if(num==0||num==1)
				return bol;
			else if(num%2!=0)
				return bol;
			else if(num==2)
			{
				bol=true;
				return bol;
			}
			num=num/2;
		}*/
		

	}

}
