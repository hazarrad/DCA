import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;

public class DumpyUDP {
    public static void main(String[] args) throws Exception {
        DatagramSocket serverSocket = new DatagramSocket(9886);
        System.out.println(" le port 9886...");
        byte[] donneeRecue = new byte[1024];
        byte[] donneeEnvoyee = new byte[1024];

        while (true) {
            DatagramPacket paquetRecu = new DatagramPacket(donneeRecue, donneeRecue.length);
            serverSocket.receive(paquetRecu);

            String phrase = new String(paquetRecu.getData(), 0, paquetRecu.getLength());
            InetAddress adresseIP = paquetRecu.getAddress();
            int port = paquetRecu.getPort();
            String phraseMajuscule = phrase.toUpperCase();
            donneeEnvoyee = phraseMajuscule.getBytes();

            DatagramPacket paquetEnvoye = new DatagramPacket(donneeEnvoyee, donneeEnvoyee.length, adresseIP, port);
            serverSocket.send(paquetEnvoye);
        }
    }
}
