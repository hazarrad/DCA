package com.etu.DAO;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

// class singleton 
public final class Connexion {

	private static Connexion instance = null;

	private final String url = "jdbc:mysql://localhost:3306/Ecole";
	private final String username = "root";
	private final String password = "xxxxxxx";

	private Connection connection = null;

	private Connexion() {

		try {

			connection = DriverManager.getConnection(url, username, password);
			System.out.println("Connexion à la BD réussie!");

		} catch (SQLException e) {
			System.out.println("Error connection with DB " + e.getMessage());
			e.printStackTrace();
		}

	}

	public Connection getConnection() {
		return connection;
	}

	public static Connexion getInstance() {

		if (instance == null)
			synchronized (Connexion.class) {
				if (instance == null)
					instance = new Connexion();
			}
		return instance;
	}

	public void closeConnection() {

		try {
			if (!connection.isClosed()) {
				connection.close();
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

	@Override
	public String toString() {
		return "Connection []";
	}

	public String getUrl() {
		return url;
	}

	public String getUsername() {
		return username;
	}

	public String getPassword() {
		return password;
	}

}
