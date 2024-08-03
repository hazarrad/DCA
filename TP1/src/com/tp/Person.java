package com.tp;

import java.time.LocalDate;
import java.time.Period;

public class Person {

	private String name;
	private String surname;
	private LocalDate birthdate;

	public Person(String name, String surname, LocalDate birthdate) {
		this.name = name;
		this.surname = surname;
		this.birthdate = birthdate;
	}

	public int getAge() {
		return Period.between(birthdate, LocalDate.now()).getYears();
	}

}
