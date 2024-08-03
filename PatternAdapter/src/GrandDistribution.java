
public class GrandDistribution implements Utilisateur {

	private String nom;

	public GrandDistribution(String nom) {

		this.nom = nom;
	}

	@Override
	public void AfficherUtilisateur() {

		System.out.println("User nom : " + nom);

	}

}
