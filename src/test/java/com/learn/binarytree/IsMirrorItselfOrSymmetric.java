package com.learn.binarytree;

public class IsMirrorItselfOrSymmetric {

	class Node {
		Node left, right;
		int data;
	}

	boolean isMirrorItSelf(Node a, Node b) {
		if (a == null && b == null)
			return true;

		// If only one is empty
		if (a == null || b == null)
			return false;

		/*
		 * Both non-empty, compare them recursively Note that in recursive calls, we
		 * pass left of one tree and right of other tree
		 */
		return a.data == b.data && isMirrorItSelf(a.left, b.right) && isMirrorItSelf(a.right, b.left);
	}

}
