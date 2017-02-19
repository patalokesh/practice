package com.arrays;

import java.util.Arrays;

public class SortingWithAtmostOneSwap {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int A[]= {1,3,5,3,6};
		
		System.out.println(new SortingWithAtmostOneSwap().solution(A));

	}
	
	public boolean solution(int[] A)
	{
		int count = 0;
        int[]B = Arrays.copyOf(A, A.length); 
        Arrays.sort(B);     
        for(int i=0; i<A.length; i++)
        {
            if(A[i] != B[i]) count++;
        }

        if(count > 2) 
        	return false;
        return true;
	}

}
