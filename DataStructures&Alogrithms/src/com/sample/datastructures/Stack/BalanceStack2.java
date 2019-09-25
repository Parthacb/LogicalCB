package com.sample.datastructures.Stack;

import java.util.Scanner;
import java.util.Stack;

public class BalanceStack2 {

	static String isBalanced(String s) {

		Stack<Character> sp = new Stack<Character>();

		if (s == null || s.length() == 0) {
			return "YES";
		}
		for (int j = 0; j < s.length(); j++) {
			if (s.charAt(j) == '}') {
				if (!sp.isEmpty() && sp.peek() == '{')
					sp.pop();
				else
					return "NO";
			}

			else if (s.charAt(j) == ']') {
				if (!sp.isEmpty() && sp.peek() == '[')
					sp.pop();
				else
					return "NO";
			}

			else if (s.charAt(j) == ')') {
				if (!sp.isEmpty() && sp.peek() == '(')
					sp.pop();
				else
					return "NO";
			}

			else {
				sp.push(s.charAt(j));

			}
		}

		if (sp.isEmpty())
			return "YES";
		else
			return "NO";

	}

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int t = in.nextInt();
		for (int a0 = 0; a0 < t; a0++) {
			String s = in.next();
			String result = isBalanced(s);
			System.out.println(result);
		}
		in.close();
	}

}
