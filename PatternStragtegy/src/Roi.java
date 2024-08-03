
public class Roi extends Personnage {

	public Roi() {
		this.arme = new ComportementHache();
	}
	
	@Override
	public void Combattre() {

		System.out.println("Roi Combattre");
		this.arme.utiliserArme();

	}

}
