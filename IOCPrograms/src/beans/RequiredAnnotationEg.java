package beans;

import org.springframework.beans.factory.annotation.Required;

public class RequiredAnnotationEg {
private String name;
private int salary;
private byte exp;
public String getName() {
	return name;
}
@Required
public void setName(String name) {
	this.name = name;
}
public int getSalary() {
	return salary;
}
public void setSalary(int salary) {
	this.salary = salary;
}
public byte getExp() {
	return exp;
}
@Required
public void setExp(byte exp) {
	this.exp = exp;
}
@Override
public String toString() {
	return "RequiredAnnotationEg [name=" + name + ", salary=" + salary + ", exp=" + exp + "]";
}

}
