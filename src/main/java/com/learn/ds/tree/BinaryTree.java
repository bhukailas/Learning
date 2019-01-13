package com.learn.ds.tree;

import java.util.LinkedList;
import java.util.Queue;

public class BinaryTree {

	Node root;

	class Node {
		int data;
		Node left, right;

		Node(int key) {
			data = key;
			left = right = null;
		}
	}

	void insert(int key) {

		if (root == null) {
			root = new Node(key);
			return;
		}

		Queue<Node> q = new LinkedList<>();
		q.add(root);

		while (!q.isEmpty()) {

			Node temp = q.poll();

			if (temp.left == null) {
				temp.left = new Node(key);
				return;
			} else {
				q.add(temp.left);
			}

			if (temp.right == null) {
				temp.right = new Node(key);
				return;
			} else {
				q.add(temp.right);
			}
		}
	}

	void inorder(Node root) {
		if (root == null) {
			return;
		}
		inorder(root.left);
		System.out.print(root.data + " ");
		inorder(root.right);
	}

	void preOrder(Node root) {
		if (root == null) {
			return;
		}
		System.out.print(root.data + " ");
		preOrder(root.left);
		preOrder(root.right);
	}

	void postOrder(Node root) {
		if (root == null) {
			return;
		}
		postOrder(root.left);
		postOrder(root.right);
		System.out.print(root.data + " ");
	}

}
