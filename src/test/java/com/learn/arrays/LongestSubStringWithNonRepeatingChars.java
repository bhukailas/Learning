package com.learn.arrays;

public class LongestSubStringWithNonRepeatingChars {

	static String longestSubString(String s) {

		if (null == s)
			return null;

		int n = s.length();

		if (n < 2)
			return s;

		int[] charIndexes = new int[256];

		for (int i = 0; i < 256; i++) {
			charIndexes[i] = -1;
		}
		charIndexes[s.charAt(0)] = 0;

		int currentLength = 1;
		int maxLength = 1;
		int prevIdx = 0;
		int startIdx = 0;

		for (int i = 1; i < n; i++) {
			prevIdx = charIndexes[s.charAt(i)];
			if (prevIdx == -1 || i - currentLength > prevIdx) {
				currentLength++;
			} else {
				if (maxLength < currentLength) {
					maxLength = currentLength;
					startIdx = i - maxLength;
				}
				currentLength = i - prevIdx;
			}
			charIndexes[s.charAt(i)] = i;
		}

		if (maxLength < currentLength) {
			maxLength = currentLength;
			startIdx = n - maxLength;
		}
		System.out.println("Length is : "+maxLength);
		return s.substring(startIdx, startIdx + maxLength);
	}

	public static void main(String[] args) {
		String s = "ABCDABDEFGCABD";
		System.out.println(longestSubString(s));
	}

}
