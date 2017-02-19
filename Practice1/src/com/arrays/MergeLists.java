package com.arrays;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class MergeLists {
	static int gStart=0;
	public static List mergeEach(List ls, Integer val, int start)
	{
		
		int mid=0;
		int end=(ls.size()-1);
		
			if(val.intValue() <=(int)ls.get(start))
			{
				ls.add(start, val);
				gStart=start;
				//System.out.println("here"+1);
				return ls;
			}
			else if(val.intValue()>= (int)ls.get(end))
			{
				ls.add(end+1, val);
				gStart=end+1;
				//System.out.println("here"+2);
				return ls;
			}	
			int prv=0;
			while(true)
			{	
			mid=(int) Math.floor((end-start)/2)+start;
			if(prv==mid)
			{
			mid=mid+1;	
			}
			prv=mid;
			if((int)ls.get(mid)==val.intValue())
			{
				ls.add(mid, val);
				gStart=mid;
				//System.out.println("here"+3);
				return ls;
			}
			else if(start+1==end)
			{
				ls.add(start+1, val);
				gStart=start+1;
				//System.out.println("here"+4);
				return ls;
			}
			else if(val.intValue()>(int)ls.get(mid))
			{
				start=mid;
				//System.out.println("start changed"+start);
			}
			else
			{
				end=mid;
				//System.out.println("end changed");
			}
				
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Integer> lsA=new ArrayList<Integer>();
		lsA.add(1);
		lsA.add(2);
		lsA.add(6);
		lsA.add(7);
		List<Integer> lsB=new ArrayList<Integer>();
		lsB.add(1);
		lsB.add(2);
		lsB.add(6);
		lsB.add(7);
		List<Integer> sendList,itrList;
		if(lsA.size()==lsB.size())
		{
			sendList=lsA;
			itrList=lsB;
		}
		else
		{
			sendList=lsA.size()>lsB.size()?lsA:lsB;
			itrList=lsA.size()<lsB.size()?lsA:lsB;	
		}
		
		for (int i = 0; i < itrList.size(); i++) {
			//System.out.println("befor"+gStart);
			sendList=mergeEach(sendList, itrList.get(i), gStart);
			//System.out.println("after"+gStart);
		}
		//Iterator<Integer> itr=lsA.iterator();
		for (int i = 0; i < sendList.size(); i++) {
			System.out.println(sendList.get(i));
		}

	}

}
