package com.etu.business;

import java.util.List;

import com.etu.DAO.Etudiant;
import com.etu.DAO.EtudiantDAO;

public class EtudiantService {

	EtudiantDAO etudiantDAO;;

	public EtudiantService(EtudiantDAO etudiantDAO) {
		this.etudiantDAO = etudiantDAO;
	}

	public Etudiant searchByName(String nom) {

		List<Etudiant> etudiants = etudiantDAO.readAll();

		for (Etudiant etudiant : etudiants) {
			if (etudiant.getNom().equals(nom)) {
				return etudiant;
			}
		}

		return null;	

	}
}
