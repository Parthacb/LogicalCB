package com.sample.algorithms.greedy;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Florist2 {

	public static void main(String[] args) {

		/*
		 * Enter your code here. Read input from STDIN. Print output to STDOUT. Your
		 * class should be named Solution.
		 */
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int m = sc.nextInt();
		int sum = 0;
		ArrayList<Integer> array = new ArrayList<>();
		for (int i = 0; i < n; i++)
			array.add(sc.nextInt());
		Collections.sort(array);
		Collections.reverse(array);

		int j = 0;

		for (int i = 0; i < n; i++) {
			// sum+=((int)i/m+1)*array.get(i);

			j = (int) i / m;
			j = j + 1;
			sum = sum + (j * array.get(i));
		}

		System.out.println(sum);

	}

}
