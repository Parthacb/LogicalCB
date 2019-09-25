package com.sample.datastructuresArray;

import java.util.Scanner;

public class SumOfArrayElements {

	public static void main(String[] args) {
		/*
		 * Enter your code here. Read input from STDIN. Print output to STDOUT. Your
		 * class should be named Solution.
		 */
		int n = 0;
		Scanner s = new Scanner(System.in);
		n = s.nextInt();
		int[] a = new int[n];

		int sum = 0;

		for (int a_i = 0; a_i < n; a_i++) {
			a[a_i] = s.nextInt();
			sum = sum + a[a_i];
		}

		System.out.print(sum);

	}
}
