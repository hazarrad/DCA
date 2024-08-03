
public class CompteBancaire {

	private int numero;
	private double solde;

	public CompteBancaire(int numero) {
		this.numero = numero;
		this.solde = 0;
	}

	public void deposerArgent(double depot) {
		if (depot > 0) {
			solde += depot;
			Journalisation.getInstance().ajouterLog("Deposit of " + depot + "MAD on the account " + numero + ".");
		} else {
			Journalisation.getInstance().ajouterLog("/!\\ Deposit of a negative value impossible (" + numero + ").");
		}
	}

	public void retirerArgent(double retrait) {
		if (retrait > 0) {
			if (solde >= retrait) {
				solde -= retrait;
				Journalisation.getInstance().ajouterLog("Withdrawal from " + retrait + "MAD on the account " + numero + ".");
			} else {
				Journalisation.getInstance().ajouterLog("/!\\ The bank does not authorize overdrafts (" + numero + ").");
			}
		} else {
			Journalisation.getInstance().ajouterLog("/!\\ Withdrawal a negative value impossible (" + numero + ").");
		}
	}

}
