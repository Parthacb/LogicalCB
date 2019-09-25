package com.sample.algorithms.greedy;

import java.util.Arrays;
import java.util.Scanner;

public class cupcake {

	public static void main(String[] args) {

		byte n = 0;
		long miles = 0;
		Scanner s = new Scanner(System.in);
		n = s.nextByte();

		short[] r = new short[n];

		for (int i = 0; i < n; i++) {
			r[i] = s.nextShort();
		}

		Arrays.sort(r);

		miles = (long) (r[n - 1] * Math.pow(2, 0));

		int k = 1;

		for (int j = n - 2; j >= 0; j--) {
			miles = (long) (miles + (r[j] * Math.pow(2, k)));
			k = k + 1;
		}

		System.out.println(miles);

	}

}
