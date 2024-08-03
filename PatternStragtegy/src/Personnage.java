
public abstract class Personnage {

	public ComportementArme arme;

	void setArme(ComportementArme a) {
		this.arme = a;
	}

	public abstract void Combattre();
}
