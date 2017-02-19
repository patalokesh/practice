package com.numbers;

public class SingleNumberII {

	 public int singleNumber(int[] nums) {
	        int ones = 0, twos = 0, threes = 0;
	        for(int i=0; i < nums.length; i++)
	        {	          
	          twos = twos | (ones & nums[i]);
	          ones = ones ^ nums[i];
	          threes = ~(ones & twos);
	          ones &= threes;
	          twos &= threes;
	        }
	        return ones;
	    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
