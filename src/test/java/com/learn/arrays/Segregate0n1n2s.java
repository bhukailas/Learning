package com.learn.arrays;

public class Segregate0n1n2s {

	private static void sort012(int[] a) {

		int start = 0, mid = 0, temp = 0;
		int end = a.length - 1;

		while (mid <= end) {
			switch (a[mid]) {
			case 0:
				temp = a[start];
				a[start] = a[mid];
				a[mid] = temp;
				start++;
				mid++;
				break;
			case 1:
				mid++;
				break;
			case 2:
				temp = a[end];
				a[end] = a[mid];
				a[mid] = temp;
				end--;
			}
		}
	}

	public static void main(String[] args) {
		int[] arr = { 0, 1, 0, 1, 2, 0, 0, 2, 0, 1, 2, 0, 1, 2, 0, 1, 0, 1, 1, 2, 0, 2, 1 };
		sort012(arr);

		for (int a : arr) {
			System.out.print(a + " ");
		}
	}

}
