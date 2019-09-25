package com.sample.alogorithms.greedy;

import java.util.Arrays;
import java.util.Scanner;

public class MinMax {

	public static void main(String[] args) {
		int n = 0;
		int k = 0;
		int res1 = 0;
		int res2 = 0;

		Scanner s = new Scanner(System.in);
		n = s.nextInt();
		k = s.nextInt();

		int[] r = new int[n];

		for (int i = 0; i < n; i++) {
			r[i] = s.nextInt();
		}

		s.close();

		Arrays.sort(r);

		if (n == 2) {
			res1 = r[1] - r[0];
		}

		else if (n == k) {
			res1 = r[n - 1] - r[0];
		}

		else {
			res1 = r[k - 1] - r[0];

			for (int i = 1; i <= n - k; i++) {
				res2 = r[i + (k - 1)] - r[i];

				if (res2 < res1) {
					res1 = res2;
				}

			}

		}

		System.out.println(res1);
	}
}
