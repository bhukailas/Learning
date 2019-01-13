package com.learn.binarytree;

public class ConvertBinaryTreeToDLL {

	Node root, prev, head;

	class Node {
		Node left, right;
		int data;
	}

	void BinaryTree2DoubleLinkedList(Node root) {
		if (root == null)
			return;

		// Recursively convert left subtree
		BinaryTree2DoubleLinkedList(root.left);

		// Now convert this node
		if (prev == null)
			head = root;
		else {
			root.left = prev;
			prev.right = root;
		}
		prev = root;

		// Finally convert right subtree
		BinaryTree2DoubleLinkedList(root.right);
	}

//	private Node convertToDoublyLinkedList(Node root) {
//        
//        if (root.getLeft() != null) {
//            Node left = convertToDoublyLinkedList(root.getLeft());
//            while (left.getRight() != null) {
//                left = left.getRight();
//            }
//            left.setRight(root);
//            root.setLeft(left);
//        }
//         
//        if (root.getRight() != null) {
//            Node right = convertToDoublyLinkedList(root.getRight());
//            while (right.getLeft() != null) {
//                right = right.getLeft();
//            }
//            right.setLeft(root);
//            root.setRight(right);
//        }
// 
//        return root;
//    }

}
