package beans;



public class CarFactory {
public  String carName;


public  String getCarName() {
	return carName;
}


public  void setCarName(String carName) {
	this.carName = carName;
}


public  Object getCar() throws InstantiationException, IllegalAccessException, ClassNotFoundException {
	return Class.forName(carName).newInstance();
}
}
