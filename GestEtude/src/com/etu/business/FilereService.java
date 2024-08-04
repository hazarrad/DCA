package com.etu.business;

import java.util.List;

import com.etu.DAO.Filiere;
import com.etu.DAO.FiliereDAO;

public class FilereService {

	FiliereDAO filiereDAO;; // = new FiliereDAO();

	public FilereService(FiliereDAO filiereDAO) {
		this.filiereDAO = filiereDAO;
	}

	public Filiere searchByName(String nom) {

		List<Filiere> filieres = filiereDAO.readAll();

		for (Filiere filiere : filieres) {
			if (filiere.getNomFiliere().equals(nom)) {
				return filiere;
			}
		}

		return null;

	}
}
