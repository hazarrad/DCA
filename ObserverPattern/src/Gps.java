import java.util.ArrayList;

public class Gps implements Observable {

	private String position;
	private int precision;
	private ArrayList<Observer> observers;

	public Gps() {
		position = "inconnue";
		precision = 0;
		observers = new ArrayList<>();
	}

	public void addObserver(Observer observer) {
		observers.add(observer);
	}

	public void removeObserver(Observer observer) {
		observers.remove(observer);
	}

	public void notifyObserver() {
		for (int i = 0; i < observers.size(); i++) {
			Observer observer = observers.get(i);
			observer.update(this);
		}
	}

	public void setMesures(String position, int precision) {
		this.position = position;
		this.precision = precision;
		notifyObserver();
	}

	public String getPosition() {
		return position;
	}

	public int getPrecision() {
		return precision;
	}
}
