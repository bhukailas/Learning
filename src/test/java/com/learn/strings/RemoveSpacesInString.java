package com.learn.strings;

import java.util.Arrays;

public class RemoveSpacesInString {

	static String removeSpaces(String s) {

		char[] chArr = s.toCharArray();
		int noOfSpaces = 0;

		for (int i = 0; i < chArr.length; i++) {
			if (chArr[i] == ' ') {
				noOfSpaces++;
			} else {
				chArr[i - noOfSpaces] = chArr[i];
			}
		}
		chArr = Arrays.copyOf(chArr, chArr.length - noOfSpaces);
		return String.valueOf(chArr);
	}

	public static void main(String[] args) {
		String strWithSpaces = "  Hi there, how  are you   doing? ";
		System.out.println(removeSpaces(strWithSpaces));
	}

}
