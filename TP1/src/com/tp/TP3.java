package com.tp;

import java.time.LocalDate;

public class TP3 {

	public static void main(String[] args) {

		// ex1
		Person person = new Person("test", "test", LocalDate.parse("1998-11-11"));
		Student student = new Student("hassan", "test", LocalDate.parse("1998-11-11"), "1050");
		System.out.println("Age " + person.getAge());
		System.out.println("Number " + student.getNumEtu());
		System.out.println("\n*****************************");

		// ex2
		Employee[] employees = new Employee[2];
		employees[0] = new Employee("John Doe", 1200);
		employees[1] = new Manager("Jack Malone", 1700, 500);
		for (Employee e : employees) {
			String title = e instanceof Manager ? "Manager" : "Employe";
			System.out.println(title + " : " + e.getSalary());
		}
	}
}
