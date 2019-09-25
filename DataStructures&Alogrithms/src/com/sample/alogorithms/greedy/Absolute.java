package com.sample.alogorithms.greedy;

import java.util.Arrays;
import java.util.Scanner;

public class Absolute {

	public static void main(String[] args) {

		int n = 0;
		Scanner s = new Scanner(System.in);
		n = s.nextInt();
		long dif1 = 0;
		long dif2 = 0;

		long[] r = new long[n];

		for (int i = 0; i < n; i++) {
			r[i] = s.nextLong();
		}

		Arrays.sort(r);

		dif1 = r[1] - r[0];

		if (Math.signum(dif1) == -1.0) {
			dif1 *= -1;
		}

		for (int j = 1; j < n - 1; j++) {
			dif2 = r[j + 1] - r[j];

			if (Math.signum(dif1) == -1.0) {
				dif1 *= -1;
			}

			if (dif2 < dif1) {
				dif1 = dif2;
			}

		}

		System.out.println(dif1);

	}
}
