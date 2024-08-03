
public class Troll extends Personnage {

	public Troll() {
		this.arme = new ComportementPolgnard();
	}
	
	@Override
	public void Combattre() {
		System.out.println("Troll Combattre");
		this.arme.utiliserArme();

	}

}
