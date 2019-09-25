package com.sample.datastructures.string;

public class findDuplicates {

	public static void main(String args[]) {
		int[] a = { 2, 8, 9, 10, 5 };

		boolean isDuplicatethere = false;
		;

		for (int i = 0; i < a.length; i++) {
			for (int j = i + 1; j < a.length; j++) {
				if (a[i] == a[j]) {
					isDuplicatethere = true;
				}
			}
		}

		System.out.println(isDuplicatethere);

	}

}
