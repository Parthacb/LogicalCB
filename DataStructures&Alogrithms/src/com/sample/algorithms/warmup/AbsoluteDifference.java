package com.sample.algorithms.warmup;

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class AbsoluteDifference {

	public static void main(String[] args) {

		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		int a[][] = new int[n][n];
		for (int a_i = 0; a_i < n; a_i++) {
			for (int a_j = 0; a_j < n; a_j++) {
				a[a_i][a_j] = in.nextInt();
			}

		}

		int firstdiagonalsum = 0;

		for (int a_k = 0; a_k < n; a_k++) {
			for (int a_l = 0; a_l < n; a_l++) {

				if (a_k == a_l) {
					firstdiagonalsum = firstdiagonalsum + a[a_l][a_k];
				}
			}

		}
		int seconddiagonalsum = 0;

		int y = n - 1;

		for (int a_m = 0; a_m < n; a_m++) {

			seconddiagonalsum = seconddiagonalsum + a[y][a_m];
			y--;

		}
		int absolutedifference = 0;

		absolutedifference = Math.abs(firstdiagonalsum - seconddiagonalsum);

		System.out.println(absolutedifference);

	}

}
