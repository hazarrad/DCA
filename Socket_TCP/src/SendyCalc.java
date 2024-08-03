import java.io.BufferedReader;
import java.io.DataOutputStream;
import java.io.InputStreamReader;
import java.net.Socket;

public class SendyCalc {
    public static void main(String argv[]) throws Exception {
        String operation, resultat;
        double operande1,operande2 ;
                
        BufferedReader entreeDepuisUtilisateur = new BufferedReader(new InputStreamReader(System.in));
        Socket socketClient = new Socket("localhost", 7011);
        DataOutputStream sortieVersServeur = new DataOutputStream(socketClient.getOutputStream());
        BufferedReader entreeDepuisServeur = new BufferedReader(new InputStreamReader(socketClient.getInputStream()));
        
        System.out.print("Entrez l'opération mathématique (+, -, *, /) : ");
        operation = entreeDepuisUtilisateur.readLine();
        System.out.print("Entrez le premier opérande : ");
        operande1 = Double.parseDouble(entreeDepuisUtilisateur.readLine());
        System.out.print("Entrez le deuxième opérande : ");
        operande2 = Double.parseDouble(entreeDepuisUtilisateur.readLine());
        
        sortieVersServeur.writeBytes(operation + " " + operande1 + " " + operande2 + '\n');
        
        resultat = entreeDepuisServeur.readLine();
        System.out.println("Résultat de l'opération : " + resultat);
        
        socketClient.close();
    }
}


