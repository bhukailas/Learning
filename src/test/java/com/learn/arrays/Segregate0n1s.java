package com.learn.arrays;

public class Segregate0n1s {

	private static void sort0n1(int[] a) {

		int start = 0, end = a.length - 1;

		while (start < end) {

			while (a[start] == 0 && start < end) {
				start++;
			}

			while (a[end] == 1 && start < end) {
				end--;
			}

			if (start < end) {
				a[start] = 0;
				a[end] = 1;

				start++;
				end--;
			}
		}
	}

	public static void main(String[] args) {
		int[] arr = { 0, 1, 0, 1, 0, 0, 0, 1, 0, 1, 1, 0, 1 };
		sort0n1(arr);

		for (int a : arr) {
			System.out.print(a + " ");
		}
	}

}
