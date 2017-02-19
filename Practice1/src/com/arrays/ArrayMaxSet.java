package com.arrays;

public class ArrayMaxSet {

	public static void main(String[] args) {
		ArrayMaxSet test = new ArrayMaxSet();
		System.out.println(test.solution1(new int[]{5,4,0,3,1,6,2}));
	}
	
	public int solution1(int[] A) {
		int max=0;
		for (int i = 0; i < A.length; ++i) {
			if(A[i] != -1)
			{
				int tmp = i,count = 0,temp =0;
				while (A[temp] != -1) {
					temp = A[tmp];
					A[tmp] = -1;
					++count;
					tmp = temp;
				}	
				max = Math.max(max, count);
			}	
		}
		return max;
	}

}
