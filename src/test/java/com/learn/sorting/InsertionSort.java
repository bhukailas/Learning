/**
 * 
 */
package com.learn.sorting;

public class InsertionSort {

	static void insertionSort(int[] a) {

		if (a == null || a.length < 2) {
			return;
		}
		int n = a.length;

		for (int i = 1; i < n; i++) {

			int temp = a[i];
			int j = i - 1;

			while (j >= 0 && temp < a[j]) {
				a[j + 1] = a[j];
				j--;
			}
			a[j + 1] = temp;
		}
	}

	public static void main(String[] args) {

		int[] arr = { 12, 18, 37, 8, 29, 17, 3, 1, 34 };
		insertionSort(arr);

		for (int a : arr) {
			System.out.print(a + " ");
		}

	}

}
