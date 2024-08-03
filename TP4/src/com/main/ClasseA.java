package com.main;

public class ClasseA {

	private ClasseB objB;
	String[] array = new String[500000];

	public ClasseA() {

		RefCirculaire.compteur++;
		System.out.println("objA "+RefCirculaire.compteur);
		objB = new ClasseB();

	}

}
