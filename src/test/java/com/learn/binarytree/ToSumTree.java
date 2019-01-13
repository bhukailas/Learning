package com.learn.binarytree;

public class ToSumTree {

	class Node {
		Node left, right;
		int data;
	}

	int toSumTree(Node node) {
		if (node == null)
			return 0;

		// Store the old value
		int old_val = node.data;

		// Recursively call for left and right subtrees and store the sum
		// as new value of this node
		node.data = toSumTree(node.left) + toSumTree(node.right);

		// Return the sum of values of nodes in left and right subtrees
		// and old_value of this node
		return node.data + old_val;
	}
}
