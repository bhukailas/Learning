package com.learn.arrays;

import java.util.Arrays;

public class UnionnIntersectionOf2Arrays {

	static void printUnion(int[] a1, int[] a2, int m, int n) {

		if (m > n) {
			int[] temp = a1;
			a1 = a2;
			a2 = temp;

			int tempSize = m;
			m = n;
			n = tempSize;
		}
		Arrays.sort(a1);
		for (int i : a1) {
			System.out.print(i + " ");
		}
		for (int i = 0; i < n; i++) {
			if ((binarySearch(a1, 0, m - 1, a2[i]) == -1)) {
				System.out.print(a2[i] + " ");
			}
		}
	}

	static void printIntersection(int[] a1, int[] a2, int m, int n) {
		if (m > n) {
			int[] temp = a1;
			a1 = a2;
			a2 = temp;

			int tempSize = m;
			m = n;
			n = tempSize;
		}
		Arrays.sort(a1);
		for (int i = 0; i < n; i++) {
			if ((binarySearch(a1, 0, m - 1, a2[i]) != -1)) {
				System.out.print(a2[i] + " ");
			}
		}
	}

	private static int binarySearch(int[] a, int start, int end, int x) {

		while (start <= end) {
			int mid = start + (end - start) / 2;
			if (a[mid] == x) {
				return mid;
			}
			if (a[mid] < x) {
				start = mid + 1;
			} else {
				end = mid - 1;
			}
		}
		return -1;
	}

	public static void main(String[] args) {
		int[] arr1 = { 2, 1, 7, 8, 3, 12, 6 };
		int[] arr2 = { 10, 8, 7, 12, 43 };
		System.out.print("Union : ");
		printUnion(arr1, arr2, arr1.length, arr2.length);
		System.out.print("\nIntersection : ");
		printIntersection(arr1, arr2, arr1.length, arr2.length);
	}

}
