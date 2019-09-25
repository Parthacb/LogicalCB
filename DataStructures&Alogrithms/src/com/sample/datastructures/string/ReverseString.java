package com.sample.datastructures.string;

import java.util.Scanner;

public class ReverseString {

	public static void main(String args[]) {
		Scanner scanner = new Scanner(System.in);
		String s = scanner.nextLine();

		String reverse = "";

		for (int i = s.length() - 1; i >= 0; i--) {
			reverse = reverse + s.charAt(i);
		}

		System.out.println(reverse);

		scanner.close();
	}

}
