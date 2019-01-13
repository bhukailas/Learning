package com.learn.strings;

public class PermutationsOfString {

	void permute(String s, int start, int end) {
		if (start == end) {
			System.out.println(s);
		} else {
			for (int i = start; i <= end; i++) {
				s = swap(s, start, i);
				permute(s, start + 1, end);
				s = swap(s, start, i);
			}
		}
	}

	public String swap(String a, int i, int j) {
		char temp;
		char[] charArray = a.toCharArray();
		temp = charArray[i];
		charArray[i] = charArray[j];
		charArray[j] = temp;
		return String.valueOf(charArray);
	}
	
	public static void main(String[] args) {
		PermutationsOfString p = new PermutationsOfString();
		p.permute("abc", 0, 2);
	}

}
