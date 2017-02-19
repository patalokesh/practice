package com.string;

public class CharRemoval {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("result:"+charRemoval("hhhhokhhhh",'h'));
	}

	public static String charRemoval(String str,char c)
	{
		str=str.toLowerCase();
		int len=str.length();
		boolean flag=true;
		while(flag)
		{
			innerloop:
			for (int i = 0; i < len; i++) {
				if(c==str.charAt(i))
				{
					if(i==0)
						str=str.substring(1,len);
					else if(i==len-1)
						str=str.substring(0,len-1);
					else
					{
					if(i>0)
						str=str.substring(0, i-1);
					if(i<len-1)
						str=str+str.substring(i+1,len);					
					}
					System.out.println(str);
					if(i!=len-1)
					{
					len--;	
					break innerloop;
					}
					
				}
				if(i==len-1)
				{
					flag=false;
					break innerloop;
				}


			}
		}
		return str;
	}

}
