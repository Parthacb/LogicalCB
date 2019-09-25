package com.sample.algorithms.greedy;

import java.util.Scanner;

public class GridChallenge {

	public static void main(String[] args) {

		// Array to store check whether it is lexiaclly sorted or not.
		boolean[] isLexsort = new boolean[100];
		// Variable the size of the test cases
		int gridSize = 0;
		// Two dimensional array to hold the data
		char[][] data = new char[100][100];

		// Reading number of test cases
		Scanner scanner = new Scanner(System.in);
		int notc = scanner.nextInt();
		// Temporary String value which holds each line.
		String temp = null;

		// Reading Grid Size for each test case

		for (int i = 0; i < notc; i++) {
			gridSize = scanner.nextInt();
			for (int j = 0; j < gridSize; j++) {
				temp = scanner.next();
				for (int k = 0; k < gridSize; k++) {
					data[j][k] = temp.charAt(k);
				}
			}

			data = new LinearSort().sortItLinear(data, gridSize);
			isLexsort[i] = new IsLexsorted().isLexsort(data, gridSize);
			data = null;
			data = new char[100][100];
		}

		for (int l = 0; l < notc; l++) {
			if (isLexsort[l] == true)
				System.out.println("YES");
			else
				System.out.println("NO");
		}

		scanner.close();
	}

}
