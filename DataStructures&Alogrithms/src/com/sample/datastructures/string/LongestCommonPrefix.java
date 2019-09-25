package com.sample.datastructures.string;

public class LongestCommonPrefix {

	public static void main(String args[]) {
		String[] strs = { "flower", "flow", "flight" };

		int numberOfStrings = strs.length;
		String outputCommonString = "";

		int j = 0;
		int k = 0;
		if (numberOfStrings > 1) {
			while (j < strs[0].length() && k < strs[1].length()) {
				if (strs[0].charAt(j) == strs[1].charAt(k)) {
					outputCommonString = outputCommonString + strs[0].charAt(j);
				}

				else {
					break;
				}
				k++;
				j++;
			}
			int l;
			if (numberOfStrings > 2) {
				for (l = 2; l < numberOfStrings; l++)

				{
					int m;

					for (m = outputCommonString.length() - 1; m >= 0; m--) {
						if (strs[l].contains(outputCommonString)) {
							break;
						} else {
							outputCommonString = outputCommonString.substring(0, m);
						}
					}

				}
			}

		}
		if (numberOfStrings == 1)
			System.out.println(strs[0]);
		else
			System.out.println(outputCommonString);

	}

}
