package com.sample.datastructures.Array;

import java.util.Scanner;

public class findElement {

	/*
	 * Complete the function below.
	 */

	public static void main(String[] args) {

		Scanner s = new Scanner(System.in);
		int n = s.nextInt();
		int[] arr = new int[n];
		for (int i = 0; i < n; i++) {
			arr[i] = s.nextInt();
		}

		int k = s.nextInt();
		int checkCounter = 0;

		for (int j = 0; j < n; j++) {
			if (k == arr[j]) {
				checkCounter = 1;
				break;

			}
		}

		if (checkCounter == 0)
			System.out.println("NO");

		else
			System.out.println("YES");

	}

}
