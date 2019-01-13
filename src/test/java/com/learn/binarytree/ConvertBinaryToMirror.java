package com.learn.binarytree;

public class ConvertBinaryToMirror {

	class Node {
		Node left, right;
		int data;
	}

	void convertToMirror(Node root) {
		if (root == null) {
			return;
		}
		convertToMirror(root.left);
		convertToMirror(root.right);

		// Interchange left and right subtree root nodes
		Node temp = root.left;
		root.left = root.right;
		root.right = temp;
	}

}
