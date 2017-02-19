package com.graph;

public class FindSuccessor {
	static BinaryNode findSuccessor(BinaryNode n1)
	{
		if(n1 == null)
			return null;
		if(n1.right == null)
			return ReverseTraverse(n1);
		else
		{
			n1= n1.right;
			while(n1.left != null)
				n1=n1.left;
			return n1;
		}
	}
	static BinaryNode ReverseTraverse(BinaryNode n1)
	{
		int temp = n1.data;
		BinaryNode parent= n1.parent;
		while(parent!= null && parent.left!=null && parent.left!=n1)
		{
			n1 = parent;
			parent = n1.parent;
		}
		if(temp > parent.data)
			return null;
		return parent;
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BinaryNode tree = new BinaryNode(20);
		 tree.right = new BinaryNode(30);
		 tree.right.parent = tree;
		 tree.right.right = new BinaryNode(35);
		 tree.right.right.parent = tree.right;
		 
		 BinaryNode successor = findSuccessor(tree.right.right);
		 System.out.println(successor.data);
	}

}
