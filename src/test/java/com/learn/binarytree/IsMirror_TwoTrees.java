package com.learn.binarytree;

public class IsMirror_TwoTrees {

	class Node {
		Node left, right;
		int data;
	}

	boolean areMirror(Node a, Node b) {
		/* Base case : Both empty */
		if (a == null && b == null)
			return true;

		// If only one is empty
		if (a == null || b == null)
			return false;

		/*
		 * Both non-empty, compare them recursively Note that in recursive calls, we
		 * pass left of one tree and right of other tree
		 */
		return a.data == b.data && areMirror(a.left, b.right) && areMirror(a.right, b.left);
	}

}
