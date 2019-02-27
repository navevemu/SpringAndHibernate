package beans;

import org.springframework.beans.factory.FactoryBean;

public class CarFactory implements FactoryBean{
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


public Object getObject() throws Exception {
	
	return Class.forName(carName).newInstance();
}


public Class getObjectType() {
	// TODO Auto-generated method stub
	return Car.class;
}
}
