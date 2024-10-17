package ExamplePackage;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConnectionManager {

	private final static String url = "jdbc:mysql://localhost:3306/Ecole";
	private final static String username = "root";
	private final static String password = "prefab2022";

    private static Connection connection = null;

	public static Connection getConnection() {

		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			connection = DriverManager.getConnection(url, username, password);

			System.out.println("Connexion à la BD réussie!");

		} catch (SQLException e) {
			System.out.println("Error connection with DB " + e.getMessage());
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}

		return connection;

	}
}