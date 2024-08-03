import java.net.DatagramPacket;
import java.net.DatagramSocket;

public class serverUDP {
	public static void main(String argv[]) throws Exception {

		byte[] donneRecue = new byte[1024];
		byte[] donneEnvoyee = new byte[1024];

		String operation;
		double resultat;

		try (DatagramSocket serverSocket = new DatagramSocket(7011)) {
			System.out.println("Serveur prêt à recevoir des opérations.");
			while (true) {
				DatagramPacket packetRecu = new DatagramPacket(donneRecue, donneEnvoyee.length);
				serverSocket.receive(packetRecu);

				operation = new String(packetRecu.getData());
				resultat = calculerOperation(operation);

				DatagramPacket packetEnvoye = new DatagramPacket(String.valueOf(resultat).getBytes(),
						donneEnvoyee.length, packetRecu.getAddress(), packetRecu.getPort());
				serverSocket.send(packetEnvoye);
				serverSocket.close();
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
