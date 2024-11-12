// Write a Java Program to pass this keyword as argument in the constructor call in java
package com.java.programs;

class Person2 {
    String name;
    int age;

    // Constructor for Person class
    public Person2(String name, int age) {
        this.name = name;
        this.age = age;
        
        // Passing 'this' as an argument to the Details constructor
        Details details = new Details(this);
    }
}

class Details {
    // Constructor that takes a Person object as an argument
    public Details(Person2 person) {
        System.out.println("Name: " + person.name);
        System.out.println("Age: " + person.age);
    }
}

public class ThisKeyword {
    public static void main(String[] args) {
        // Creating a Person object
        Person2 person = new Person2("Pranav", 22);
    }
}

/*
Output:
Name: Pranav
Age: 22
*/
