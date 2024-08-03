
public class DisplayAll implements Observer {

	public void update(Observable observable) {
		if (observable instanceof Gps) {
			Gps g = (Gps) observable;
			System.out.println("Position : " + g.getPosition() + "  Precision : " + g.getPrecision() + "/10");
		}
	}
}
