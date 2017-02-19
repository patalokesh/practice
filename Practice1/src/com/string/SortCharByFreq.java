package com.string;

import java.util.*;

public class SortCharByFreq {
	
	static String sortedOrder(String inp)
	{
	    HashMap<Character, Integer> hm = new HashMap<Character,Integer>();
	    int max = 1, temp =1;
	    
	    for(int i=0; i<inp.length(); i++)
	    {
	        if(hm.containsKey(inp.charAt(i)))
	        {
	            temp = hm.get(inp.charAt(i))+1;
	            hm.put(inp.charAt(i),temp);
	            max = Math.max(max,temp);
	        }
	        else
	        {
	            hm.put(inp.charAt(i),1);
	        }
	    }
	    
	    List<Character>[] list = new List[max+1];
	    
	    for(Map.Entry<Character, Integer> each: hm.entrySet())
	    {
	    	ArrayList<Character> arrList = null;
	        if(list[each.getValue()]==null)
	        {
	            arrList = new ArrayList<Character>();
	        }
	        else
	        {
	            arrList = (ArrayList<Character>) list[each.getValue()];
	        }
	        arrList.add(each.getKey());
	        list[each.getValue()] = arrList;
	    }
	    
	    String returnStr = "";
	    for(int i=list.length-1; i>=0; i--)
	    {
	    	for(int k=0;list[i]!=null && k < list[i].size(); k++)
	    	{
		        for(int j=0; j<i; j++)
		        {
		                returnStr = returnStr+list[i].get(k);
		        }
	    	}
	    }
	    return returnStr;
	    
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(sortedOrder("abcbbccc"));

	}

}
