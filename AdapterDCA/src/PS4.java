
public class PS4 implements HDMI {

	@Override
	public void view(byte[] data) {

		String message = new String(data);

		System.out.println("Hey " + message);
	}

}
