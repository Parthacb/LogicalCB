package com.sample.datastructures.string;

import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class Nofas {

	// Complete the repeatedString function below.
	static long repeatedString(String s, long n) {

		long totalas = n / s.length();
		long rmngas = n % s.length();
		// Char a="a";
		int nofas = 0;
		int rofas = 0;
		for (int i = 0; i < s.length(); i++) {
			if (s.charAt(i) == 'a') {
				nofas = nofas + 1;
			}
		}

		totalas = totalas * nofas;

		for (int j = 0; j < rmngas; j++) {
			if (s.charAt(j) == 'a') {
				rofas = rofas + 1;
			}
		}

		totalas = totalas + rofas;

		return totalas;

	}

	private static final Scanner scanner = new Scanner(System.in);

	public static void main(String[] args) throws IOException {
		// BufferedWriter bufferedWriter = new BufferedWriter(new
		// FileWriter(System.getenv("OUTPUT_PATH")));

		String s = scanner.nextLine();

		long n = scanner.nextLong();
		scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

		long result = repeatedString(s, n);

		System.out.print(result);

		scanner.close();
	}
}
