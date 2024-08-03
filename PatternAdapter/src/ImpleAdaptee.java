
public class ImpleAdaptee {

	private String nom;
	private String poste;

	public ImpleAdaptee(String nom, String poste) {
		this.nom = nom;
		this.poste = poste;
	}

	public void AfficherNom() {
		System.out.println("Employee Nom :" + nom);
	}

	public void AfficherPoste() {
		System.out.println("Employee Poste : " + poste);

	}
}
