package com.learn.strings;

public class ReverseWordsInString {

	static void reverseWordsInString(String s) {
		char[] ch = s.toCharArray();

		int start = 0;
		int n = s.length();

		for (int i = 0; i < n; i++) {
			if (ch[i] == ' ' && i > 0) {
				reverse(ch, start, i - 1);
				start = i + 1;
			} else if (i == n - 1) {
				reverse(ch, start, i);
			}
		}
		reverse(ch, 0, n - 1);
		System.out.println(String.valueOf(ch));
	}

	static void reverse(char[] ch, int start, int end) {
		while (start < end) {
			char temp = ch[start];
			ch[start] = ch[end];
			ch[end] = temp;
			start++;
			end--;
		}
	}

	public static void main(String[] args) {
		String str = "This   is my String";
		reverseWordsInString(str);

	}

}
