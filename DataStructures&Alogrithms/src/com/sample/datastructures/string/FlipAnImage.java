package com.sample.datastructures.string;

public class FlipAnImage {

	public static void main(String args[]) {

		int[][] A = { { 1, 1, 0 }, { 1, 0, 1 }, { 0, 0, 0 } };
		// int [][] A = {0};

		if (A.length == 1) {

		}

		for (int i = 0; i < A.length; i++) {
			if (A[i].length % 2 == 0) {
				int k = 0;
				int temp;
				for (int j = A[i].length - 1; j >= A[i].length / 2; j--) {
					temp = A[i][k];
					A[i][k] = A[i][j];
					A[i][j] = temp;
					if (A[i][k] == 0)
						A[i][k] = 1;
					else
						A[i][k] = 0;
					if (A[i][j] == 0)
						A[i][j] = 1;
					else
						A[i][j] = 0;
					k++;
				}
			}

			if (A[i].length % 2 != 0) {
				int l = 0;
				int tempnew;
				for (int m = A[i].length - 1; m > A[i].length / 2; m--) {
					tempnew = A[i][l];
					A[i][l] = A[i][m];
					A[i][m] = tempnew;
					if (A[i][m] == 0)
						A[i][m] = 1;
					else
						A[i][m] = 0;
					if (A[i][l] == 0)
						A[i][l] = 1;
					else
						A[i][l] = 0;
					l++;
				}
			}

		}

	}

}
