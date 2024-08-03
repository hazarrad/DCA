package com.tp;

import java.time.LocalDate;

public class Student extends Person {

	private String studentNumber;

	public Student(String name, String surname, LocalDate birthdate, String studentNumber) {
		super(name, surname, birthdate);
		this.studentNumber = studentNumber;
	}

	public String getNumEtu() {
		return studentNumber;
	}

}
