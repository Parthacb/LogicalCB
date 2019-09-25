package com.sample.alogorithms.greedy;

public class LinearSort {

	public char[][] sortItLinear(char[][] sortData, int s) {
		char temp;

		for (int l = 0; l < s; l++) {
			for (int m = s - 1; m >= 0; m--) {

				for (int n = 0; n < m; n++) {
					if (sortData[l][n] > sortData[l][n + 1]) {
						temp = sortData[l][n];
						sortData[l][n] = sortData[l][n + 1];
						sortData[l][n + 1] = temp;
					}
				}

			}

		}

		return sortData;

	}

}
