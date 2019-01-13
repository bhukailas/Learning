package com.learn.bst;

public class PreOrder2PostOrderNoTree {

	static class INT {
		int data;

		INT(int key) {
			data = key;
		}
	}

	private static void preToPost(int[] pre, int size, INT index, Integer min, Integer max) {

		if (index.data == size)
			return;
		if (pre[index.data] < min || pre[index.data] > max)
			return;

		int val = pre[index.data];
		index.data++;

		preToPost(pre, size, index, min, val);
		preToPost(pre, size, index, val, max);

		System.out.print(val + " ");
	}

	public static void main(String[] args) {
		int[] pre = { 40, 30, 32, 35, 80, 90, 100, 120 };
		INT index = new INT(0);
		preToPost(pre, pre.length, index, Integer.MIN_VALUE, Integer.MAX_VALUE);
	}

}
