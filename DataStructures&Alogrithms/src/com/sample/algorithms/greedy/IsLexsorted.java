package com.sample.algorithms.greedy;

public class IsLexsorted {

	public boolean isLexsort(char[][] checkLex, int s) {
		boolean isLexsort = true;

		for (int i = 0; i < s; i++) {
			for (int j = 0; j < s - 1; j++) {
				if (checkLex[j + 1][i] < checkLex[j][i]) {
					isLexsort = false;
					break;
				}
			}
			if (isLexsort == false)
				break;
		}
		return isLexsort;
	}

}
