package com.arrays;
import java.util.*;
public class FriendlyWords {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String inp[] = {"car","cheating","dale","deal","lead","listen","silent","teaching"};
		String output[] = friendlyWords(inp);

		for(String each: output)
		{
			System.out.println(each);
		}

	}
	static String[] friendlyWords(String[] input)
	{
		ArrayList<String> inputList = new ArrayList<String>(Arrays.asList(input));
		Collections.sort(inputList);
		ArrayList<String> returnList = new ArrayList<String>();
		String duplicate = "";
		for(int i=0; i < inputList.size(); i++)
		{
			if(duplicate.contains(inputList.get(i)))
			{
				continue;
			}
			String temp = "";
			for(int j=0; j< inputList.size(); j++)
			{
				if(i!=j)
				{
					if(anagram(inputList.get(i),inputList.get(j)))
					{
						if(temp == "")
							temp = inputList.get(i)+ " " + inputList.get(j);
						else
							temp = temp + " " + inputList.get(j);
						duplicate = duplicate+temp;						
					}
				}
			}
			if(temp!= "" && temp.length()>0)
				returnList.add(temp);
		}
		return returnList.toArray(new String[returnList.size()]);


	}

	static boolean anagram(String str1, String str2)
	{
		if(str1.length()!=str2.length() || str1==null || str2 == null)
		{
			return false;
		}
		char ch1[] = str1.toLowerCase().toCharArray();
		char ch2[] = str2.toLowerCase().toCharArray();
		Arrays.sort(ch1);
		Arrays.sort(ch2);
		return Arrays.equals(ch1,ch2);
	}

}
