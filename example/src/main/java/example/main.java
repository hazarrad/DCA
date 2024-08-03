package example;

public class main {

	public static void main(String[] args) {

		Client c = new Client();

		System.out.println("Request to save PDF");
		c.setSaveFiles(new savePDF());
		c.saveFileIn();

		System.out.println("Request to save XLXS");
		c.setSaveFiles(new saveXLSX());
		c.saveFileIn();

	}
}
