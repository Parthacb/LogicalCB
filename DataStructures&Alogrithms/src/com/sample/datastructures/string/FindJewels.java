package com.sample.datastructures.string;

public class FindJewels {

	public static void main(String args[]) {

		String J = "aA";
		String S = "aAbba";

		int[] jewelIndex = new int[128];
		int totalJewels = 0;
		int totalJewelsNew = 0;

		for (char c : J.toCharArray()) {
			jewelIndex[c] = 1;
		}

		for (int i = 0; i < S.length(); i++) {
			if (jewelIndex[S.charAt(i)] == 1) {
				totalJewels++;
			}
		}

		for (char k : J.toCharArray()) {
			for (int l = 0; l < S.length(); l++) {
				if (k == S.charAt(l)) {
					totalJewelsNew++;
				}
			}
		}

		System.out.println(totalJewels);
		System.out.println(totalJewelsNew);
	}

}
