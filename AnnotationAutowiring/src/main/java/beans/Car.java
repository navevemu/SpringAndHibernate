package beans;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Required;

public class Car {
	@Autowired
	@Qualifier(value="e1")
private Engine e;
private String CarName;
public Engine getE() {
	return e;
}
Car(){
	
}
public Car(Engine e, String carName) {
	super();
	this.e = e;
	CarName = carName;
}

//@Required
public void setE(Engine e) {
	this.e = e;
}
public String getCarName() {
	return CarName;
}
public void setCarName(String carName) {
	CarName = carName;
}
@Override
public String toString() {
	return "Car [e=" + e + ", CarName=" + CarName + "]";
}

	
}
