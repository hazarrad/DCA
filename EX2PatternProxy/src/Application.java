import java.util.Scanner;

public class Application {

	public static void main(String[] args) {

		Client client = new Client();

		Scanner sc = new Scanner(System.in);
		System.out.println("Put your codeClient : ");
		String codeClient = sc.nextLine();
		System.out.println("Put your codeDossier : ");
		String codeDossier = sc.nextLine();
		client.setIdossier(new DossierProxy(codeDossier, codeClient));
		client.process();
		sc.close();
	}
}
