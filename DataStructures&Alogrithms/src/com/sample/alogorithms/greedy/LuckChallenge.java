package com.sample.alogorithms.greedy;

import java.util.Scanner;

public class LuckChallenge {

	public static void main(String[] args) {

		int[][] data = new int[101][2];
		String r[] = new String[3];
		int luck = 0;
		int totalimpcontests = 0;
		int[] implucks = new int[101];
		int temp;

		Scanner s = new Scanner(System.in);

		r = s.nextLine().split("\\s+");

		data[0][0] = Integer.parseInt(r[0]);
		data[0][1] = Integer.parseInt(r[1]);

		for (int i = 1; i <= data[0][0]; i++) {
			r = s.nextLine().split("\\s+");

			data[i][0] = Integer.parseInt(r[0]);
			data[i][1] = Integer.parseInt(r[1]);
		}

		s.close();

		for (int j = 1; j <= data[0][0]; j++) {
			if (data[j][1] == 0)
				luck = luck + data[j][0];
			else {
				totalimpcontests = totalimpcontests + 1;
				implucks[totalimpcontests - 1] = data[j][0];
			}
		}

		if (totalimpcontests <= data[0][1]) {
			for (int p = totalimpcontests; p >= 0; p--) {
				luck = luck + implucks[p];
			}
			System.out.println(luck);
		}

		else {
			for (int k = totalimpcontests - 1; k >= 0; k--) {
				for (int l = 0; l <= k - 1; l++) {
					if (implucks[l] > implucks[l + 1]) {
						temp = implucks[l + 1];
						implucks[l + 1] = implucks[l];
						implucks[l] = temp;
					}

				}
			}

			int q = totalimpcontests - 1;

			for (int m = 1; m <= data[0][1]; m++) {
				luck = luck + implucks[q];
				q--;
			}

			for (int n = 0; n <= q; n++) {
				luck = luck - implucks[n];
			}

			System.out.println(luck);
		}
	}

}
