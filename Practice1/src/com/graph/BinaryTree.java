package com.graph;

//Java program to find maximum sum leaf to root path in Binary Tree

//A Binary Tree Node1
class Node1 {

	int data;
	Node1 left, right;

	Node1(int item) {
		data = item;
		left = right = null;
	}
}

class Maximum {

	int max_no = Integer.MIN_VALUE;
}

public class BinaryTree {

	static Node1 root;
	Maximum max = new Maximum();

	// A utility function that prints all Node1s on the 
	// path from root to target_leaf
	boolean printPath(Node1 Node1, Node1 target_leaf) {

		// base case
		if (Node1 == null) {
			return false;
		}

		// return true if this Node1 is the target_leaf or target leaf is present in
		// one of its descendants
		if (Node1 == target_leaf || printPath(Node1.left, target_leaf)
				|| printPath(Node1.right, target_leaf)) {
			System.out.print(Node1.data + " ");
			return true;
		}

		return false;
	}

	// This function Sets the target_leaf_ref to refer the leaf Node1 of the 
	// maximum path sum.  Also, returns the max_sum using max_sum_ref
	void getTargetLeaf(Node1 Node1, Maximum max_sum_ref, int curr_sum, 
			Node1 target_leaf_ref) {
		if (Node1 == null) {
			return;
		}

		// Update current sum to hold sum of Node1s on path from root to this Node1
		curr_sum = curr_sum + Node1.data;
		int a = max_sum_ref.max_no;

		// If this is a leaf Node1 and path to this Node1 has maximum sum so far,
		// the  n make this Node1 target_leaf
		if (Node1.left == null && Node1.right == null) {
			if (curr_sum > max_sum_ref.max_no) {
				max_sum_ref.max_no = curr_sum;
				target_leaf_ref = Node1;

			}
		}

		// If this is not a leaf Node1, then recur down to find the target_leaf
		getTargetLeaf(Node1.left, max_sum_ref, curr_sum, target_leaf_ref);
		getTargetLeaf(Node1.right, max_sum_ref, curr_sum, target_leaf_ref);
		Node1 Node11 = target_leaf_ref;
		if (curr_sum > a && a > 0) {
			printPath(root, target_leaf_ref);
		}
	}

	// Returns the maximum sum and prints the Node1s on max sum path
	int maxSumPath(Node1 Node1) {

		// base case
		if (Node1 == null) {
			return 0;
		}
		Node1 target_leaf = null;

		// find the target leaf and maximum sum
		getTargetLeaf(Node1, max, 0, target_leaf);

		// print the path from root to the target leaf
		//printPath(Node1, target_leaf);
		return max.max_no;  // return maximum sum
	}

	// driver function to test the above functions
	public static void main(String args[]) {
		BinaryTree tree = new BinaryTree();
		tree.root = new Node1(10);
		tree.root.left = new Node1(-2);
		tree.root.right = new Node1(7);
		tree.root.left.left = new Node1(8);
		tree.root.left.right = new Node1(-4);
		System.out.println("Following are the Node1s on maximum sum path");
		int sum = tree.maxSumPath(root);
		System.out.println("");
		System.out.println("Sum of Node1s is : " + sum);
	}
}

//This code has been contributed by Mayank Jaiswal