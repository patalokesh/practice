package com.bitManipulation;

public class SwapBits {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println((1L<<5)|(1L<<1));

	}

	public static long swapBits(long x, int i, int j)
	{
		if(((x>>>i)&1) != ((x>>>j)&1))
		{
		long bitMask = (1L<<i)|(1L<<j);
		x ^=bitMask;
		}	
		return x;
	}
}
