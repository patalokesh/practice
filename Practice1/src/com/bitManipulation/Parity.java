package com.bitManipulation;

public class Parity {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(parity(138));

	}

	public static short parity(long x)
	{
		short result = 0;

		System.out.println("x="+Long.toBinaryString(x));
		while(x!=0)
		{
			//result^=1;
			x&=(x-1);//11
			result = (short) (result + 1);
			//x >>>= 1;//8
			
			System.out.println("x="+Long.toBinaryString(x));
			//System.out.println("result="+result);
			
		}	
		return result;
	}
}
