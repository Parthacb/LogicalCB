package com.sample.algorithms.Recursion;

public class recursion {
	public static void main(String[] args) {
		recursion p = new recursion();
		p.perms(4, "");
	}

	public void perms(int remaining, String res) {
		if (remaining > 0) {
			perms(remaining - 1, res + "1");
			System.out.println(res);
		}
	}
}
