
public class Application {

	public static void main(String[] args) {

		CompteBancaire cb1 = new CompteBancaire(123456789);
		cb1.deposerArgent(100);
		cb1.retirerArgent(80);

		CompteBancaire cb2 = new CompteBancaire(987654321);
		cb2.retirerArgent(10);

		String s = Journalisation.getInstance().afficherLog();
		System.out.println(s);
	}
}
