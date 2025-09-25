package com.codegnan.oop.overriding;
//Full-time employee class
public class FullTimeEmployee extends Employee {
	double monthlySalary;
	FullTimeEmployee(String name, double monthlySalary) {
		super(name);
		this.monthlySalary = monthlySalary;
	}
	@Override
	double calculateSalary() {
		return monthlySalary;
	}
}

