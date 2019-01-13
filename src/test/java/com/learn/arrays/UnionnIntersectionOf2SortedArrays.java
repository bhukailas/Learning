package com.learn.arrays;

public class UnionnIntersectionOf2SortedArrays {

	static void printUnion(int[] a1, int[] a2, int m, int n) {
		int i = 0, j = 0;
		while (i < m && j < n) {
			if (a1[i] < a2[j]) {
				System.out.print(a1[i] + " ");
				i++;
				if (a1[i] == a1[i - 1])
					i++;
			} else if (a1[i] > a2[j]) {
				System.out.print(a2[j] + " ");
				j++;
				if (a2[j] == a2[j - 1])
					j++;
			} else {
				System.out.print(a2[j] + " ");
				i++;
				j++;
			}
		}
		while (i < m) {
			System.out.print(a1[i] + " ");
			i++;
		}
		while (j < n) {
			System.out.print(a2[j] + " ");
			j++;
		}
	}

	static void printIntersection(int[] a1, int[] a2, int m, int n) {
		int i = 0, j = 0;
		while (i < m && j < n) {
			if (a1[i] < a2[j]) {
				i++;
			} else if (a1[i] > a2[j]) {
				j++;
			} else {
				System.out.print(a2[j] + " ");
				i++;
				j++;
			}
		}
	}

	public static void main(String[] args) {
		int[] arr1 = { 1, 2, 2, 3, 6, 7, 8, 12 };
		int[] arr2 = { 7, 8, 10, 10, 12, 43 };
		System.out.print("Union : ");
		printUnion(arr1, arr2, arr1.length, arr2.length);
		System.out.print("\nIntersection : ");
		printIntersection(arr1, arr2, arr1.length, arr2.length);
	}

}
