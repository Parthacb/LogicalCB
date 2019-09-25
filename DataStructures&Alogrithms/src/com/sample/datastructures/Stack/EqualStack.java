package com.sample.datastructures.Stack;

import java.util.Scanner;
import java.util.Stack;

public class EqualStack {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int n1 = in.nextInt();
		int n2 = in.nextInt();
		int n3 = in.nextInt();
		int h1[] = new int[n1];

		int t1 = 0;
		int t2 = 0;
		int t3 = 0;

		Stack<Integer> s1 = new Stack<Integer>();
		Stack<Integer> s2 = new Stack<Integer>();
		Stack<Integer> s3 = new Stack<Integer>();

		for (int h1_i = 0; h1_i < n1; h1_i++) {
			h1[h1_i] = in.nextInt();
			t1 += h1[h1_i];
		}
		int h2[] = new int[n2];
		for (int h2_i = 0; h2_i < n2; h2_i++) {
			h2[h2_i] = in.nextInt();
			t2 += h2[h2_i];
		}
		int h3[] = new int[n3];
		for (int h3_i = 0; h3_i < n3; h3_i++) {
			h3[h3_i] = in.nextInt();
			t3 += h3[h3_i];
		}

		for (int h1_i = n1 - 1; h1_i >= 0; h1_i--) {
			s1.push(h1[h1_i]);
		}

		for (int h2_i = n2 - 1; h2_i >= 0; h2_i--) {
			s2.push(h2[h2_i]);
		}

		for (int h3_i = n3 - 1; h3_i >= 0; h3_i--) {
			s3.push(h3[h3_i]);
		}

		while (!s1.isEmpty() && !s2.isEmpty() && !s3.isEmpty()) {
			if (t1 == t2 && t2 == t3) {
				System.out.println(t1);
				break;
			}

			if (t1 >= t2 && t1 >= t3) {
				t1 = t1 - s1.pop();
			}

			else if (t2 >= t3 && t2 >= t1) {
				t2 = t2 - s2.pop();
			}

			else if (t3 >= t1 && t3 >= t2) {
				t3 = t3 - s3.pop();
			}

		}

		if (s1.isEmpty() || s2.isEmpty() || s3.isEmpty()) {
			System.out.println("0");
		}

		in.close();

	}

}
