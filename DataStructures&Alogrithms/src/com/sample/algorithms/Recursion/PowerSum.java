package com.sample.algorithms.Recursion;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class PowerSum {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int x = scan.nextInt();
		int n = scan.nextInt();
		ArrayList<Integer> list = new ArrayList<Integer>();
		for (int i = 1; i <= Math.pow(x, 1.0 / ((double) n)); i++) {
			list.add((int) Math.pow(i, n));
		}
		System.out.println(powerSum(x, list, 0));
		scan.close();
	}

	public static int powerSum(int x, List<Integer> list, int index) {
		if (x == 0)
			return 1;
		if (index == list.size())
			return 0;
		int count = 0;

		count += powerSum(x, list, index + 1);
		count += powerSum(x - list.get(index), list, index + 1);

		return count;
	}

}
