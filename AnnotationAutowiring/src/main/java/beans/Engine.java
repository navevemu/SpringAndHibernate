package beans;

public class Engine {
	private int modelYear;

	public Engine(int modelYear) {
		this.modelYear=modelYear;
	}

	@Override
	public String toString() {
		return "Engine [modelYear=" + modelYear + "]";
	}
	

}
