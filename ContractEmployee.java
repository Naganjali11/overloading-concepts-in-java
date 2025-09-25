package com.codegnan.oop.overriding;

	public class ContractEmployee extends Employee {
		double contractAmount;
		ContractEmployee(String name, double contractAmount) {
			super(name);
			this.contractAmount = contractAmount;
		}
		@Override
		double calculateSalary() {
			return contractAmount;
		}


}
