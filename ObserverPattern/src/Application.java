
public class Application {

	public static void main(String[] args) {
		
	    Gps g = new Gps();

        DisplayResume displayResume = new DisplayResume();
        DisplayAll displayAll = new DisplayAll();

        g.addObserver(displayResume);

        g.setMesures("N 45°33°874 / W 693°00°000", 3);

        g.addObserver(displayAll);

        g.setMesures("N 43°39°786 / W 258°18°15", 6);
	}
}
