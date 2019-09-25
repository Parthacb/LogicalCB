package com.sample.datastructures.string;

import java.io.*;
import java.util.*;

/* Implement your classes here. Do not use access modifiers in your class declarations. */

class Circle {

	public float radius;

	Circle(float radius) {
		this.radius = radius;
	}

	public int getArea() {

		return (int) (3.14159265 * radius * radius);

	}

}

class Rectangle {
	public float height, width;

	Rectangle(float height, float width) {
		height = this.height;
		width = this.width;
	}

	public int getArea() {
		int area;
		area = (int) (height * width);
		return area;
	}
}

class Square {
	public float width;

	Square(float width) {
		width = this.width;
	}

	public int getArea() {
		int area;
		area = (int) (width * width);
		return area;
	}
}

public class Solutionnew {
	public static void main(String[] args) throws NumberFormatException, IOException {
		Scanner sc = new Scanner(System.in);

		float radius = Float.parseFloat(sc.nextLine());
		Circle c1 = new Circle(radius);
		System.out.println(c1.getArea());

		float width = sc.nextFloat();
		float height = sc.nextFloat();
		Rectangle r1 = new Rectangle(width, height);
		System.out.println(r1.getArea());
		sc.nextLine();

		radius = Float.parseFloat(sc.nextLine());
		Circle c2 = new Circle(radius);
		System.out.println(c2.getArea());

		width = Float.parseFloat(sc.nextLine());
		Square s1 = new Square(width);
		System.out.println(s1.getArea());

		width = sc.nextFloat();
		height = sc.nextFloat();
		Rectangle r2 = new Rectangle(width, height);
		System.out.println(r2.getArea());

		sc.close();
	}
}
