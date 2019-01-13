package com.learn.binarytree;

import java.util.LinkedList;
import java.util.Map;

public class ViewBottom {

	class Node {
		Node left, right;
		int data;
	}

	class Entry {
		Node node;
		int hd;

		public Entry(Node node, int hd) {
			this.node = node;
			this.hd = hd;
		}
	}

	void fillUpViewMap(Node root, Map<Integer, Integer> viewMap) {
		if (root == null)
			return;

		LinkedList<Entry> queue = new LinkedList<>();
		queue.add(new Entry(root, 0));

		while (!queue.isEmpty()) {
			Entry currentNode = queue.remove();
			viewMap.put(currentNode.hd, currentNode.node.data);

			if (currentNode.node.left != null)
				queue.add(new Entry(currentNode.node.left, currentNode.hd - 1));

			if (currentNode.node.right != null)
				queue.add(new Entry(currentNode.node.right, currentNode.hd + 1));
		}
	}

}
