package com.learn.arrays;

public class FindMissingNumberIn1Array {

	static int findMissingNumberIn1Array(int[] a, int[] b) {

		int result = 0;
		for (int i : a) {
			result = result ^ i;
		}
		for (int j : b) {
			result = result ^ j;
		}
		System.out.println("result : " + result);
		return result;
	}

	public static void main(String[] args) {
		int[] array1 = { 9, 7, 8, 5, 4, 6, 2, 3, 1 };
		int[] array2 = { 2, 3, 4, 9, 1, 8, 5, 7 };
		findMissingNumberIn1Array(array1, array2);
	}

}
