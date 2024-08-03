
public class TV implements HDMI {

	@Override
	public void view(byte[] data) {
		String message = new String(data);
		System.out.println("HDMI " + message);
	}

}
