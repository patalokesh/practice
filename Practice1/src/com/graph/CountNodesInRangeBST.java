package com.graph;
import java.util.*;
class Wrapper
{
	BinaryNode curr;
	Stack<BinaryNode> stackOfNodes;
	int count;
}
public class CountNodesInRangeBST {

	public static int countRange(BinaryNode root, int max, int min)
	{
		if(root==null)
			return 0;
		Stack<BinaryNode> stackOfNodes = new Stack<>();
		BinaryNode curr = root;
		Wrapper rap = helper(curr,max,min,stackOfNodes,0);
		curr = rap.curr;
		stackOfNodes = rap.stackOfNodes;
		int count = rap.count;
		while(curr == null && !stackOfNodes.isEmpty())
		{
			curr = stackOfNodes.pop();
			curr = curr.right;
			rap = helper(curr,max,min,stackOfNodes,count);
			stackOfNodes = rap.stackOfNodes;
			curr = rap.curr;
			count = rap.count;
		}	
		return rap.count;
	}
	 public static Wrapper helper(BinaryNode root, int max, int min, Stack<BinaryNode> stackOfNodes, int count)
	 {
		 Wrapper ret = new Wrapper();
		 BinaryNode curr = root;
			while(curr!=null)
			{
				if(curr.data <= max && curr.data >= min)
				{
					stackOfNodes.push(curr);
					count++;
					curr = curr.left;
				}
				else if(curr.data < min)
				{
					stackOfNodes.push(curr);
					break;
				}
				else if(curr.data > max)
				{
					curr = curr.left;
				}
			}
			ret.count = count;
			ret.curr = curr;
			ret.stackOfNodes = stackOfNodes;
		return ret;
	 }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BinaryNode root = new BinaryNode(5);
		root.left = new BinaryNode(2);
		root.right = new BinaryNode(10);
		root.left.left = new BinaryNode(1);
		root.left.right = new BinaryNode(3);
		root.right.left = new BinaryNode(10);
		
		System.out.println(countRange(root,10,1));

	}

}
