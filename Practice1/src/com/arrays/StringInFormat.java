package com.arrays;

import java.util.ArrayList;
import java.util.List;

public class StringInFormat {


	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Object> ls=new ArrayList<Object>();
		ls.add("a string");
		List<Object> ls1=new ArrayList<Object>();
		ls1.add("a");
		ls1.add("b");
		ls1.add("c");
		ls1.add("a");
		ls1.remove("a");
		ls.add(ls1);
		ls.add("spam");
		List<Object> ls2=new ArrayList<Object>();
		ls2.add("eggs");
		ls.add(ls2);		
		dumpList("Foo", ls);
	}
	public static void dumpList(String name,List ls)
	{
		if(ls.size()==0)
		return;
		for(int i=0;i<ls.size();i++)
		{
			//System.out.println(ls.get(i).getClass());
			if(ls.get(i).getClass()==ArrayList.class)
				dumpList(name+"."+i,(List)ls.get(i));
			else
				System.out.println(name+"."+i+":"+ls.get(i));
		}
		/*for(Object str:ls)
		{
			System.out.println(str);
		}*/
		
	}



}
