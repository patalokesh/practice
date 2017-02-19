package com.graph;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;
import java.util.Stack;
import java.io.*;


public class BFS {
	static void bfs(Node n)
	{
		Queue<Node> queue = new LinkedList<Node>();
	    n.visited = true;
	    queue.add(n);  
	    while(!queue.isEmpty())
	    {
	        Node each = queue.remove();
	        System.out.println(each.value);
	        List<Node> childs = each.childs;
	        Iterator<Node> itr = childs.listIterator();      
	        while(itr.hasNext())
	        {
	            Node child = itr.next();
	            if(!child.visited)
	            {
	               child.visited = true;
	               queue.add(child);	                
	            }
	        }
	    }

	}
	
	static void bfsUsingStack(Node n)
	{
		Stack<Node> sc = new Stack<Node>();
		sc.push(n);
		//n.visite  
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*a->b,c,d
		c->d,a,e
		e->f,i*/
		Node ni = new Node("i");
		Node nf = new Node("f");
		Node ne = new Node("e");
		Node na = new Node("a");
		Node nb = new Node("b");
		Node nc = new Node("c");
		Node nd = new Node("d");
		nc.childs.add(nd);
		nc.childs.add(na);
		nc.childs.add(ne);
		na.childs.add(nb);
		na.childs.add(nc);
		na.childs.add(nd);
		ne.childs.add(nf);
		ne.childs.add(ni);

		bfs(na);

	}

}
