package beans;

public class CarInstanceFactory {

	private  String carName;

	public  String getCarName() {
		return carName;
	}

	public  void setCarName(String carName) {
		this.carName = carName;
	}
	public  CarInterface getCarInstance() throws IllegalAccessException, InstantiationException, ClassNotFoundException
	{
		return (CarInterface)Class.forName(carName).newInstance();
		
	}
}
