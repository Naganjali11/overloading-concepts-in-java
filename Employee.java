package com.codegnan.oop.overriding;

public abstract class Employee {
	String name;
	Employee(String name) {
		this.name = name;
	}
	// Abstract method
	abstract double calculateSalary();
	// Concrete method
	void display() {
		System.out.println("Employee Name: " + name);
	}
}



