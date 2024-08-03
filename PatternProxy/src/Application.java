
public class Application {

	public static void main(String[] args) {
		
		Client client = new Client();
		client.setiStandard(new Proxy());
		client.process();
	}
}
