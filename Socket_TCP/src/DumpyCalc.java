
import java.io.BufferedReader;
import java.io.DataOutputStream;
import java.io.InputStreamReader;
import java.net.ServerSocket;
import java.net.Socket;

public class DumpyCalc {
	public static void main(String argv[]) throws Exception {
		String operation;
		double resultat;

		try (ServerSocket serveur = new ServerSocket(7011)) {
			System.out.println("Serveur prêt à recevoir des opérations.");
			while (true) {
				Socket socketClient = serveur.accept();
				BufferedReader entreeDepuisClient = new BufferedReader(
						new InputStreamReader(socketClient.getInputStream()));
				DataOutputStream sortieVersClient = new DataOutputStream(socketClient.getOutputStream());

				operation = entreeDepuisClient.readLine();
				resultat = calculerOperation(operation);

				sortieVersClient.writeBytes(Double.toString(resultat) + '\n');

				socketClient.close();
			}
			
		}
		
	}

	private static double calculerOperation(String operation) {

		String[] parties = operation.split(" ");
		double resultat = 0;

		if (parties.length != 3) {
			System.out.println("Opération invalide.");
			return 0;
		}

		double operande1;
		double operande2;
		String operateur;
		operateur = parties[0];
		operande1 = Double.parseDouble(parties[1]);
		operande2 = Double.parseDouble(parties[2]);

		// System.out.println(operateur+" " + operande1 + " "+ operande2);

		switch (operateur) {
		case "+":
			resultat = operande1 + operande2;
			break;
		case "-":
			resultat = operande1 - operande2;
			break;
		case "*":
			resultat = operande1 * operande2;
			break;
		case "/":
			if (operande2 != 0)
				resultat = operande1 / operande2;
			else
				System.out.println("Division par zéro.");
			break;
		default:
			System.out.println("Opérateur invalide.");
			break;
		}

		return resultat;
	}
}
