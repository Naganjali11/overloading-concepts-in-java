package com.codegnan.oop.overloading;

import java.util.Scanner;

public class EmployeeInfo extends Employee01 {
	double salaryPerYear;
	public EmployeeInfo() {
		super("","",0);	
	}
	public void inputEmployeeDetails() {
		@SuppressWarnings("resource")
		Scanner scanner=new Scanner(System.in);
		System.out.println("Enter Employee Name:");
		employeeName=scanner.next();
		System.out.println("Enter Employee Designation:");
		designation=scanner.next();
		System.out.println("Enter Years of Experince:");
		yearsOfExperince=scanner.nextInt();
		System.out.println("Enter Salary Per Year:");
		salaryPerYear=scanner.nextDouble();
		
	}
	public void displayEmployeeInfo() {
		System.out.println("Employee Name : "+employeeName);
		System.out.println("Designation : "+designation);
		System.out.println("Years of Experience:"+yearsOfExperince);
		
	}
	public void calculateSalary() {
		double salary=salaryPerYear*yearsOfExperince;
		System.out.println("Salary :"+salary);
	}
	

}
