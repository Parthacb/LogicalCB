package com.sample.datastructures.string;

import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class AlternatingCharacters {

	// Complete the alternatingCharacters function below.
	static int alternatingCharacters(String s) {

		int nod = 0;
		int i = 0;

		while (i < s.length()) {
			if (s.charAt(i) == 'A') {
				while (s.charAt(++i) != 'B') {
					nod++;

				}

				i = nod;
			}

			if (s.charAt(i) == 'B') {
				while (s.charAt(++i) != 'A') {
					nod++;

				}

				i = nod;
			}

			i++;

		}

		return nod;

	}

	private static final Scanner scanner = new Scanner(System.in);

	public static void main(String[] args) throws IOException {
		BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

		int q = scanner.nextInt();
		scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

		for (int qItr = 0; qItr < q; qItr++) {
			String s = scanner.nextLine();

			int result = alternatingCharacters(s);

			bufferedWriter.write(String.valueOf(result));
			bufferedWriter.newLine();
		}

		bufferedWriter.close();

		scanner.close();
	}
}
