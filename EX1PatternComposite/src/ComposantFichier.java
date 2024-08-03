
public abstract class ComposantFichier {

	protected String nom;
	protected int level;

	public ComposantFichier(String nom) {
		super();
		this.nom = nom;
	}

	public abstract void afficher();
	
	public String indentation() {

		String tab = "";
		for (int i = 0; i < level; i++) {
			tab = tab + "\t";
		}

		return tab;

	}

}
