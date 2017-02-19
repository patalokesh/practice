package com.stacks;
import java.util.Stack;
public class Sorting {
	static Stack sort(Stack inp)
	{
		Stack temp = new Stack();
		Stack sorted = new Stack();
		int eleInp,eleTemp,eleSorted;
		while(!inp.isEmpty() || !temp.isEmpty())
		{
			sorted.push(inp.pop());
			while(!inp.isEmpty())
			{
					//System.out.println("in inp loop");
					eleInp = (int)inp.peek();
					eleSorted = (int)sorted.peek();
					//System.out.println("Inp"+eleInp+",EleSorted:"+eleSorted);
					if(eleSorted<eleInp)
					{
						sorted.pop();
						sorted.push(eleInp);
						temp.push(eleSorted);
						inp.pop();
						break;
					}else if(eleSorted>eleInp)
					{
						temp.push(eleInp);
						inp.pop();
					}	
			}
			sorted.push(temp.pop());
			while(!temp.isEmpty())
			{
					//System.out.println("in temp loop");
					eleTemp = (int)temp.peek();
					eleSorted = (int)sorted.peek();
					//System.out.println("Inp"+ele+",EleSorted:"+eleSorted);
					if(eleSorted<eleTemp)
					{
						sorted.pop();
						sorted.push(eleTemp);
						inp.push(eleSorted);
						temp.pop();
						break;
					}else if(eleSorted>eleTemp)
					{
						inp.push(eleTemp);
						temp.pop();
					}
				
			}
		}	
		return sorted;
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Stack inp = new Stack();
		inp.push(2);
		inp.push(1);
		inp.push(3);
		inp.push(4);
		Stack inp2 = sort(inp);
		Stack temp = new Stack();
		//System.out.println(temp.isEmpty());
		while(!inp2.isEmpty())
			System.out.println(inp2.pop());
	}

}
