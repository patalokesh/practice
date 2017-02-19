package com.graph;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class InorderTraversal {
	static List<Integer> inOrderTraversal(BinaryNode root)
	{
		if(root==null)
			return null;
		Stack<BinaryNode> stack = new Stack<BinaryNode>();
		List<Integer> list = new ArrayList<Integer>();
		while(root!=null || !stack.isEmpty())
		{
			while(root!=null)
			{
				stack.push(root);
				System.out.println("**"+root.data);
				root = root.left;
			}
			root = stack.pop();
			list.add(root.data);
			System.out.println("in list:"+root.data);
			root = root.right;
		}
		return list;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BinaryNode root = new BinaryNode(2);
		root.left = new BinaryNode(1);
		root.right = new BinaryNode(3);
		
		List<Integer> ret = inOrderTraversal(root);
		for(Integer i:ret)
		{
			System.out.println(i);
		}

	}

}
