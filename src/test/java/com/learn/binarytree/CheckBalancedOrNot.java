package com.learn.binarytree;

public class CheckBalancedOrNot {

	class Node {
		Node left, right;
		int data;
	}

	int checkBalance(Node root) {
		if (root == null) {
			return 0;
		}

		// check if left sub-tree is balanced
		int leftSubtreeHeight = checkBalance(root.left);
		if (leftSubtreeHeight == -1)
			return -1;

		// check if right sub-tree is balanced
		int rightSubtreeHeight = checkBalance(root.right);
		if (rightSubtreeHeight == -1)
			return -1;

		// if both sub-trees are balanced, check the difference of heights
		// should be less than or equal to 1
		if (Math.abs(leftSubtreeHeight - rightSubtreeHeight) > 1) {
			return -1;
		}

		// if tree rooted at this node is balanced, return height if tree rooted at this
		// this node
		return Math.max(leftSubtreeHeight, rightSubtreeHeight) + 1;
	}

}
