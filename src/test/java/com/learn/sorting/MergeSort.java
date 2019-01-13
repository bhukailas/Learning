package com.learn.sorting;

public class MergeSort {

	static void mergeSort(int[] a, int start, int end) {
		if (start < end) {
			int mid = (start + end) / 2;
			mergeSort(a, start, mid);
			mergeSort(a, mid + 1, end);
			merge(a, start, mid, end);
		}
	}

	private static void merge(int[] a, int start, int mid, int end) {

		int nl = mid - start + 1;
		int nr = end - mid;

		int[] lArr = new int[nl];
		int[] rArr = new int[nr];

		for (int i = 0; i < nl; i++) {
			lArr[i] = a[start + i];
		}

		for (int j = 0; j < nr; j++) {
			rArr[j] = a[mid + 1 + j];
		}
		int i = 0, j = 0, k = start;

		while (i < nl && j < nr) {
			if (lArr[i] <= rArr[j]) {
				a[k] = lArr[i];
				i++;
			} else {
				a[k] = rArr[j];
				j++;
			}
			k++;
		}
		while (i < nl) {
			a[k] = lArr[i];
			i++;
			k++;
		}
		while (j < nr) {
			a[k] = rArr[j];
			j++;
			k++;
		}
	}

	public static void main(String[] args) {

		int[] arr = { 18, 37, 8, 29, 17, 3, 1, 34, 2 };
		mergeSort(arr, 0, 8);

		for (int a : arr) {
			System.out.print(a + " ");
		}

	}
}
