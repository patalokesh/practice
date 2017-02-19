package com.arrays;

import java.util.*;
public class Freq {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[]={1,2,2,2,3,3,3,3};
		//System.out.println(getFreq(a));
		int arr[]={2,3,4,5,0,10,-5};
		ArrayList<Integer> ar=getArray(arr,5);
		int i=0;
		while(i<ar.size()-1) {
			System.out.println(ar.get(i)+","+ar.get(i+1));
			i=i+2;
		}
	}
	public static int getFreq(int[] arr)
	{
		int k=arr.length/4;
		int a=0;
		if(arr.length==0)
			return a;
		if(arr.length==1)
			return arr[0];
		for(int i=0;i<arr.length;i++)
		{
			if(arr[i]==arr[i+k-1])
			{
				a=arr[i];
				break;
			}
		}
		return a;
	}
//arr={2 3 4 5},k=5
	public static ArrayList<Integer> getArray(int[] arr,int k)
	{
		HashSet<Integer> hs=new HashSet<Integer>();
		ArrayList<Integer> al=new ArrayList<Integer>();
		if(k==0 || arr.length<2)
			return al;
		for(int i=0;i<arr.length;i++)
		{
			if(hs.contains(k-arr[i]))
			{
				al.add(arr[i]);
				al.add(k-arr[i]);
				hs.remove(k-arr[i]);
			}
			else
			hs.add(arr[i]);
			
		}
		return al;
	}

}
