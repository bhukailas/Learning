package com.learn.binarytree;

import java.util.ArrayList;
import java.util.List;

import org.testng.annotations.Test;

public class RootToAllLeafPaths {
	
	class Node {
		Node left, right;
		int data;
	}
	
	void printRootToLeafPaths(Node root, List<Integer> path) {
		
		if(root == null) return;
		
		path.add(root.data);
		
		if(root.left == null & root.right == null) {
			path.stream().forEach(p -> System.out.print(p+" "));
			return;
		}
		
		printRootToLeafPaths(root.left, new ArrayList<Integer>());
		printRootToLeafPaths(root.right, new ArrayList<Integer>());
	}
	
	@Test
	public void testww() {
		
		List<Integer> list = new ArrayList<>();
		list.add(12);
		list.add(13);
		list.add(14);
		list.add(15);
		
		System.out.println(list);
	}
}
