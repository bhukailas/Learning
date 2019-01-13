package com.learn.arrays;

public class MergeTwoSortedArraysInPlace {

	final static int INVALID_NUM = 0;

	static void mergeTwoSortedArraysnFirstArrayHasEnoughSize(int[] a, int[] b) {
		int tempLength = a.length - 1;
		int n = a.length;
		
		for (int i = n - 1; i >= 0; i--) {
			if (a[i] != INVALID_NUM) {
				a[tempLength] = a[i];
				tempLength--;
			}
		}
		int i = tempLength + 1;
		int j = 0, k = 0;

		while (i < n && j < b.length) {
			if (a[i] >= b[j]) {
				a[k++] = b[j++];
			} else {
				a[k++] = a[i++];
			}
		}

		while (j < b.length) {
			a[k++] = b[j++];
		}
	}

	public static void main(String[] args) {
		int[] arrayA = { -3, 5, INVALID_NUM, 7, INVALID_NUM, 10, INVALID_NUM, 11, INVALID_NUM };
		int[] arrayB = { -1, 2, 6, 12 };

		mergeTwoSortedArraysnFirstArrayHasEnoughSize(arrayA, arrayB);

		for (int i : arrayA) {
			System.out.print(i + " ");
		}
	}

}
