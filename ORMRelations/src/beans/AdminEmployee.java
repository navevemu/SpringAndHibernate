package beans;

public class AdminEmployee extends Employee{
private String priv;

public String getPriv() {
	return priv;
}

public void setPriv(String priv) {
	this.priv = priv;
}

public AdminEmployee(int empid, String ename, String email, int salary, String priv) {
	super(empid, ename, email, salary);
	this.priv = priv;
}

@Override
public String toString() {
	return "AdminEmployee [priv=" + priv + "]";
}

}
