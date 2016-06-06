package com.java.CC;
//练习题面向对象2
public class TestCircle1 {
	public static void main(String[] args) {
		PassObject area = new PassObject();
		Circle c = new Circle();
		area.printAreas(c, 5);
		System.out.println(" now radius is: " + c.getRadius());
	}
}

class Circle {
	double radius;

	public double findArea() {
		return Math.PI * radius * radius;
	}

	public void setRadius(double r) {
		radius = r;
	}

	public double getRadius() {
		return radius;
	}
}

class PassObject {
	public void printAreas(Circle c, int time) {
		System.out.println("Radius" + "\t\t" + "Area");
		int temp = 0;
		for (int i = 1; i <= time; i++, temp = i) {
			c.setRadius(i);
			System.out.println(c.getRadius() + "\t\t" + c.findArea());
		}
		c.setRadius(temp);
	}
}