package com.arrays;

public class UniqueFirstOccurance {

 static int firstUnique(int[] arrInp)
	{
	 //byte temp1 = 12345678;
	 //System.out.println(temp1);
		int temp = 0;
		for(int i=0; i < arrInp.length; i++)
		{
			for(int j=i; j < arrInp.length; j++)
			{
				if(arrInp[i] > arrInp[j])
				{
					temp = arrInp[i];
					arrInp[i] = arrInp[j];
					arrInp[j] = temp;
				}
			}
		}
		/*for(int i=0; i < arrInp.length; i++)
		{
			System.out.println(arrInp[i]);
		}*/
		for(int i=0; i < arrInp.length-1; i++)
		{	
			if(arrInp[i]==arrInp[i+1])
			{
				temp = arrInp[i];
			}
			else if(arrInp[i]!=arrInp[i+1])
			{
				if(arrInp[i] != temp)
				{
					return arrInp[i];
				}
				if(i == arrInp.length-2)
				{
					return arrInp[i+1];
				}
			}
		}
		return 0;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int inp[] = {3,3,1,2};
		System.out.println(firstUnique(inp));
	}

}
