import java.io.BufferedReader;
import java.io.DataOutputStream;
import java.io.InputStreamReader;
import java.net.Socket;
import java.util.Scanner;


public class DumpyUDPClient {
	public static void main(String[] args) throws Exception {
		Socket clientSocket = new Socket("localhost", 9886);

		while (true) {
			System.out.println("Please enter your name : ");
			Scanner scanner = new Scanner(System.in);
			String phrase = scanner.nextLine();
			String phraseUpdated;
			DataOutputStream outputStream = new DataOutputStream(clientSocket.getOutputStream());
			BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(clientSocket.getInputStream()));
			outputStream.writeBytes(phrase.toUpperCase());
			phraseUpdated =bufferedReader.readLine();
			System.out.println("Réponse du serveur: " + phraseUpdated);
			System.out.println("-----------------------------------");
		}

	}

//	public static void main(String[] args) throws Exception {
//		DatagramSocket clientSocket = new DatagramSocket();
//		InetAddress serveurAdresse = InetAddress.getByName("localhost");
//		int serveurPort = 9886;
//
//		while (true) {
//			System.out.println("Please enter your name : ");
//			Scanner scanner = new Scanner(System.in);
//			String phrase = scanner.nextLine();
//
//			byte[] donneeEnvoyee = phrase.getBytes();
//
//			DatagramPacket paquetEnvoye = new DatagramPacket(donneeEnvoyee, donneeEnvoyee.length, serveurAdresse,
//					serveurPort);
//			clientSocket.send(paquetEnvoye);
//
//			byte[] donneeRecue = new byte[1024];
//			DatagramPacket paquetRecu = new DatagramPacket(donneeRecue, donneeRecue.length);
//			clientSocket.receive(paquetRecu);
//
//			String phraseMajuscule = new String(paquetRecu.getData(), 0, paquetRecu.getLength());
//			System.out.println("Réponse du serveur: " + phraseMajuscule);
//			System.out.println("-----------------------------------");
//		}
//
//	}
}
