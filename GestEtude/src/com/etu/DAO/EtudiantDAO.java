package com.etu.DAO;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class EtudiantDAO implements IDAO<Etudiant> { // Pour les opérations CRUD Etudiant

	private static final Connexion con = Connexion.getInstance();

	private static final String REQ_CREATE = "INSERT INTO Etudiant (nomEtudiant) VALUES (?)";
	private static final String REQ_READ = "SELECT * FROM Etudiant WHERE numEtudiant=?";
	private static final String REQ_READ_ALL = "SELECT * FROM Etudiant";
	private static final String REQ_UPDATE = "UPDATE Etudiant SET nomEtudiant=? WHERE numEtudiant=?";
	private static final String REQ_DELETE = "DELETE FROM Etudiant WHERE numEtudiant=?";

	@Override
	public boolean create(Etudiant EtudiantDTO) {
		PreparedStatement ps = null;
		try {
			ps = con.getConnection().prepareStatement(REQ_CREATE);
			ps.setString(1, EtudiantDTO.getNom());
			ps.setString(2, EtudiantDTO.getPrenom());

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
	public Etudiant read(Object numEtudiant) {
		PreparedStatement ps = null;
		ResultSet rs = null;

		try {
			ps = (con.getConnection()).prepareStatement(REQ_READ, ResultSet.TYPE_SCROLL_INSENSITIVE,
					ResultSet.CONCUR_READ_ONLY);
			ps.setInt(1, (int) numEtudiant); // Cast explicite de Object vers int
			rs = ps.executeQuery();

			if (rs.first()) // 1er enregistrement
				return new Etudiant(rs.getInt(1), rs.getString(2), rs.getString(3));
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
	public List<Etudiant> readAll() {
		PreparedStatement ps = null;
		ResultSet rs = null;
		List<Etudiant> Etudiants = new ArrayList<Etudiant>();

		try {
			// N.B.: On peut utiliser createStatement au lieu de prepareStatement vue la non
			// existance de param
			ps = con.getConnection().prepareStatement(REQ_READ_ALL, ResultSet.TYPE_SCROLL_INSENSITIVE,
					ResultSet.CONCUR_READ_ONLY);
			rs = ps.executeQuery();

			while (rs.next()) // Parcours ResultSet
				Etudiants.add(new Etudiant(rs.getInt(1), rs.getString(2), rs.getString(3)));
			return Etudiants;
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
		return Etudiants;
	}

	@Override
	public boolean update(Etudiant etudiantDTO) {
		PreparedStatement ps = null;
		try {
			ps = con.getConnection().prepareStatement(REQ_UPDATE);
			ps.setInt(1, etudiantDTO.getId());
			ps.setString(2, etudiantDTO.getNom());
			ps.setString(3, etudiantDTO.getPrenom());

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
	public boolean delete(Object numEtudiant) {
		PreparedStatement ps = null;
		try {
			ps = con.getConnection().prepareStatement(REQ_DELETE);
			ps.setInt(1, (int) numEtudiant);

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