package com.learn.arrays;

public class FindTwoMaxNumbersInArray {

	static void findTwoMaxNumbers(int[] a) {

		if (a == null || a.length < 2) {
			return;
		}

		int maxOne = 0;
		int maxTwo = 0;

		for (int n : a) {
			if (n > maxOne) {
				maxTwo = maxOne;
				maxOne = n;
			} else if (n > maxTwo) {
				maxTwo = n;
			}
		}
		System.out.println(maxOne + " and " + maxTwo);
	}

	public static void main(String[] args) {
		int[] a = { 6, 2, 1, 5, 8, 5, 89, 34, 1654, 789, 9, 7 };
		findTwoMaxNumbers(a);
	}

}
