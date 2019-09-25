package com.sample.datastructures.string;

import java.io.*;
import java.util.*;

class Resultone {

	public static int numDuplicates(List<String> name, List<Integer> price, List<Integer> weight) {

		int totalDuplicates = 0;
		int j = 0;
		int i = 0;

		while (!name.isEmpty()) {
			j = 0;
			i = j + 1;
			while (i < name.size()) {
				if (name.get(j).equals(name.get(i)) && price.get(j).equals(price.get(i))
						&& weight.get(j).equals(weight.get(i))) {
					totalDuplicates++;
					name.remove(i);
					price.remove(i);
					weight.remove(i);
					i--;
				}
				i++;
			}

			name.remove(j);
			price.remove(j);
			weight.remove(j);

		}
		return totalDuplicates;

	}

}

public class Solution {
	public static void main(String[] args) throws IOException {

		BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

		int nameCount = Integer.parseInt(bufferedReader.readLine().trim());

		List<String> name = new ArrayList<>();

		for (int i = 0; i < nameCount; i++) {
			String nameItem = bufferedReader.readLine();
			name.add(nameItem);
		}

		int priceCount = Integer.parseInt(bufferedReader.readLine().trim());

		List<Integer> price = new ArrayList<>();

		for (int i = 0; i < priceCount; i++) {
			int priceItem = Integer.parseInt(bufferedReader.readLine().trim());
			price.add(priceItem);
		}

		int weightCount = Integer.parseInt(bufferedReader.readLine().trim());

		List<Integer> weight = new ArrayList<>();

		for (int i = 0; i < weightCount; i++) {
			int weightItem = Integer.parseInt(bufferedReader.readLine().trim());
			weight.add(weightItem);
		}

		int result = Resultone.numDuplicates(name, price, weight);

		System.out.print(result);
		bufferedReader.close();

	}
}
