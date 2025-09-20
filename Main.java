package com.codegnan.oop.overloading;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Employee emp1=new Manager("Alice",90000,"HR");
		emp1.displayDetails();
		Employee emp2=new Developer("Naganjali",50000,"java");
		emp2.displayDetails();

	}

}
