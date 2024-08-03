
public class Plat extends ComposantDeMenu {

	protected double prix;

	public Plat(String nom, double prix) {
		super(nom);
		this.prix = prix;
	}

	@Override
	public void afficher() {
		String tab = indentation();
		System.out.println(tab + nom + ": " + prix + "DH");
	}

}
