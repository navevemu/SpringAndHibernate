package beans;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Car {
	@Autowired
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
