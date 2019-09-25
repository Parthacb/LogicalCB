package com.sample.datastructures.string;

import java.util.Scanner;

public class Palindrome {

	public static void main(String args[]) {

		Scanner scanner = new Scanner(System.in);
		String s = scanner.nextLine();

		if (s == null) {
			System.out.println("String is empty");
		}

		StringBuilder stbr = new StringBuilder(s);
		stbr.reverse();

		if (stbr.toString().equals(s))
			System.out.println("String is Plandrome");
		else
			System.out.println("String is not Plandrome");

		scanner.close();

	}
}
