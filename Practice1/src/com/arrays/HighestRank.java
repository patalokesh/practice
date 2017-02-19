package com.arrays;

import java.util.ArrayList;
import java.util.List;

public class HighestRank {

	static String highestRank(List<String> list1, List<String> list2)
	{
		int rank = Integer.MAX_VALUE;
		String returnStr= "None";
		int i=0,j=0;
		int i1 = 110894221;
		for(String st1: list1)
		{
			if(i>rank)
				break;
			if(list2.contains(st1))
			{
				j = list2.indexOf(list1.get(i));
				if(rank>i+j)
				{
					returnStr = list1.get(i);
					rank = i+j;
				}
			}
			i++;

		}

		return returnStr;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<String> list1 = new ArrayList<String>();
		List<String> list2 = new ArrayList<String>();

		list1.add("Red");
		list1.add("Yellow");
		list1.add("Black");
		list1.add("Red1");
		list1.add("Red2");

		list2.add("Black");
		list2.add("Red");
		list2.add("Green");
		list2.add("Pink");
		list2.add("Yellow");		



		System.out.println(highestRank(list1,list2));

	}


}
