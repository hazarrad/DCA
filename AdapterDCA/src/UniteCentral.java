
public class UniteCentral {

	public VGA vga;

	public void afficher(String message) {

		vga.print(message);
	}

	public void setVga(VGA vga) {
		this.vga = vga;
	}
}
