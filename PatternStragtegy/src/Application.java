
public class Application {

	public static void main(String[] args) {

		System.out.println("Start with ArcEtFleches...");
		Personnage pReine = new Reine();
		pReine.Combattre();
		//switch from ArcEtFleches to Polgnard
		System.out.println("Switch to Polgnard...");
		pReine.setArme(new ComportementPolgnard());
		pReine.Combattre();
		System.out.println("******************");

		Personnage pRoi = new Roi();
		pRoi.Combattre();
		System.out.println("******************");

		Personnage pTroll = new Troll();
		pTroll.Combattre();
		System.out.println("******************");

		Personnage pChevaller = new Chevaller();
		pChevaller.Combattre();

	}
}
