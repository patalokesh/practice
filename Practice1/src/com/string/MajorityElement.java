package com.string;

import java.util.*;

class ValueComparator1 implements Comparator<Character>
{
	Map<Character,Integer> base;
    
    public ValueComparator1(Map<Character,Integer> base)
    {
        this.base = base;
    }
    
    public int compare(Character e1,Character e2)
    {
        return base.get(e2)- base.get(e1);
    }
}
public class MajorityElement {
	
	static String orderedString(String inp)
    {
        
        HashMap<Character,Integer> hm = new HashMap<Character,Integer>();
       
        Map<Character,Integer> sortedChar = new TreeMap<Character,Integer>(new ValueComparator1(hm));
        for(int i=0; i < inp.length(); i++)
        {
            if(hm.containsKey(inp.charAt(i)))
            {
                hm.put(inp.charAt(i), hm.get(inp.charAt(i))+1);
            }
            else
            {
                hm.put(inp.charAt(i), 1);
            }
        }
        
        for(Map.Entry<Character, Integer> pair: hm.entrySet())
        {
            sortedChar.put(pair.getKey(), pair.getValue());
        }
        
        String returnValue = "";
        
        for(Map.Entry<Character, Integer> pair: sortedChar.entrySet())
        {
            for(Integer i=0; i < pair.getValue(); i++)
            {
        	returnValue = returnValue+ pair.getKey();
            }
        }
        
        
        return returnValue;
        
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(orderedString("abaccc"));

	}

}
