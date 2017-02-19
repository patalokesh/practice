package com.arrays;

public class ArithmeticSlices {
	public static int numberOfArithmeticSlices(int[] A)
	{
		int count =0;
		for(int i=3; i<=A.length; i++)
		{
			for(int j=0; j<A.length; j++)
				if( (j+i-1) <= (A.length-1) && isArithmetic(A,j,j+i-1))
						count++;
		}
		return count;
	}

	public static boolean isArithmetic(int[] A,int start, int end)
	{
		int commonFactor = A[start+1]-A[start];

		while(start<end)
			{
				if((A[start+1]-A[start++])!=commonFactor)
					return false;
			}
		return true;
	}
	public static int numberOfArithmeticSlices2(int[] A) {
	    int curr = 0, sum = 0;
	    for (int i=2; i<A.length; i++)
	        if (A[i]-A[i-1] == A[i-1]-A[i-2]) {
	            curr += 1;
	            sum += curr;
	        } else {
	            curr = 0;
	        }
	    return sum;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] inp = {1,2,3,4};
		System.out.println(numberOfArithmeticSlices(inp));
		System.out.println(numberOfArithmeticSlices2(inp));
		System.out.println("when re".split("\t", -1)[0]);
	}

}
