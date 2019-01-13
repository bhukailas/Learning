package com.learn.arrays;

public class Leaders {

	static void findLeaders(int[] a) {

		if (a == null || a.length < 2) {
			return;
		}
		int n = a.length;
		int currentLeader = a[n - 1];
		System.out.print(currentLeader + " ");

		for (int i = n - 2; i >= 0; i--) {
			if (currentLeader < a[i]) {
				currentLeader = a[i];
				System.out.print(currentLeader + " ");
			}
		}
	}

	public static void main(String[] args) {
		int[] arr = { 98, 23, 54, 12, 20, 7, 27 };
		findLeaders(arr);
	}

}
