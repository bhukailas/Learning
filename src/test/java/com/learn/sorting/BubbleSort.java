package com.learn.sorting;

import com.learn.utils.Helper;

public class BubbleSort {

	static void bubbleSort(int[] a) {

		if (a == null || a.length < 2) {
			return;
		}
		int n = a.length;
		boolean swapped = true;

		while (swapped) {
			swapped = false;

			for (int i = 1; i < n; i++) {
				if (a[i - 1] > a[i]) {
					Helper.swap(a, i - 1, i);
					swapped = true;
				}
			}
			n--;
		}
	}

	public static void main(String[] args) {
		int[] arr = { 18, 37, 8, 29, 17, 3, 1, 34, 2 };
		bubbleSort(arr);

		for (int a : arr) {
			System.out.print(a + " ");
		}

	}

}
