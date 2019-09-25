package com.sample.datastructures.Array;

import java.util.Scanner;

public class Solution {

	public static void main(String[] args) {
		/*
		 * Enter your code here. Read input from STDIN. Print output to STDOUT. Your
		 * class should be named Solution.
		 */
		int n = 0;
		Scanner s = new Scanner(System.in);
		n = s.nextInt();
		int[] a = new int[n];

		for (int a_i = 0; a_i < n; a_i++) {
			a[a_i] = s.nextInt();
		}

		for (int a_j = n - 1; a_j >= 0; a_j--) {
			System.out.print(a[a_j] + " ");
		}

	}
}