package com.sample.datastructures.trees;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

import com.sample.datastructures.trees.Node;

public class LevelOrderTraversal {

	LevelOrderTraversal(Node root) {
		// TODO Auto-generated method stub

		if (root == null)
			System.out.print(" ");
		Queue<Node> q = new LinkedList<Node>();
		q.offer(root);
		q.offer(null);

		ArrayList<Integer> al = new ArrayList<Integer>();

		while (!q.isEmpty()) {
			Node tmp = q.poll();

			if (tmp != null) {
				al.add(tmp.data);
				if (tmp.left != null)
					q.offer(tmp.left);
				if (tmp.right != null)
					q.offer(tmp.right);
			}

			else {
				for (Integer i : al)
					System.out.print(i + " ");
				al.clear();
				if (!q.isEmpty())
					q.offer(null);
			}

		}

	}

}
