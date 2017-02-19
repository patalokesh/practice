package com.arrays;
import java.util.*;
public class CombinationSumIII {

	public List<List<Integer>> combinationSum3(int k, int n) {      
        List<List<Integer>> ret = new ArrayList<List<Integer>>();
        helper(ret,new ArrayList<Integer>(),1,k,n);
        return ret;
    }
    
    public void helper(List<List<Integer>> ret, List<Integer> comp, int start, int k, int n)
    {
        if(k==0 && n==0)
        {
            ret.add(new ArrayList<Integer>(comp));
        }
        else
        {
            for(int i=start; i<10 && k>0 && n>0 ; i++)
            {
                comp.add(i);
                helper(ret,comp,i+1,k-1,n-i);
                comp.remove(comp.size()-1);
            }
        }
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
	

	}

}
