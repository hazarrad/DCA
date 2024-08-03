package com.etu;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class TestConnectionInfMySQL5 {

	private final static String datasourceUrl = "jdbc:postgresql://localhost:5432/Ecole";
	private final static String datasourceUsername = "postgres";
	private final static String datasourcePassword = "prefab2022";
	private final static String datasourcePilote = "com.mysql.cj.jdbc.Driver";

	public static void main(String[] args) {

		try {
			// Connexion à la base de données MySQL
			// Chargement du pilote de la base de données MySQL
			Class.forName(datasourcePilote);
			Connection con = DriverManager.getConnection(datasourceUrl, datasourceUsername, datasourcePassword);

			System.out.println("Connexion à la BD réussie.");
		} catch (SQLException e) {
			// En cas d'une erreur de connexion à la base de données
			// Traiter l’erreur ici, par exemple System.out.println("Erreur connexion BD
			// !");
			System.out.println(e.getMessage());
			e.printStackTrace();
		} catch (ClassNotFoundException e) {// obligatoire pour Class.forName("...")
			// En cas d'une erreur dans le chargement du Driver
			// Traiter l’erreur ici, par exemple System.out.println("Le driver est
			// introuvable!");
			System.out.println(e.getMessage());
			e.printStackTrace();
		}
	}
}
