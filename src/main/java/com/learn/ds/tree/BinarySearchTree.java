package com.learn.ds.tree;

public class BinarySearchTree {

	Node root;

	class Node {
		int data;
		Node left, right;

		Node(int key) {
			data = key;
			left = right = null;
		}
	}

	public Node search(Node root, int key) {
		if (root == null || root.data == key) {
			return root;
		}

		if (key < root.data) {
			return search(root.left, key);
		}
		return search(root.right, key);
	}

	public void insert(int key) {

		root = insert(root, key);
	}

	public Node insert(Node root, int key) {

		if (root == null) {
			root = new Node(key);
			return root;
		}

		if (key < root.data) {
			root.left = insert(root.left, key);
		} else if (key > root.data) {
			root.right = insert(root.right, key);
		}
		return root;
	}

	public void delete(int key) {

		root = delete(root, key);
	}

	int minValue(Node node) {
		int min = node.data;

		while (node.left != null) {
			min = node.left.data;
			node = node.left;
		}
		return min;
	}

	public Node delete(Node root, int key) {

		if (root == null) {
			return null;
		}

		if (key < root.data) {
			root.left = delete(root.left, key);
		} else if (key > root.data) {
			root.right = delete(root.right, key);
		} else {

			if (root.left == null) {
				return root.right;
			} else if (root.right == null) {
				return root.left;
			} else {
				root.data = minValue(root.right);
				root.right = delete(root.right, root.data);
			}
		}

		return null;
	}

}
