package com.learn.binarytree;

public class View_Left {

	class Node {
		Node left, right;
		int data;
	}

	Node root;
	static int max_level = 0;

	void leftViewUtil(Node node, int level) {
		if (node == null)
			return;

		// If this is the first node of its level
		if (max_level < level) {
			System.out.print(" " + node.data);
			max_level = level;
		}

		// Recur for left and right subtrees
		leftViewUtil(node.left, level + 1);
		leftViewUtil(node.right, level + 1);
	}

	// A wrapper over leftViewUtil()
	void leftView() {
		leftViewUtil(root, 1);
	}

}
