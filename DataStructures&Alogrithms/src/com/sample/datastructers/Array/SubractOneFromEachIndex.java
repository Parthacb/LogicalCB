package com.sample.datastructers.Array;

public class SubractOneFromEachIndex {

	public static void main(String[] args) {

		int[] a = { 1, 2, 3, 4, 5 };

		for (int i = 0; i < a.length; i++) {
			System.out.print(--a[i]);
		}

	}

}
