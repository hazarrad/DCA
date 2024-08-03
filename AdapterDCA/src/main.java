
public class main {

	public static void main(String[] args) {

		UniteCentral central = new UniteCentral();

		central.setVga(new Ecran());
		central.afficher("Ecran display");
		central.setVga(new VideoProjector());
		central.afficher("Vedio display");
		central.setVga(new Laptop());
		central.afficher("Laptop display");

		AdaptorVgaHDMI adaptorVgaHDMI = new AdaptorVgaHDMI();
		adaptorVgaHDMI.setHDMI(new TV());
		central.setVga(adaptorVgaHDMI);
		central.afficher("TV display");

		AdaptorVgaHDMI2 adaptorVgaHDMI2 = new AdaptorVgaHDMI2();
		central.setVga(adaptorVgaHDMI2);
		central.afficher("HDMI2 TV via hiritage");

	}
}
