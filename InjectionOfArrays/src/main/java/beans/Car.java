package beans;

import java.util.Arrays;

public class Car {

	
	private String[] carName;
	
	private Engine[] engineTypes;

	public String[] getCarName() {
		return carName;
	}

	public void setCarName(String[] carName) {
		this.carName = carName;
	}

	public Engine[] getEngineTypes() {
		return engineTypes;
	}

	public void setEngineTypes(Engine[] engineTypes) {
		this.engineTypes = engineTypes;
	}

	@Override
	public String toString() {
		return "Car [carName=" + Arrays.toString(carName) + ", engineTypes=" + Arrays.toString(engineTypes) + "]";
	}
	
	
	
	
}
