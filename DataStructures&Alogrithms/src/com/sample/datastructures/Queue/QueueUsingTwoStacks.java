package com.sample.datastructures.Queue;

import java.util.Scanner;
import java.util.Stack;

public class QueueUsingTwoStacks {

	public static void main(String[] args) throws IllegalStateException {

		Stack<Integer> s1 = new Stack<Integer>();
		Stack<Integer> s2 = new Stack<Integer>();

		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		int choice = 0;
		int x = 0;

		for (int h_i = 0; h_i < n; h_i++) {

			choice = in.nextInt();
			if (choice == 1) {
				x = in.nextInt();
				s1.push(x);
			}

			if (choice == 2) {
				if (s1.isEmpty() && s2.isEmpty()) {
					throw new IllegalStateException("Queue is empty: under flow");
				}
				if (s2.isEmpty()) {
					while (!s1.isEmpty()) {
						s2.push(s1.pop());
					}
				}

				s2.pop();
			}

			if (choice == 3) {
				if (s1.isEmpty() && s2.isEmpty()) {
					throw new IllegalStateException("Queue is empty: under flow");
				}

				if (s2.isEmpty()) {
					while (!s1.isEmpty()) {
						s2.push(s1.pop());
					}
				}

				System.out.println(s2.peek());

			}

		}

		in.close();

	}
}
