package com.codegnan.oop.overloading;

public class Manager01 extends Employee_01{
	
    public Manager01(String name, double basicSalary) {
		super(name, basicSalary);
		
	}
	
	public void calculateSalary(double bonus) {
        System.out.println("Total Salary (Basic + Bonus): " + (basicSalary + bonus));
    }
	public void calculateSalary(double bonus, double allowance) {
        System.out.println("Total Salary (Basic + Bonus + Allowance): " + (basicSalary + bonus + allowance));
    }

	
}
