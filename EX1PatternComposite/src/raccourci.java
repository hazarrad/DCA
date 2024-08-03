
public class raccourci extends ComposantFichier {

	public raccourci(String nom) {
		super(nom);
	}

	@Override
	public void afficher() {
		String tab = indentation();
		System.out.println(tab + nom);
	}

}
