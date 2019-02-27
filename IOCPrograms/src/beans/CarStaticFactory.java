package beans;

public class CarStaticFactory {

	private static String carName;

	public static String getCarName() {
		return carName;
	}

	public static void setCarName(String carName) {
		CarStaticFactory.carName = carName;
	}
	public static CarInterface getCarInstance() throws IllegalAccessException, InstantiationException, ClassNotFoundException
	{
		return (CarInterface)Class.forName(carName).newInstance();
		
	}
	
	
}
