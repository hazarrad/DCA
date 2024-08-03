package com.main;

public class ClasseB {

	public ClasseA objA;
	String[] array = new String[500000];

	public ClasseB() {
		RefCirculaire.compteur++;
		System.out.println("objB "+RefCirculaire.compteur);
		objA = new ClasseA();
	}

}
