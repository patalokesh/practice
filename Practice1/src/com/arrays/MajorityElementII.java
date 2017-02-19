package com.arrays;
import java.util.*;

public class MajorityElementII {
	public static List<Integer> majorityElement(int[] nums) {
        int count1 = 0,count2 = 0, element1 = 0, element2 =0;
        
        for(int i=0;i < nums.length;i++)
        {
            if(element1 == nums[i])
            {
                count1++;
            }
            else if(element2 == nums[i])
            {
                count2++;
            }
            else if(count1 == 0)
            {
                element1 = nums[i];
                count1 = 1;
            }
            else if(count2 == 0)
            {
                element2 = nums[i];
                count2 = 1;
            }
            else
            {
                count1--;
                count2--;
            }
        }
        
        count1=0;
        count2=0;
        for(int i=0;i < nums.length;i++)
        {
            if(element1 == nums[i])
            {
                count1++;
            }
            else if(element2 == nums[i])
            {
                count2++;
            }
        }
        
        ArrayList<Integer> arr = new ArrayList<Integer>();
        if(count1>Math.ceil(nums.length/3))
        {
            arr.add(element1);
        }
        if(count2>Math.ceil(nums.length/3))
        {
            arr.add(element2);
        }
       return arr; 
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int nums[]={2,2,1,3};
		List<Integer> arr= majorityElement(nums);
		Iterator itr = arr.iterator();
		while(itr.hasNext())
			System.out.println(itr.next());

	}

}
