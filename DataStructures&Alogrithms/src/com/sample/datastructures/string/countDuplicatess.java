package com.sample.datastructures.string;

import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

class Result {

	/*
	 * Complete the 'countDuplicates' function below.
	 *
	 * The function is expected to return an INTEGER. The function accepts
	 * INTEGER_ARRAY numbers as parameter.
	 */

	public static int countDuplicates(List<Integer> numbers) {
		// Write your code here

		int totalCount = 0;

		for (int i = 0; i < numbers.size(); i++) {
			for (int j = i + 1; j < numbers.size(); j++) {

				if (numbers.get(i) == numbers.get(j)) {
					totalCount = totalCount + 1;
				}

			}
		}
		return totalCount;

	}

}

public class countDuplicatess {
	public static void main(String[] args) throws IOException {
		BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

		int numbersCount = Integer.parseInt(bufferedReader.readLine().trim());

		List<Integer> numbers = new ArrayList<>();

		for (int i = 0; i < numbersCount; i++) {
			int numbersItem = Integer.parseInt(bufferedReader.readLine().trim());
			numbers.add(numbersItem);
		}

		int result = Result.countDuplicates(numbers);

		bufferedWriter.write(String.valueOf(result));
		bufferedWriter.newLine();

		bufferedReader.close();
		bufferedWriter.close();
	}
}
