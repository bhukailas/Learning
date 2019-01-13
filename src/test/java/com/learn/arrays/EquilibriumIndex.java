package com.learn.arrays;

public class EquilibriumIndex {

	static int getEquilibriumIndex(int[] a) {
		int n = a.length;
		int rightSum = 0, leftSum = 0;

		for (int i = 0; i < n; i++) {
			rightSum += a[i];
		}

		for (int i = 0; i < n; i++) {
			rightSum -= a[i];
			if (leftSum == rightSum) {
				return i;
			}
			leftSum += a[i];
		}
		return -1;
	}

	public static void main(String[] args) {
		int arr[] = { -7, 1, 5, 2, -4, 3, 0 };
		System.out.println("Index is : " + getEquilibriumIndex(arr));
	}

}
