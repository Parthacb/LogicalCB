package com.sample.algorithms.Recursion;

import java.util.Stack;

public class Mainone {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Stack<Integer> stack = new Stack<Integer>();
		stack.push(6);
		stack.push(2);
		stack.push(3);
		stack.push(4);

		StackReversal sr = new StackReversal();
		sr.reverseStack(stack);

		System.out.println(stack.pop());
		System.out.println(stack.pop());
		System.out.println(stack.pop());
		System.out.println(stack.pop());

	}

}
