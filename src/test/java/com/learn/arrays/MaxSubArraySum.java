package com.learn.arrays;

public class MaxSubArraySum {

	static int findmaxSubArraySum(int[] a) {

		int currentSum = 0, maxSum = 0;
		boolean hasAllNegavtiveNos = true;
		int maxNegativeSum = Integer.MIN_VALUE;

		for (int i = 0; i < a.length; i++) {
			if (hasAllNegavtiveNos && a[i] >= 0) {
				hasAllNegavtiveNos = false;
			} else if (hasAllNegavtiveNos && a[i] < 0 && maxNegativeSum < a[i]) {
				maxNegativeSum = a[i];
			}

			currentSum += a[i];
			if (currentSum < 0) {
				currentSum = 0;
			}
			if (currentSum > maxSum) {
				maxSum = currentSum;
			}
		}
		return hasAllNegavtiveNos ? maxNegativeSum : maxSum;
	}

	public static void main(String[] args) {
		int[] input = { 2, -9, 5, 1, -4, 6, 0, -7, 8 };
		System.out.println("Maximum subarray sum is " + findmaxSubArraySum(input));
	}
}
