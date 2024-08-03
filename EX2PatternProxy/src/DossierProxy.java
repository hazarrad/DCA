public class DossierProxy implements Idossier {

	public DossierReel dossierReel;
	public String codeDossier;
	public String codeClient;

	public DossierProxy(String codeDossier, String codeClient) {
		this.codeDossier = codeDossier;
		this.codeClient = codeClient;
	}

	@Override
	public void getFichier(String fichier) {
		System.out.println("Verify security");
		if ("root".equalsIgnoreCase(codeDossier) && "123456".equalsIgnoreCase(codeClient)) {
			dossierReel = new DossierReel("JAVA");
			dossierReel.getFichier("JAVA");
			dossierReel.createFichier("SQL");
			dossierReel.deleteFichier("SQL");
		} else {
			throw new RuntimeException("error security");
		}
	}

	@Override
	public void createFichier(String fichier) {
		System.out.println("Verify security");
		if ("root".equalsIgnoreCase(codeDossier) && "123456".equalsIgnoreCase(codeClient)) {
			dossierReel = new DossierReel("JAVA");
			dossierReel.createFichier("SQL");
		} else {
			throw new RuntimeException("error security");
		}
	}

	@Override
	public void deleteFichier(String fichier) {
		System.out.println("Verify security");
		if ("root".equalsIgnoreCase(codeDossier) && "123456".equalsIgnoreCase(codeClient)) {
			dossierReel = new DossierReel("JAVA");
			dossierReel.deleteFichier("SQL");
		} else {
			throw new RuntimeException("error security");
		}
	}

}
