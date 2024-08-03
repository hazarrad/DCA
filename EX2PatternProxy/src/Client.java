
public class Client {

	private Idossier idossier;

	public void process() {
		idossier.createFichier("JAVA");
	}

	public Idossier getIdossier() {
		return idossier;
	}

	public void setIdossier(Idossier idossier) {
		this.idossier = idossier;
	}

	
	

}
