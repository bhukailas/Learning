package com.learn.binarytree;

public class View_Right {

	class Node {
		Node left, right;
		int data;
	}

	Node root;
	static int max_level = 0;

	void rightViewUtil(Node node, int level) {
		if (node == null)
			return;

		// If this is the first node of its level
		if (max_level < level) {
			System.out.print(" " + node.data);
			max_level = level;
		}

		rightViewUtil(node.right, level + 1);
		rightViewUtil(node.left, level + 1);

	}

	void rightView() {
		rightViewUtil(root, 1);
	}

}
