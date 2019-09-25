package com.sample.datastructures.string;

public class MoveDuplicatesToArray {

	public static void main(String[] args) {
		int[] arr = { 1, 3, 2, 4, 1, 3, 1 };
		int[] arrDuplicate = new int[arr.length];
		int count = 0;
		for (int i = 0; i < arr.length; i++) {
			for (int j = i + 1; j < arr.length; j++) {
				if (arr[i] == arr[j]) {
					arrDuplicate[count] = arr[j];
					count++;
				}
			}
		}
		for (int k = 0; k < count; k++) {
			System.out.println(arrDuplicate[k]);
		}

	}

}
