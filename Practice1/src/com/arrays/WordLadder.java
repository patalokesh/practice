package com.arrays;

import java.util.LinkedList;
import java.util.Set;
import java.util.ArrayList;

class WordNode
{
	String word;
	int count;
	public WordNode(String word, int count)
	{
		this.word=word;
		this.count=count;
	}
}

public class WordLadder {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<String> arr=new ArrayList<String>();
		arr.add("hot");
		arr.add("dot");
		arr.add("dog");
		arr.add("lot");
		arr.add("log");
		
		System.out.println(getWordLength("hit", "cog", arr));

	}
	public static int getWordLength(String start,String end,ArrayList<String> dict)
	{
		dict.add(end);
		LinkedList<WordNode> queue=new LinkedList<WordNode>();
		queue.add(new WordNode(start,1));
		while(!queue.isEmpty())
		{
			WordNode currWordNode=queue.remove();
			if(currWordNode.word==end)
			{
				return currWordNode.count;
			}
			char[] StringArr =currWordNode.word.toCharArray();
			for(int i=0;i<StringArr.length;i++)
			{
				for(char c='a';c<'z';c++)
				{
					char temp=StringArr[i];
					if(StringArr[i]!=c)
					{
						StringArr[i]=c;
					}
					String str=new String(StringArr);
					if(dict.contains(str))
					{	
						queue.add(new WordNode(str,currWordNode.count+1));
						dict.remove(currWordNode);
					}
					StringArr[i]=temp;
				}
			}

		}
		return 0;
	}

}
