
public class Reine extends Personnage {

	public Reine() {
		this.arme = new ComportementArcEtFleches();
	}
	
	@Override
	public void Combattre() {

		System.out.println("Reine Combattre");
		this.arme.utiliserArme();
	}

}
