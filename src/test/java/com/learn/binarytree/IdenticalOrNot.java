package com.learn.binarytree;

public class IdenticalOrNot {

	class Node {
		Node left, right;
		int data;
	}

	public static boolean areIdenticalTrees(Node root1, Node root2) {
		if (root1 == null && root2 == null) {
			return true;
		}
		if (root1 != null && root2 != null) {
			return ((root1.data == root2.data)
					&& (areIdenticalTrees(root1.left, root2.left) && (areIdenticalTrees(root1.right, root2.right))));

		}
		// If either of root1 or root2 is null but not both, then the trees are not
		// identical
		return false;
	}

}
