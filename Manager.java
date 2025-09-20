package com.codegnan.oop.overloading;

public class Manager extends Employee {
	String department;
	public Manager(String name,double salary,String department) {
		this.name=name;
		this.salary=salary;
		this.department=department;
	}
	public void displayDetails() {
		System.out.println("Manager Details");
		System.out.println("Name:"+name);
		System.out.println("Salary:"+salary);
		System.out.println("Department:"+department);
	}
	

}
