package com.arrays;

class ArrayRotate1
{
	public static void main(String args[])
	{
		int a[]={1,2,3,4,5,6,7};
		int b[]=rotate(a,3);
		for(int i=0;i<b.length;i++)
			System.out.println(b[i]);

	}

	public static int[] rotate(int a[], int k)
	{

		int b[]=new int[a.length];
		int j=0;
		for(int i=k+1;i<a.length;i++)
		{
			b[j++]=a[i];
		}
		for(int i=0;i<a.length-k;i++)
		{
			b[j++]=a[i];
		}
		return b;
	}

}
