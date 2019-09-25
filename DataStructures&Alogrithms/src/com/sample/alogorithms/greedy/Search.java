package com.sample.alogorithms.greedy;

import java.util.Scanner;

public class Search {

	public static void main(String[] args) {

		int v = 0;
		int n = 0;

		Scanner s = new Scanner(System.in);
		v = s.nextInt();

		n = s.nextInt();

		int[] r = new int[n];

		for (int i = 0; i < n; i++) {
			r[i] = s.nextInt();
		}

		for (int j = 0; j < n; j++) {
			if (v == r[j]) {
				System.out.println(j);
				break;
			}
		}

	}

}
