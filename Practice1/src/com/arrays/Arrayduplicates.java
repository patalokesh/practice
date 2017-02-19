package com.arrays;

import java.util.*;

public class Arrayduplicates {

	public static List arrayDuplicates(List inp)
	{
		HashSet hsInp = new HashSet();
		HashSet hsDuplicates = new HashSet();
		List duplicates = new ArrayList();
		for(Object each: inp)
		{
			if(hsInp.contains(each))
			{
				hsDuplicates.add(each);
			}
			else
			{
				hsInp.add(each);
			}
		}
		duplicates.addAll(hsDuplicates);
		return duplicates;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ArrayList al= new ArrayList();
		al.add(1);
		al.add(1);
		al.add(2);
		
		al.add(3);
		
		List ret= arrayDuplicates(al);
		
		for(Object i: ret)
		{
			System.out.println(i);
		}

	}

}
