package com.codegnan.oop.overriding;

public class Main1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Employee emp1 = new FullTimeEmployee("Alice", 50000);
		Employee emp2 = new PartTimeEmployee("Bob", 300, 20);
		Employee emp3 = new ContractEmployee("Charlie", 80000);
		// Displaying details
		emp1.display();
		System.out.println("Salary: ₹" + emp1.calculateSalary());
		System.out.println();
		emp2.display();
		System.out.println("Salary: ₹" + emp2.calculateSalary());
		System.out.println();
		emp3.display();
		System.out.println("Salary: ₹" + emp3.calculateSalary());

	}

}
