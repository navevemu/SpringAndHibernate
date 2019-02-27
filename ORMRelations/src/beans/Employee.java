package beans;

public class Employee {
private int empid;
private String ename;
private String email;
private int salary;
public int getEmpid() {
	return empid;
}
public void setEmpid(int empid) {
	this.empid = empid;
}
public String getEname() {
	return ename;
}
public void setEname(String ename) {
	this.ename = ename;
}
public String getEmail() {
	return email;
}
public void setEmail(String email) {
	this.email = email;
}
public int getSalary() {
	return salary;
}
public void setSalary(int salary) {
	this.salary = salary;
}
@Override
public String toString() {
	return "Employee [empid=" + empid + ", ename=" + ename + ", email=" + email + ", salary=" + salary + "]";
}
public Employee(int empid, String ename, String email, int salary) {
	super();
	this.empid = empid;
	this.ename = ename;
	this.email = email;
	this.salary = salary;
}

}
