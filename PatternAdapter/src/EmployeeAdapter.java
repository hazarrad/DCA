
public class EmployeeAdapter extends ImpleAdaptee implements Utilisateur {

	public EmployeeAdapter(String nom, String poste) {
		super(nom, poste);
	}

	@Override
	public void AfficherUtilisateur() {
		super.AfficherNom();
		super.AfficherPoste();
	}

}
