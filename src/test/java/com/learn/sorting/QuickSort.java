package com.learn.sorting;

import com.learn.utils.Helper;

public class QuickSort {

	static void quickSort(int[] a, int start, int end) {
		if (start < end) {
			int partitionIndex = partition(a, start, end);
			quickSort(a, start, partitionIndex - 1);
			quickSort(a, partitionIndex + 1, end);
		}
	}

	private static int partition(int[] a, int start, int end) {
		int pivot = a[end];
		int partitionIndex = start;
		for (int i = start; i < end; i++) {
			if (a[i] <= pivot) {
				Helper.swap(a, i, partitionIndex);
				partitionIndex++;
			}
		}
		Helper.swap(a, partitionIndex, end);
		return partitionIndex;
	}

	public static void main(String[] args) {
		int[] arr = { 18, 37, 8, 29, 17, 3, 1, 34, 2 };
		quickSort(arr, 0, 8);

		for (int a : arr) {
			System.out.print(a + " ");
		}

	}
}
