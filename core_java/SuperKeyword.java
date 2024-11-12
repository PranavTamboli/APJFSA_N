// Write a Java program  to invoke parent class constructor using super keyword.
package com.java.programs;

// Parent Class
class Parent{
	String name;
	int age;

	// Parent class constructor
	public Parent(String name, int age){
		this.name = name;
		this.age = age;
		System.out.println("This is parent Constructor");
	}
}

// Child Class
class Child extends Parent{

	int EmpId;
	double salary;

	// Child class constructor
	public Child(String name, int age, int empId, double salary){
		super(name, age);
		this.EmpId = empId;
		this.salary = salary;
		System.out.println("This is child Constructor");
	}
	//	Method to display child details
	public void display(){
		System.out.println("Name: " +name);
		System.out.println("Age: " +age);
		System.out.println("EmpId: " +EmpId);
		System.out.println("Salary: " +salary);
	}
}

public class SuperKeyword {
	public static void main(String[]args) {
		//		Displaying child object
		Child c = new Child("pranav",22,50,20.00);
		c.display();
	}
}

/*
Output: 
This is parent Constructor
This is child Constructor
Name: pranav
Age: 22
EmpId: 50
Salary: 20.0
 */
