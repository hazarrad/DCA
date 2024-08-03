package com.tp;

public class Manager extends Employee {

	private int bonus;

	public Manager(String name, int basesalary, int bonus) {
		super(name, basesalary);
		this.bonus = bonus;
	}

	public int getSalary() {
		return super.getSalary() + bonus;
	}

}
