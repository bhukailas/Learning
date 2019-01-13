package com.learn.binarytree;

public class IsBSTOrNot {

	class Node {
		Node left, right;
		int data;
	}

	boolean isBinarySearchTree(Node root, int min, int max) {
		if (root == null) {
			return true;
		}
		if (root.data <= min || root.data >= max) {
			return false;
		}
		return isBinarySearchTree(root.left, min, root.data)
				&& isBinarySearchTree(root.right, root.data, max);
	}

}
