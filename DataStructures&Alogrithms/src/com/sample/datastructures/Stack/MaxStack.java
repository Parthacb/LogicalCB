package com.sample.datastructures.Stack;

import java.util.Scanner;
import java.util.Stack;

public class MaxStack {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();

		Stack<Integer> mainStack = new Stack<Integer>();
		Stack<Integer> maxStack = new Stack<Integer>();

		for (int i = 0; i <= n; i++) {
			int l = in.nextInt();

			if (l == 1) {
				int m = in.nextInt();
				mainStack.push(m);
				if (maxStack.isEmpty() || m >= maxStack.peek())
					maxStack.push(m);

			}

			if (l == 2) {
				if (!mainStack.isEmpty()) {
					int m = mainStack.pop();
					if (!(m < maxStack.peek()) && !maxStack.isEmpty()) {
						maxStack.pop();
					}
				}

			}

			if (l == 3) {
				System.out.println(maxStack.peek());
			}

		}

		in.close();

	}

}
