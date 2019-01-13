package com.learn.binarytree;

public class MinimumDepth {

	class Node {
		Node left, right;
		int data;
	}

	int getMinDepth(Node root) {

		if (root == null)
			return 0;

		if (root.left == null && root.right == null) {
			return 1;
		}

		int leftDepth = root.left != null ? getMinDepth(root.left) : Integer.MAX_VALUE;
		int rightDepth = root.right != null ? getMinDepth(root.right) : Integer.MAX_VALUE;

		return Math.min(leftDepth, rightDepth);
	}
}
