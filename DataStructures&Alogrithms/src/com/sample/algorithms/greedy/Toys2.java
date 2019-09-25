package com.sample.algorithms.greedy;

import java.util.Scanner;

public class Toys2 {

	public static void main(String[] args) {

		int n = 0;
		int u = 0;
		Scanner s = new Scanner(System.in);
		n = s.nextInt();

		boolean[] r = new boolean[n];

		for (int i = 0; i < n; i++) {
			if (i == s.nextInt()) {
				r[i] = true;
			}
		}

		for (int j = 0; j < n; j++) {
			if (r[j] == true) {

			}
		}

		s.close();

	}

}
