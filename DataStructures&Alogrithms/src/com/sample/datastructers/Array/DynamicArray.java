package com.sample.datastructers.Array;

import java.util.ArrayList;
import java.util.Scanner;

public class DynamicArray {

	public static void main(String[] args) {

		int nos, noq, v, x, y, la;
		Scanner s = new Scanner(System.in);
		nos = s.nextInt();
		noq = s.nextInt();

		la = 0;
		ArrayList<ArrayList<Integer>> outer = new ArrayList<ArrayList<Integer>>();

		for (int i = 0; i < nos; i++) {
			outer.add(new ArrayList<Integer>());
		}

		for (int i = 0; i < noq; i++) {
			v = s.nextInt();
			x = s.nextInt();
			y = s.nextInt();

			if (v == 1) {
				int index = (x ^ la) % nos;
				outer.get(index).add(y);

			} else if (v == 2) {
				int index = (x ^ la) % nos;
				int value = y % outer.get(index).size();
				la = outer.get(index).get(value);
				System.out.println(la);

			}
		}

	}

}
