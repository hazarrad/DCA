
public class AdaptorVgaHDMI implements VGA {

	private HDMI hdmi;

	@Override
	public void print(String message) {

		byte[] data = message.getBytes();
		hdmi.view(data);
	}

	public void setHDMI(HDMI hdmi) {
		this.hdmi = hdmi;
	}

}
