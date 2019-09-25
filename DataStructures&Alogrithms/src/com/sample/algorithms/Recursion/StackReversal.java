package com.sample.algorithms.Recursion;

import java.util.Stack;

public class StackReversal {

	public static void reverseStack(Stack<Integer> stack) {
		if (stack.isEmpty())
			return;
		Integer temp = stack.pop();
		reverseStack(stack);
		insertAtBottom(stack, temp);

	}

	private static void insertAtBottom(Stack<Integer> stack, Integer data) {
		if (stack.isEmpty()) {
			stack.push(data);
			return;
		}

		Integer temp = stack.pop();
		insertAtBottom(stack, data);
		stack.push(data);

	}

}
