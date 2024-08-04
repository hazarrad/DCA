package com.etu.DAO;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class FiliereDAO implements IDAO<Filiere> { // Pour les opérations CRUD Filiere

	private static final Connexion con = Connexion.getInstance();

	private static final String REQ_CREATE = "INSERT INTO Filiere (nomFiliere) VALUES (?)";
	private static final String REQ_READ = "SELECT * FROM Filiere WHERE numFiliere=?";
	private static final String REQ_READ_ALL = "SELECT * FROM Filiere";
	private static final String REQ_UPDATE = "UPDATE Filiere SET nomFiliere=? WHERE numFiliere=?";
	private static final String REQ_DELETE = "DELETE FROM Filiere WHERE numFiliere=?";

	@Override
	public boolean create(Filiere filiereDTO) {
		PreparedStatement ps = null;
		try {
			ps = con.getConnection().prepareStatement(REQ_CREATE);
			ps.setString(1, filiereDTO.getNomFiliere());

			if (ps.executeUpdate() > 0)
				return true;
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			try {
				if (!ps.isClosed())
					ps.close();
			} catch (Exception e2) {
				e2.printStackTrace();
			}
			con.closeConnection();
		}
		return false;
	}

	@Override
	public Filiere read(Object numFiliere) {
		PreparedStatement ps = null;
		ResultSet rs = null;

		try {
			ps = (con.getConnection()).prepareStatement(REQ_READ, ResultSet.TYPE_SCROLL_INSENSITIVE,
					ResultSet.CONCUR_READ_ONLY);
			ps.setInt(1, (int) numFiliere); // Cast explicite de Object vers int
			rs = ps.executeQuery();

			if (rs.first()) // 1er enregistrement
				return new Filiere(rs.getInt(1), rs.getString(2));
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			try {
				if (rs != null)
					rs.close();
				if (!ps.isClosed())
					ps.close();
			} catch (SQLException e2) {
				e2.printStackTrace();
			}
			con.closeConnection();
		}
		return null;
	}

	@Override
	public List<Filiere> readAll() {
		PreparedStatement ps = null;
		ResultSet rs = null;
		List<Filiere> filieres = new ArrayList<Filiere>();

		try {
			// N.B.: On peut utiliser createStatement au lieu de prepareStatement vue la non
			// existance de param
			ps = con.getConnection().prepareStatement(REQ_READ_ALL, ResultSet.TYPE_SCROLL_INSENSITIVE,
					ResultSet.CONCUR_READ_ONLY);
			rs = ps.executeQuery();

			while (rs.next()) // Parcours ResultSet
				filieres.add(new Filiere(rs.getInt(1), rs.getString(2)));
			return filieres;
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			try {
				if (rs != null)
					rs.close();
				if (ps != null)
					ps.close();
			} catch (SQLException e2) {
				e2.printStackTrace();
			}
			con.closeConnection();
		}
		return filieres;
	}

	@Override
	public boolean update(Filiere filiereDTO) {
		PreparedStatement ps = null;
		try {
			ps = con.getConnection().prepareStatement(REQ_UPDATE);
			ps.setString(1, filiereDTO.getNomFiliere());
			ps.setInt(2, filiereDTO.getNumFiliere());

			if (ps.executeUpdate() > 0) // si la MAJ est effectuée
				return true;
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			try {
				if (ps != null)
					ps.close();
			} catch (SQLException e2) {
				e2.printStackTrace();
			}
			con.closeConnection();
		}
		return false;
	}

	@Override
	public boolean delete(Object numFiliere) {
		PreparedStatement ps = null;
		try {
			ps = con.getConnection().prepareStatement(REQ_DELETE);
			ps.setInt(1, (int) numFiliere);

			if (ps.executeUpdate() > 0) // Si la suppression est effectuée
				return true;
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			try {
				if (ps != null)
					ps.close();
			} catch (SQLException e2) {
				e2.printStackTrace();
			}
			con.closeConnection();
		}
		return false;
	}
}