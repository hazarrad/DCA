
public class AdaptorVgaHDMI2 extends TV implements VGA {

	@Override
	public void print(String message) {

		byte[] data = message.getBytes();
		super.view(data);
	}

}
