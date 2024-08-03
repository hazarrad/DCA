
public class DossierReel implements Idossier {

	public String dossier;

	public DossierReel(String dossier) {
		this.dossier = dossier;
	}

	@Override
	public void getFichier(String fichier) {
		System.out.println("get fichier " + fichier);

	}

	@Override
	public void createFichier(String fichier) {
		System.out.println("cerate fichier " + fichier);

	}

	@Override
	public void deleteFichier(String fichier) {
		System.out.println("delete fichier " + fichier);

	}

}
