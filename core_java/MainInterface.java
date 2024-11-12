// Create an interface called "Person" with a method called "speak". 
// Create two classes  called "Student" and "Teacher" that implement  the Person interface and implement the "speak" method. 
// Create objects of both the Student and  Teacher classes and call their respective "speak"  methods in java
package com.java.programs;

//Define the Person interface
interface Person {
	void speak();// abstract method to be implemented by classes
}

//Implement the Person interface in the Student class
class Student implements Person {
	@Override
	public void speak() {
		System.out.println("Student is speaking");
	}
}

//Implement the Person interface in the Teacher class
class Teacher implements Person {

	@Override
	public void speak() {
		System.out.println("Teacher is Teaching");
	}
}

//Main class to test the functionality
public class MainInterface {
	public static void main(String[] args) {
		// Create an object of Student and call the speak method
		Person student = new Student();
		student.speak();

		// Create an object of Teacher and call the speak method
		Person teacher = new Teacher();
		teacher.speak();
	}
}

/*
Output:
Student is speaking
Teacher is Teaching
 */