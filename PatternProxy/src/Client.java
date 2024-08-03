
public class Client {

	private IStandard iStandard;

	public void process() {
		iStandard.operation();
	}

	public IStandard getiStandard() {
		return iStandard;
	}

	public void setiStandard(IStandard iStandard) {
		this.iStandard = iStandard;
	}
	
	

}
