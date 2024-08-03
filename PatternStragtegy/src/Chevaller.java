
public class Chevaller extends Personnage {

	public Chevaller() {
		this.arme = new ComportementPolgnard();
	}

	@Override
	public void Combattre() {

		System.out.println("Chevaller Combattre");
		this.arme.utiliserArme();

	}

}
