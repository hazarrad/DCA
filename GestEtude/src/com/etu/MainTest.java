package com.etu;
//package com.etu;
//
//import java.sql.Connection;
//import java.sql.DriverManager;
//import java.sql.PreparedStatement;
//import java.sql.ResultSet;
//import java.sql.SQLException;
//import java.sql.Statement;
//
//import com.etu.DAO.Connexion;
//import com.etu.DAO.Filiere;
//
//public class Main {
//
//	private final static String datasourceUrl = "jdbc:mysql://localhost:3306/Ecole";
//	private final static String datasourceUsername = "root";
//	private final static String datasourcePassword = "prefab2022";
//	private final static String datasourcePilote = "com.mysql.cj.jdbc.Driver";
//
//	public static void main(String[] args) {
//
//		System.out.println("**** Gestion des étude Ecole ****");
//
//		Connection con = null;
//		Statement stm = null;
//		PreparedStatement prdStm = null;
//		ResultSet rs = null;
//
//		try {
//			// connection à la BD
//			con = DriverManager.getConnection(datasourceUrl, datasourceUsername, datasourcePassword);
//			System.out.println("Connexion à la DB réussie.");
//
//			String requete = "SELECT idEtu, nomEtu, nomFiliere FROM Etudiant e JOIN filiere f on e.numFiliere = f.numFiliere;";
//			stm = con.createStatement();
//			rs = stm.executeQuery(requete);
//
//			System.out.println("Id Etudiant | Nom Etudiant | Nom Filière");
//			while (rs.next()) {
//				System.out.println(rs.getInt(1) + " | " + rs.getString(2) + " | " + rs.getString(3));
//			}
//		} catch (SQLException e) {
//			System.out.println(e.getMessage());
//			e.printStackTrace();
//			System.out.println("Connexion à la BD NON Réusssie!!!");
//		} finally {
//			try {
//				if (!stm.isClosed())
//					stm.close();
//				if (!prdStm.isClosed())
//					prdStm.close();
//				if (!rs.isClosed())
//					rs.close();
//				if (!con.isClosed())
//					con.close();
//			} catch (SQLException e2) {
//				System.out.println(e2.getMessage());
//			}
//		}
//	}
//}
