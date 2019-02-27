package beans;



public class Car {
private Engine e;
private String CarName;
public Engine getE() {
	return e;
}

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
