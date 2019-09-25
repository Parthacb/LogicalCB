package com.sample.algorithms.DynamicProgramming;

import java.math.BigInteger;
import java.util.Scanner;

public class Fibonaccimodified {

	public static void main(String[] args) {

		int t1 = 0;
		int t2 = 0;
		int n = 0;
		Scanner s = new Scanner(System.in);

		t1 = s.nextInt();
		t2 = s.nextInt();
		n = s.nextInt();

		s.close();

		BigInteger[] r = new BigInteger[n];

		if (n == 3)
			System.out.println(t1 + t2 * t2);
		else {
			r[0] = BigInteger.valueOf(t1);
			r[1] = BigInteger.valueOf(t2);
			for (int i = 2; i < n; i++) {
				r[i] = r[i - 2].add(r[i - 1].multiply(r[i - 1]));
			}

			System.out.println(r[n - 1]);

		}

	}

}
