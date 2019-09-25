package com.sample.alogorithms.greedy;

import java.util.Arrays;
import java.util.Scanner;

public class Orders {

	public static void main(String[] args) {

		int n = 0;
		int v = 0;

		Scanner s = new Scanner(System.in);
		n = s.nextInt();

		int[] r = new int[n];
		int[] u = new int[n];

		for (int i = 0; i < n; i++) {
			int t = s.nextInt();
			int d = s.nextInt();
			r[i] = t + d;
			u[i] = t + d;
		}

		s.close();
		Arrays.sort(r);

		for (int j = 0; j < n; j++) {
			v = r[j];
			for (int k = 0; k < n; k++) {
				if (v == u[k]) {
					System.out.print(k + 1 + " ");
					break;
				}
			}

		}

	}

}
