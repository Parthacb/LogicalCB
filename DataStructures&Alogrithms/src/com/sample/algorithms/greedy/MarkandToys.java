package com.sample.algorithms.greedy;

import java.util.Arrays;
import java.util.Scanner;

public class MarkandToys {

	public static void main(String[] args) {

		int n = 0;
		int k = 0;

		int t = 0;
		int u = 0;

		Scanner s = new Scanner(System.in);
		n = s.nextInt();
		k = s.nextInt();

		int[] r = new int[n];

		for (int i = 0; i < n; i++) {
			r[i] = s.nextInt();
		}

		s.close();

		Arrays.sort(r);

		for (int j = 0; j < n; j++) {
			if (k >= r[j]) {
				u++;
				k -= r[j];
			}

			else {
				break;
			}
		}

		System.out.println(u);

	}

}
