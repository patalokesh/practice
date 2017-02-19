package com.string;

import java.util.Queue;
import java.util.Stack;

public class IntToString {

	public static void main(String[] args) {
		System.out.println(convert(2));
	}
	public static String convert(int i)
	{
		StringBuffer sb=new StringBuffer();
		Queue q;
		sb.append(i);
		try
		{
			Exception ex=new Exception("Exception");
			throw ex;
		}
		catch(Exception ex)
		{
			return ex.getMessage();
		}finally
		{
			System.out.println("Finally");
		}
	}
	
	static String[] Braces(String[] values) {
        String str;
        String strReturn[] = null;
		for (int j = 0; j < values.length; j++) {
			str=values[j];
			if (str.charAt(0) == '{')
			{
		        strReturn[j]="NO";
		        continue;
			}

		    Stack<Character> stack = new Stack<Character>();

		    char c;
		    for(int i=0; i < str.length(); i++) {
		        c = str.charAt(i);

		        if(c == '(')
		            stack.push(c);
		        else if(c == '{')
		            stack.push(c);
		        else if(c == ')')
		            if(stack.empty())
		            {
				        strReturn[j]="NO";
				        continue;
					}
		            else if(stack.peek() == '(')
		                stack.pop();
		            else
		            {
				        strReturn[j]="NO";
				        continue;
					}
		        else if(c == '}')
		            if(stack.empty())
		            {
				        strReturn[j]="NO";
				        continue;
					}
		            else if(stack.peek() == '{')
		                stack.pop();
		            else
		            {
				        strReturn[j]="NO";
				        continue;
					}
		    }
		    if(stack.empty())
		    {
		        strReturn[j]="YES";
			}
		    else
		    	strReturn[j]="NO";
		}
		return strReturn;
		}
		


    

}
