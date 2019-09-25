package com.sample.datastructures.string;

public class IsStringHasAllUniqueCharacters {

	public static void main(String args[]) {

		String s = "ca%men%";

		boolean[] char_set = new boolean[128];
		boolean isUnique = true;

		if (s.length() > 128) {
			isUnique = false;
		}

		for (int i = 0; i < s.length(); i++) {
			int val = s.charAt(i);
			if (char_set[val])
				isUnique = false;

			char_set[val] = true;
		}

		System.out.println("Is String has all unique characters : " + isUnique);

	}

}
