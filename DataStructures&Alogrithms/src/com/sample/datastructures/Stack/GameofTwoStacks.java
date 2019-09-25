package com.sample.datastructures.Stack;

import java.util.Scanner;
import java.util.Stack;

public class GameofTwoStacks {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);

		Stack<Integer> s1 = new Stack<Integer>();
		Stack<Integer> s2 = new Stack<Integer>();

		int g = in.nextInt();
		for (int a0 = 0; a0 < g; a0++) {
			int n = in.nextInt();
			int m = in.nextInt();
			int x = in.nextInt();
			int[] a = new int[n];
			for (int a_i = 0; a_i < n; a_i++) {
				a[a_i] = in.nextInt();
			}
			int[] b = new int[m];
			for (int b_i = 0; b_i < m; b_i++) {
				b[b_i] = in.nextInt();
			}

			for (int h1_i = n - 1; h1_i >= 0; h1_i--) {
				s1.push(a[h1_i]);
			}

			for (int h2_i = m - 1; h2_i >= 0; h2_i--) {
				s2.push(b[h2_i]);
			}

			int total = 0;
			int tc = 0;

			if (x <= 0) {
				System.out.println(x);
			} else {
				do {
					if (s1.peek() >= s2.peek()) {
						total += s2.pop();
						tc += 1;
					}

					else {
						total += s1.pop();
						tc += 1;
					}
				} while (total + s1.peek() <= x);

			}

		}
	}
}
