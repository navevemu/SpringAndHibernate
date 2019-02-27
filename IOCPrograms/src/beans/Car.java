package beans;

public class Car {
private Engine e;
private String name;
public void setName(String name) {
	this.name = name;
}
public void setE(Engine e) {
	this.e = e;
}
@Override
public String toString() {
	return "Car [e=" + e + ", name=" + name + "]";
}
}
