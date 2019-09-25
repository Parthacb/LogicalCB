package com.sample.datastructures.string;

public class IsRotational {

	public static void main(String[] args) {
		String s1 = new String("abcdef");
		String s2 = new String("acbdef");

		if (s1.length() != s2.length()) {
			System.out.print("Both Strings are not of equal length that is why ");
		}

		int index = 0;
		int i = 0;
		int j = 0;

		// Get the index in second string when the first character matches
		while (j < s1.length()) {

			if (s1.charAt(i) == s2.charAt(j)) {
				index = j + 1;
				break;
			}

			j++;
		}

		String s3 = "";

		// Create string get the sub string from current index to end in second string
		while (index < s2.length()) {
			s3 = s3 + s2.charAt(index);
			index++;
		}

		// Concanate it with the sub string from 0 to index in second string
		index = 0;
		while (index < j) {
			s3 = s3 + s2.charAt(index);
			index++;
		}

		// reading sub string from string first to end of first string
		String s4 = "";

		for (i = 1; i < s1.length(); i++) {
			s4 = s4 + s1.charAt(i);
		}

		// compare both strings to determine to rotatable feature
		if (s3.equals(s4)) {
			System.out.println("Given Strings are rotatable");
		}

		else {
			System.out.println("Given Strings are not rotatable");
		}

	}

}
