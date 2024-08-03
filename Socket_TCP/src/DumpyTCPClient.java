import java.io.BufferedReader;
import java.io.DataOutputStream;
import java.io.InputStreamReader;
import java.net.Socket;
import java.util.Scanner;

public class DumpyTCPClient {
	public static void main(String[] args) throws Exception {
//		Socket clientSocket = new Socket("localhost", 7010);

//			System.out.println("Please enter your name : ");
//			Scanner scanner = new Scanner(System.in);
//			String phrase = scanner.nextLine();
//			String phraseUpdated;
//			DataOutputStream outputStream = new DataOutputStream(clientSocket.getOutputStream());
//			BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(clientSocket.getInputStream()));
//			outputStream.writeBytes(phrase.toUpperCase());
//			phraseUpdated = bufferedReader.readLine();
//			System.out.println("Réponse du serveur: " + phraseUpdated);

		try (Socket socketClient = new Socket("localhost", 7010)) {

			DataOutputStream sortieVersServeur = new DataOutputStream(socketClient.getOutputStream());
			BufferedReader entreeDepuisServeur = new BufferedReader(
					new InputStreamReader(socketClient.getInputStream()));
			
			while (true) {
				System.out.println("Please enter your name : ");
				BufferedReader entreeDepuisUtilisateur = new BufferedReader(new InputStreamReader(System.in));
				String phrase = entreeDepuisUtilisateur.readLine();

				sortieVersServeur.writeBytes(phrase + '\n');

				String response = entreeDepuisServeur.readLine();
				System.out.println("Result : " + response);
				System.out.println("-----------------------------------");

//			socketClient.close();

			}

		}

	}

}
