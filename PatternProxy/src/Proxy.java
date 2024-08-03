import java.util.Random;

public class Proxy implements IStandard {

	private StandardImpl cible;

	@Override
	public void operation() {

		System.out.println("Verify security");
		boolean a = new Random().nextBoolean();
		if (a) {
			cible = new StandardImpl();
			cible.operation();
		} else {
			throw new RuntimeException("error security");
		}
	}

}
