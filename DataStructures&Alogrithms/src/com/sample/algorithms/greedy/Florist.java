package com.sample.algorithms.greedy;

import java.util.Arrays;
import java.util.Scanner;

public class Florist {

	public static void main(String[] args) {

		int n = 0;
		byte k = 0;
		int ans = 0;

		Scanner s = new Scanner(System.in);
		n = s.nextInt();
		k = s.nextByte();

		int[] r = new int[n];

		for (int i = 0; i < n; i++) {
			r[i] = s.nextInt();
		}

		Arrays.sort(r);

		if (n <= k) {
			for (int j = n - 1; j >= 0; j--)
				ans = ans + r[j];
		}

		else {
			for (int j = n - 1; j >= n - k; j--) {
				ans = ans + r[j];
			}

			int m = 2;
			int y = n - k;
			for (int l = y - 1; l >= 0; l--) {
				ans = ans + m * r[l];
				m++;
			}

		}

		System.out.println(ans);

		s.close();

	}

}
