package com.learn.arrays;

public class RotateArray {

	static void rotateArray(int[] a, int k) {

		if (k < 0) {
			throw new IllegalArgumentException("K can not be -ve");
		}

		if (null == a || a.length < 2)
			return;
		int n = a.length;
		if (k > n) {
			k = k % n;
		}

		reverse(a, 0, k - 1);
		reverse(a, k, n - 1);
		reverse(a, 0, n - 1);
	}

	private static void reverse(int[] a, int start, int end) {
		while (start < end) {
			int temp = a[start];
			a[start] = a[end];
			a[end] = temp;
			start++;
			end--;
		}
	}

	public static void main(String[] args) {
		int[] arr = { 1, 2, 3, 4, 5, 6, 7 };
		rotateArray(arr, 5);
		for (int i : arr) {
			System.out.print(i + " ");
		}
	}
}
