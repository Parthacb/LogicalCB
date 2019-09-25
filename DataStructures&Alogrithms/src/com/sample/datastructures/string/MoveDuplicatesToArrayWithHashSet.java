package com.sample.datastructures.string;

import java.util.HashSet;
import java.util.Iterator;

public class MoveDuplicatesToArrayWithHashSet {

	public static void main(String[] args) {
		int[] arr = { 1, 3, 2, 4, 1, 3, 1 };

		HashSet<Integer> set = new HashSet<Integer>();

		for (int i = 0; i < arr.length; i++) {
			set.add(arr[i]);
		}

		for (int i = 0; i < arr.length; i++) {

		}

		Iterator<Integer> itr = set.iterator();

		while (itr.hasNext()) {
			System.out.println(itr.next());
		}

	}

}
