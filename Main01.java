package com.codegnan.oop.overloading;

public class Main01 {

	public static void main(String[] args) {
		Employee_01 e1 = new Employee_01("Alice", 30000);
        e1.calculateSalary();

        
        Manager01 m1 = new Manager01("Bob", 50000);
        m1.calculateSalary();
        m1.calculateSalary(10000); 
        m1.calculateSalary(10000, 5000);
    

	}

}
