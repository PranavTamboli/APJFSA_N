// Write a Java program to create an interface Shape with the getArea() method. 
// Create three classes Rectangle, Circle, and Triangle that implement the Shape interface. Implement the getArea() method for each of the three classes in java.

package com.java.programs;

//Define the Shape interface
interface Shape {
	double getArea(); // abstract method to be implemented by classes
}

//Rectangle class implementing the Shape interface
class Rectangle implements Shape {
	private double length;
	private double width;

	// Constructor
	public Rectangle(double length, double width) {
		this.length = length;
		this.width = width;
	}

	// Implement the getArea method for Rectangle
	@Override
	public double getArea() {
		return length * width;
	}
}

//Circle class implementing the Shape interface
class Circle implements Shape {
	private double radius;

	// Constructor
	public Circle(double radius) {
		this.radius = radius;
	}

	// Implement the getArea method for Circle
	@Override
	public double getArea() {
		return Math.PI * radius * radius;
	}
}

//Triangle class implementing the Shape interface
class Triangle implements Shape {
	private double base;
	private double height;

	// Constructor
	public Triangle(double base, double height) {
		this.base = base;
		this.height = height;
	}

	// Implement the getArea method for Triangle
	@Override
	public double getArea() {
		return 0.5 * base * height;
	}
}

//Main class to test the functionality
public class ShapeMain {
	public static void main(String[] args) {
		// Create an object of Rectangle and calculate area
		Shape rectangle = new Rectangle(2.0, 3.0);
		System.out.println("Rectangle Area: " + rectangle.getArea());

		// Create an object of Circle and calculate area
		Shape circle = new Circle(4.0);
		System.out.println("Circle Area: " + circle.getArea());

		// Create an object of Triangle and calculate area
		Shape triangle = new Triangle(2.0, 4.0);
		System.out.println("Triangle Area: " + triangle.getArea());
	}
}

/*
Output: 
Rectangle Area: 6.0
Circle Area: 50.26548245743669
Triangle Area: 4.0
*/

