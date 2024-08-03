import java.util.ArrayList;
import java.util.List;

public class fichiers extends ComposantFichier {

	List<ComposantFichier> compositeFichiers = new ArrayList<>();

	public fichiers(String nom) {
		super(nom);
	}

	@Override
	public void afficher() {
		String tab = indentation();
		System.out.println(tab + nom);
		compositeFichiers.forEach(ComposantFichier::afficher);
	}
	
	
	public void AddComposentMenu(ComposantFichier fichier) {
		fichier.level = this.level + 1;
		compositeFichiers.add(fichier);
	}

	public void RemoveComposentMenu(ComposantFichier fichier) {
		fichier.level = this.level - 1;
		compositeFichiers.remove(fichier);
	}


}
