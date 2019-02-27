package beans;

public class HWEmployee extends Employee {
private String area;

public String getArea() {
	return area;
}

public void setArea(String area) {
	this.area = area;
}

public HWEmployee(int empid, String ename, String email, int salary, String area) {
	super(empid, ename, email, salary);
	this.area = area;
}

@Override
public String toString() {
	return "HWEmployee [area=" + area + "]";
}

}
