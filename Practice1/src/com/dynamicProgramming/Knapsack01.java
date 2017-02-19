package com.dynamicProgramming;
import java.util.*;

class Result
{
	int maxValue;
	HashSet<Integer> items;
}
public class Knapsack01 {
	static Result maxValueofWeights(int wt[], int val[],int maxValue)
	{
		HashSet<Integer> hsItems = new HashSet<Integer>();
		int values[][] = new int[wt.length][maxValue+1];
		int max=0,maxI=0,maxJ=0;
		
		for(int i=0; i<wt.length; i++)
		{
			for(int j=0; j<= maxValue; j++)
			{
				if(j==0)
					values[i][j] = 0;
				else
				{
					if(j<wt[i])
					{
						values[i][j]= i==0?values[i][j-1]:values[i-1][j];
					}
					else
					{
						values[i][j]= i==0?val[i]:Math.max(val[i]+values[i-1][j-wt[i]],values[i-1][j]);
						if(max<=values[i][j])
						{
							maxI =i;
							maxJ=j;
							max = values[i][j];
						}
										
					}
				}
			}
		}
		while(maxJ>0 && maxI >0 && values[maxI][maxJ]!=0 )
		{
			while(values[maxI][maxJ]==values[maxI-1][maxJ])
			{
				maxI = maxI-1;
			}
			hsItems.add(maxI);
			maxJ = maxJ-wt[maxI];
			maxI = maxI-1;
		}
		Result res = new Result();
		res.maxValue = max;
		res.items = hsItems;
		//return max;
		return res;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int wt[] = {1,3,4,5};
		int val[] = {1,4,5,7};
		Result res = maxValueofWeights(wt,val,7);
		System.out.println("Max value: "+res.maxValue);
		HashSet<Integer> hsValues = res.items;
		Iterator itr = hsValues.iterator();
		while(itr.hasNext())
		{
			int i=(int)itr.next();
			System.out.println("Weight: "+wt[i]+ " Value: "+val[i]);
		}

	}

}
