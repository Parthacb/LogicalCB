package com.sample.alogorithms.greedy;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;

public class Orders3 {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int n = s.nextInt();

		List<order> orders = new ArrayList<>();

		for (int i = 0; i < n; i++) {
			int t = s.nextInt();
			int d = s.nextInt();
			int id = i + 1; // assign each order an ID based on it's position in the initial input, so we
							// know where they were after soring
			order o = new order(t, d, id);
			orders.add(o);
		}
		// sort list by total time
		Collections.sort(orders, new totalComparator());
		// print the initial position of each order after they are sorted
		for (order o : orders) {
			System.out.print(o.id + " ");
		}
	}

	// simple order object
	static class order {
		int t;
		int d;
		int id;
		int total;// total time for each order

		public order(int t, int d, int id) {
			this.t = t;
			this.d = d;
			this.id = id;
			total = t + d;
		}
	}

	// comparator to compare the orders by total time for each order
	static class totalComparator implements Comparator<order> {
		@Override
		public int compare(order o1, order o2) {
			return o1.total - o2.total;
		}
	}

}
