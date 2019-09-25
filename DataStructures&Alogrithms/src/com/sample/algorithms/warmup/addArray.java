package com.sample.algorithms.warmup;

import java.util.Scanner;

public class addArray {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		int arr[] = new int[n];
		for (int arr_i = 0; arr_i < n; arr_i++) {
			arr[arr_i] = in.nextInt();
		}
		int totalsum = 0;
		for (int arr_j = 0; arr_j < n; arr_j++) {
			totalsum = totalsum + arr[arr_j];
		}

		System.out.println(totalsum);

	}

}
