package com.graph;

//Recursive optimized Java program to find the diameter of a
//Binary Tree

/* Class containing left and right child of current
BinaryNode and key value*/
class BinaryNode
{
 int data;
 BinaryNode left, right,parent;

 public BinaryNode(int item)
 {
     data = item;
     left = right = null;
     parent = null;
 }
}

/* Class to print the Diameter */
public class BinaryTreeDiameter
{
 BinaryNode root;

 /* Method to calculate the diameter and return it to main */
 int diameter(BinaryNode root)
 {
     /* base case if tree is empty */
     if (root == null)
         return 0;

     /* get the height of left and right sub trees */
     int lheight = height(root.left);
     int rheight = height(root.right);

     /* get the diameter of left and right subtrees */
     int ldiameter = diameter(root.left);
     int rdiameter = diameter(root.right);

     /* Return max of following three
       1) Diameter of left subtree
      2) Diameter of right subtree
      3) Height of left subtree + height of right subtree + 1 */
     return Math.max(lheight + rheight + 1,
                     Math.max(ldiameter, rdiameter));

 }

 /* A wrapper over diameter(BinaryNode root) */
 int diameter()
 {
     return diameter(root);
 }

 /*The function Compute the "height" of a tree. Height is the
   number f BinaryNodes along the longest path from the root BinaryNode
   down to the farthest leaf BinaryNode.*/
 static int height(BinaryNode BinaryNode)
 {
     /* base case tree is empty */
     if (BinaryNode == null)
         return 0;

     /* If tree is not empty then height = 1 + max of left
        height and right heights */
     return (1 + Math.max(height(BinaryNode.left), height(BinaryNode.right)));
 }

 public static void main(String args[])
 {
     /* creating a binary tree and entering the BinaryNodes */
	 BinaryTreeDiameter tree = new BinaryTreeDiameter();
     tree.root = new BinaryNode(1);
     tree.root.left = new BinaryNode(2);
     tree.root.right = new BinaryNode(3);
     tree.root.left.left = new BinaryNode(4);
     tree.root.left.right = new BinaryNode(5);

     System.out.println("The diameter of given binary tree is : "
                        + tree.diameter());
 }
}