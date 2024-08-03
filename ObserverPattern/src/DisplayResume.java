
public class DisplayResume implements Observer {

	public void update(Observable observable) {
		if (observable instanceof Gps) {
			Gps g = (Gps) observable;
			System.out.println("Position : " + g.getPosition());
		}
	}
}
