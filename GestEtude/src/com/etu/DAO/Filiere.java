package com.etu.DAO;

public class Filiere {

	private int numFiliere;
	private String nomFiliere;

	public Filiere() {
		super();
	}

	public Filiere(int numFiliere, String nomFiliere) {
		super();
		this.numFiliere = numFiliere;
		this.nomFiliere = nomFiliere;
	}

	public Filiere(String nomFiliere) {
		this.nomFiliere = nomFiliere;
	}

	public int getNumFiliere() {
		return numFiliere;
	}

	public void setNumFiliere(int numFiliere) {
		this.numFiliere = numFiliere;
	}

	public String getNomFiliere() {
		return nomFiliere;
	}

	public void setNomFiliere(String nomFiliere) {
		this.nomFiliere = nomFiliere;
	}

	@Override
	public String toString() {
		return "Filiere [numFiliere=" + numFiliere + ", nomFiliere=" + nomFiliere + "]";
	}

}
