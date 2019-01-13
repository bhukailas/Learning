package com.learn.arrays;

public class MaxAvegSubArrayOfK_Size {

	static int maxAvgSubArray(int[] a, int k) {

		int n = a.length;
		if (k <= 0 || k > n)
			throw new RuntimeException("should be less");

		if (k == n)
			return 0;

		int sum = 0;
		for (int i = 0; i < k; i++) {
			sum = sum + a[i];
		}

		int maxSum = sum;
		int maxSumIndex = 0;

		for (int i = k; i < n; i++) {
			sum = sum - a[i - k] + a[i];
			if (sum > maxSum) {
				maxSum = sum;
				maxSumIndex = i - k + 1;
			}
		}
		System.out.println("max sum : " + maxSum);
		return maxSumIndex;
	}

	public static void main(String[] args) {
		int[] input = { 11, -8, 16, -7, 24, -2, 3 };
		int k = 3;
		System.out.println(maxAvgSubArray(input, k));
	}

}
