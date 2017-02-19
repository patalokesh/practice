package com.graph;

public class ValidateBST {
	
	static boolean validateBinaryTree(BinaryNode root)
	{
		if(root == null)
			return true;
		if((root.left == null || root.left.data <= root.data) && (root.right == null || root.right.data > root.data))
			return validateBinaryTree(root.left) && validateBinaryTree(root.right);
		else
			return false;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BinaryNode root = new BinaryNode(5);
		root.left = new BinaryNode(2);
		root.right = new BinaryNode(10);
		root.left.left = new BinaryNode(1);
		root.left.right = new BinaryNode(3);
		root.right.left = new BinaryNode(10);
		
		System.out.println(validateBinaryTree(root));

	}

}
