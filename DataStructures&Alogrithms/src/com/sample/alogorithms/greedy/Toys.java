package com.sample.alogorithms.greedy;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class Toys {
	public static void main(String[] args) {

		int n = 0;
		int u = 0;
		Scanner s = new Scanner(System.in);
		n = s.nextInt();
		int[] w = new int[n];
		int temp = -1;

		for (int m = 0; m < n; m++) {
			w[m] = s.nextInt();
		}

		Arrays.sort(w);

		for (int i = 0; i < n; i++) {
			if (w[i] > temp) {
				u = u + 1;
				temp = w[i] + 4;
			}
		}

		System.out.println(u);

	}
}
