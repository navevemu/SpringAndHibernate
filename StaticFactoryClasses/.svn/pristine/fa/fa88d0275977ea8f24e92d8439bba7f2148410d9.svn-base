package beans;



public class CarFactory {
public static String carName;


public static String getCarName() {
	return carName;
}


public static void setCarName(String carName) {
	CarFactory.carName = carName;
}


public static Object getCar() throws InstantiationException, IllegalAccessException, ClassNotFoundException {
	return Class.forName(carName).newInstance();
}
}
