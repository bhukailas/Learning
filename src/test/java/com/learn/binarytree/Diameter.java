package com.learn.binarytree;

public class Diameter {
	
	static int diameter;

	class Node {
		Node left, right;
		int data;
	}

	int heightOfTree(Node root, int diam) {
		if (root == null)
			return 0;

		int leftHeight = heightOfTree(root.left, diameter);
		int rightHeight = heightOfTree(root.right, diameter);

		diameter = Math.max(diameter, leftHeight + rightHeight + 1);

		return Math.max(leftHeight, rightHeight) + 1;
	}

}
