package com.etu.DAO;

public class Etudiant {

	private int id;
	private String prenom;
	private String nom;
	private Filiere filiere;

	public Etudiant(int id, String prenom, String nom) {
		super();
		this.id = id;
		this.prenom = prenom;
		this.nom = nom;
	}

	public Etudiant(int id, String prenom, String nom, Filiere filiere) {
		super();
		this.id = id;
		this.prenom = prenom;
		this.nom = nom;
		this.filiere = filiere;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getPrenom() {
		return prenom;
	}

	public void setPrenom(String prenom) {
		this.prenom = prenom;
	}

	public String getNom() {
		return nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}

	public Filiere getFiliere() {
		return filiere;
	}

	public void setFiliere(Filiere filiere) {
		this.filiere = filiere;
	}

	@Override
	public String toString() {
		return "Etudiant [id=" + id + ", prenom=" + prenom + ", nom=" + nom + ", filiere=" + filiere + "]";
	}

}
