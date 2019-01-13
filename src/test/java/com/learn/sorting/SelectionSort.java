package com.learn.sorting;

import com.learn.utils.Helper;

public class SelectionSort {

	private static void selectionSort(int[] a) {

		if (a == null || a.length < 2) {
			return;
		}
		int n = a.length;

		for (int i = 0; i < n - 1; i++) {
			int minIndex = i;

			for (int j = i + 1; j < n; j++) {
				if (a[minIndex] > a[j]) {
					minIndex = j;
				}
			}
			// if (i != minIndex && a[i] != a[minIndex]) {
			Helper.swap(a, i, minIndex);
			// }
		}
	}

	public static void main(String[] args) {
		int[] arr = { 18, 37, 8, 29, 17, 3, 1, 34 };
		selectionSort(arr);

		for (int a : arr) {
			System.out.print(a + " ");
		}
	}
}
