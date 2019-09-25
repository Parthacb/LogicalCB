package com.sample.datastructures.Stack;

import java.util.Scanner;
import java.util.Stack;

public class LargestRectangle {

	static long largestRectangle(int[] h) {

		Stack<Integer> s = new Stack<Integer>();

		if (h == null || h.length == 0)
			return 0;
		long maxArea = 0;
		int i = 0;

		while (i < h.length) {
			if (s.isEmpty() || h[s.peek()] <= h[i])
				s.push(i++);
			else {
				int top = s.pop();
				maxArea = Math.max(maxArea, h[top] * (s.isEmpty() ? i : i - s.peek() - 1));
			}
		}

		while (!s.isEmpty()) {
			int top = s.pop();
			maxArea = Math.max(maxArea, h[top] * (s.isEmpty() ? i : i - s.peek() - 1));
		}
		// Complete this function
		return maxArea;
	}

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		int[] h = new int[n];
		for (int h_i = 0; h_i < n; h_i++) {
			h[h_i] = in.nextInt();
		}
		long result = largestRectangle(h);
		System.out.println(result);
		in.close();
	}

}
