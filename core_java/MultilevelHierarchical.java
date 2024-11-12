// Create a program in java to implement multilevel inheritance and hierarchical inheritance .

//Take classes like : Doctor , Surgeon and Nurse

//Create methods and show method overriding in java

package com.java.programs;

//Base class: Doctor
class Doctor {
	// Method to display information about a doctor
	public void work() {
		System.out.println("Doctor is working.");
	}

	// Method to display the specialization of the doctor
	public void specialization() {
		System.out.println("Doctor has a medical degree.");
	}
}

//Derived class: Surgeon for multilevel inheritance
class Surgeon extends Doctor {
	// Overriding the work method to provide specific behavior for a Surgeon
	@Override
	public void work() {
		System.out.println("Surgeon is performing surgery.");
	}

	// Additional method specific to Surgeon
	public void surgeryType() {
		System.out.println("Surgeon specializes in performing surgeries.");
	}
}

//Derived class: Nurse for Hierarchical inheritance
class Nurse extends Doctor {
	// Overriding the work method to provide specific behavior for a Nurse
	@Override
	public void work() {
		System.out.println("Nurse is assisting the doctor and caring for patients.");
	}

	// Additional method specific to Nurse
	public void patientCare() {
		System.out.println("Nurse is providing care to the patients.");
	}
}

//Main class to test the inheritance
public class MultilevelHierarchical {
	public static void main(String[] args) {
		// Creating objects of each class
		Doctor doctor = new Doctor();
		Surgeon surgeon = new Surgeon();
		Nurse nurse = new Nurse();

		// Calling methods from the Doctor class
		System.out.println("Doctor:");
		doctor.work();
		doctor.specialization();
		System.out.println();

		// Calling methods from the Surgeon class 
		System.out.println("Surgeon:");
		surgeon.work(); // Overridden method
		surgeon.specialization();
		surgeon.surgeryType();
		System.out.println();

		// Calling methods from the Nurse class 
		System.out.println("Nurse:");
		nurse.work(); // Overridden method
		nurse.specialization();
		nurse.patientCare();
	}
}

/*
Output:
Doctor:
Doctor is working.
Doctor has a medical degree.

Surgeon:
Surgeon is performing surgery.
Doctor has a medical degree.
Surgeon specializes in performing surgeries.

Nurse:
Nurse is assisting the doctor and caring for patients.
Doctor has a medical degree.
Nurse is providing care to the patients.
*/

