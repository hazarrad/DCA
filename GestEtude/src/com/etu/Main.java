package com.etu;

import java.util.List;

import com.etu.DAO.Etudiant;
import com.etu.DAO.EtudiantDAO;
import com.etu.DAO.Filiere;
import com.etu.DAO.FiliereDAO;
import com.etu.business.EtudiantService;
import com.etu.business.FilereService;

public class Main {

	public static void main(String[] args) {

		System.out.println("***** Gestion des �tudes Ecole *****");
		System.out.println("  ### Utilisation Architecture 3 couches (Pr�sentation, "
				+ "M�tier, Acc�s aux donn�es)- DAO-DTO -Singleton -G�n�ricit� ###");

		// Scanner sc = new Scanner(System.in);
		FiliereDAO fDAO = new FiliereDAO(); // Cr�ation de DAO
		Filiere fDTO = null; // pour stocker les objets Filiere

		FilereService filereService = new FilereService(fDAO);

		// Create Filiere
		if (fDAO.create(new Filiere("GSTR2")))
			System.out.println("Fili�re 'GSTR2' ins�r�e avec succ�s.");
		else
			System.out.println("Erreur : Fili�re 'GSTR2' non cr��e !!!");
		System.out.println();

		// Read Filiere
		System.out.print("=> Fili�re trouv�e avec no 2 : ");
		fDTO = fDAO.read(2);
		System.out.println(fDTO); // ou System.out.println(fDTO.toString());
		System.out.println();

		// Read All Filieres
		System.out.println("=> Liste des Fili�res ");
		List<Filiere> filieres = fDAO.readAll();

		for (Filiere filiere : filieres) { // parcours liste des fili�res trouv�es
			System.out.println(filiere);
		}
		System.out.println();

		// Update Filiere
		fDTO = fDAO.read(8); // sauvgarde historique si existe
		if (fDAO.update(new Filiere(8, "Smart systems & IA"))) {
			System.out.println("Fili�re (" + fDTO.getNumFiliere() + ", " + fDTO.getNomFiliere() + ") MAJ avec succ�s.");
			System.out.println("  Fili�re apres MAJ : " + fDTO);
		} else
			System.out.println("Erreur : Fili�re no 8 non MAJ !!!");
		System.out.println();

		// Delete Filiere
		fDTO = fDAO.read(5); // sauvgarde historique si existe
		if (fDAO.delete(5))
			System.out.println(
					"Fili�re (" + fDTO.getNumFiliere() + ", " + fDTO.getNomFiliere() + ") supprim�e avec succ�s.");
		else
			System.out.println("Erreur : Fili�re no 5 non supprim�e !!!");

		Filiere item = filereService.searchByName("GC3g");
		if (item != null) {
			System.out.println("Item Found : " + item);
		} else {
			System.out.println("No element found with this name ");

		}

		// Ajouter ici le test pour les requ�tes DAO Etudiant en s'inspirant du code
		// ci-dessous
		// N.B. : L'object Etudiant encapsule un objet Filiere

		int idEtu = 42;
		// Scanner sc = new Scanner(System.in);
		EtudiantDAO eDAO = new EtudiantDAO(); // Cr�ation de DAO
		Etudiant eDTO = null; // pour stocker les objets Etudiant

		EtudiantService etudiantService = new EtudiantService(eDAO);

		// Create Filiere
		if (eDAO.create(new Etudiant(idEtu, "Hassan", "test")))
			System.out.println("Etudiant 'Hassan' ins�r�e avec succ�s.");
		else
			System.out.println("Erreur : Etudiant 'Hassan' non cr��e !!!");
		System.out.println();

		// Read Filiere
		System.out.print("=> Etudiant trouv�e avec no " + idEtu);
		eDTO = eDAO.read(27);
		System.out.println(eDTO); // ou System.out.println(eDTO.toString());
		System.out.println();

		// Read All Filieres
		System.out.println("=> Liste des Etudiants ");
		List<Etudiant> etudiants = eDAO.readAll();

		for (Etudiant etudiant : etudiants) { // parcours liste des Etudiants trouv�es
			System.out.println(etudiant);
		}
		System.out.println();

		// Update Filiere
		eDTO = eDAO.read(43); // sauvgarde historique si existe
		if (eDAO.update(new Etudiant(43, "Hassan", "ZARRAD"))) {
			System.out.println("Etudiant (" + eDTO.getId() + ", " + eDTO.getNom() + ", " + eDTO.getPrenom()
					+ ") MAJ avec succ�s.");
			System.out.println("  Etudiant apres MAJ : " + eDTO);
		} else
			System.out.println("Erreur : Etudiant no 43 non MAJ !!!");
		System.out.println();

		// Delete Filiere
		eDTO = eDAO.read(44); // sauvgarde historique si existe
		if (eDAO.delete(44))
			System.out.println("Etudiant (" + eDTO.getId() + ", " + eDTO.getNom() + ", " + eDTO.getPrenom()
					+ ") supprim�e avec succ�s.");
		else
			System.out.println("Erreur : Etudiant no 44 non supprim�e !!!");

		Etudiant itemEtu = etudiantService.searchByName("Hassan");
		if (itemEtu != null) {
			System.out.println("Item Found : " + itemEtu);
		} else {
			System.out.println("No element found with this name ");

		}
	}
}
