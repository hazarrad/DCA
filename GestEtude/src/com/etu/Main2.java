package com.etu;

import java.util.List;

import com.etu.DAO.Filiere;
import com.etu.DAO.FiliereDAO;
import com.etu.business.FilereService;

public class Main2 {

	public static void main(String[] args) {

		System.out.println("***** Gestion des études Ecole *****");
		System.out.println("  ### Utilisation Architecture 3 couches (Présentation, "
				+ "Métier, Accès aux données)- DAO-DTO -Singleton -Généricité ###");

		// Scanner sc = new Scanner(System.in);
		FiliereDAO fDAO = new FiliereDAO(); // Création de DAO
		Filiere fDTO = null; // pour stocker les objets Filiere

		FilereService filereService = new FilereService(fDAO);

		// Create Filiere
		if (fDAO.create(new Filiere("GSTR2")))
			System.out.println("Filière 'GSTR2' insérée avec succès.");
		else
			System.out.println("Erreur : Filière 'GSTR2' non créée !!!");
		System.out.println();

		// Read Filiere
		System.out.print("=> Filière trouvée avec no 2 : ");
		fDTO = fDAO.read(2);
		System.out.println(fDTO); // ou System.out.println(fDTO.toString());
		System.out.println();

		// Read All Filieres
		System.out.println("=> Liste des Filières ");
		List<Filiere> filieres = fDAO.readAll();

		for (Filiere filiere : filieres) { // parcours liste des filières trouvées
			System.out.println(filiere);
		}
		System.out.println();

		// Update Filiere
		fDTO = fDAO.read(8); // sauvgarde historique si existe
		if (fDAO.update(new Filiere(8, "Smart systems & IA"))) {
			System.out.println("Filière (" + fDTO.getNumFiliere() + ", " + fDTO.getNomFiliere() + ") MAJ avec succès.");
			System.out.println("  Filière apres MAJ : " + fDTO);
		} else
			System.out.println("Erreur : Filière no 8 non MAJ !!!");
		System.out.println();

		// Delete Filiere
		fDTO = fDAO.read(5); // sauvgarde historique si existe
		if (fDAO.delete(5))
			System.out.println(
					"Filière (" + fDTO.getNumFiliere() + ", " + fDTO.getNomFiliere() + ") supprimée avec succès.");
		else
			System.out.println("Erreur : Filière no 5 non supprimée !!!");

		Filiere item = filereService.searchByName("GC3g");
		if (item != null) {
			System.out.println("Item Found : " + item);
		} else {
			System.out.println("No element found with this name ");

		}

		// Ajouter ici le test pour les requêtes DAO Etudiant en s'inspirant du code
		// ci-dessous
		// N.B. : L'object Etudiant encapsule un objet Filiere

	}
}
