package com.graph;
import java.util.LinkedList;
import java.util.Iterator;
class Node
{
	String value;
	LinkedList<Node> childs = new LinkedList<Node>();
	boolean visited;
	public Node(String value)
	{
		this.value = value;
		this.visited = false;
	}
}
public class DFS {

	static void dfs(Node n)
	{
		LinkedList<Node> adj = n.childs;
		n.visited = true;
		Iterator<Node> itr = adj.listIterator();

		while(itr.hasNext())
		{
			Node curr = itr.next();
			if(!curr.visited)
			{
				dfs(curr);
			}
		}
		System.out.println(n.value);
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

		dfs(na);


	}

}
