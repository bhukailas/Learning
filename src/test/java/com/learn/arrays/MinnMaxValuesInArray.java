package com.learn.arrays;

public class MinnMaxValuesInArray {

	static void getMinNMaxValues(int[] a) {

		int min = 0, max = 0;

		int n = a.length;

		if (n == 1) {
			return;
		}

		if (a[0] > a[1]) {
			min = a[1];
			max = a[0];
		} else {
			min = a[0];
			max = a[1];
		}

		for (int i = 2; i < n; i++) {
			if (a[i] > max) {
				max = a[i];
			} else if (a[i] < min) {
				min = a[i];
			}
		}
		System.out.println("Min and Max : " + min + " " + max);
	}

	public static void main(String[] args) {
		int arr[] = { 1000, 11, 445, 1, 330, 1300, -3 };

		getMinNMaxValues(arr);
	}

}
