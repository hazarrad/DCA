
public class SubFolder extends ComposantFichier {

	public SubFolder(String nom) {
		super(nom);
	}

	@Override
	public void afficher() {
		String tab = indentation();
		System.out.println(tab + nom);
	}

}
