
public abstract class ComposantDeMenu {

	protected String nom;
	protected int niveau;

	public ComposantDeMenu(String nom) {
		this.nom = nom;
	}

	public abstract void afficher();

	public String indentation() {

		String tab = "";
		for (int i = 0; i < niveau; i++) {
			tab = tab + "\t";
		}

		return tab;

	}
}
