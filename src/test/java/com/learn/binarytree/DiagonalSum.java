package com.learn.binarytree;

import java.util.Map;

public class DiagonalSum {

	class Node {
		Node left, right;
		int data;
	}

	void computeDiagonalSun(Node root, int cDiag, Map<Integer, Integer> map) {

		if (root == null)
			return;

		computeDiagonalSun(root.left, cDiag + 1, map);

		int prev = map.get(cDiag) == null ? 0 : map.get(cDiag);
		map.put(cDiag, prev + root.data);

		computeDiagonalSun(root.right, cDiag, map);
	}

}
