package com.codegnan.oop.overloading;

public class Employee_01 {
	String name;
	double basicSalary;
public Employee_01(String name,double basicSalary) {
	this.name=name;
	this.basicSalary=basicSalary;
	
}
public void calculateSalary() {
    System.out.println("Basic Salary: " + basicSalary);
}

}
