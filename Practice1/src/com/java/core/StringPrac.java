package com.java.core;

public class StringPrac {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String str1 = "Lokesh";
		/*System.out.println(removeChar(str1,'o'));
		System.out.println(removeChar(str1,'L'));
		System.out.println(removeChar(str1,'h'));
		System.out.println(removeChar(str1,'a'));
		System.out.println(removeChar(str1,'0'));*/
		
		System.out.println(str1.substring(0,1));
	}
	static String removeChar(String input,char ch)
	{ 
		int index = -1;
		for(int i=0; i< input.length(); i++)
		{
			if(input.charAt(i)==ch)
			{
				index = i;
				break;
			}
		}
		if(index == -1)
			return "";
		return input.substring(0,index)+input.substring(index+1);
	}

}
