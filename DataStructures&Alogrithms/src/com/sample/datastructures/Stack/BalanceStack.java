package com.sample.datastructures.Stack;

import java.util.Scanner;
import java.util.Stack;

public class BalanceStack {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		String s;
		Stack<Character> sp = new Stack<Character>();
		boolean[] resultArray = new boolean[n];

		for (int y = 0; y < n; y++) {
			resultArray[y] = true;
		}

		for (int i = 0; i < n; i++) {
			s = in.next();

			if (s == null || s.length() == 0) {
				resultArray[i] = true;
			}

			int k = s.length();

			for (int j = 0; j < k; j++) {
				if ((s.charAt(j) == '{') || (s.charAt(j) == '[') || (s.charAt(j) == '(')) {
					sp.push(s.charAt(j));
				} else {
					if (s.charAt(j) == '}' && !sp.isEmpty()) {
						if (!(sp.peek() == '{')) {
							resultArray[i] = false;

						}

						sp.pop();
					}

					if (s.charAt(j) == ']' && !sp.isEmpty()) {
						if (!(sp.peek() == '[')) {
							resultArray[i] = false;
						}

						sp.pop();
					}

					if (s.charAt(j) == ')' && !sp.isEmpty()) {
						if (!(sp.peek() == '(')) {
							resultArray[i] = false;
						}

						sp.pop();
					}
				}

			}

		}

		for (int z = 0; z < n; z++) {
			if (resultArray[z] == false) {
				System.out.println("NO");
			}

			else {
				System.out.println("YES");
			}
		}

		in.close();

	}

}
