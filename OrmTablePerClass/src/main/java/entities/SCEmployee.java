package entities;

public class SCEmployee extends Employee {
private String gateName;

@Override
public String toString() {
	return "SCEmployee [gateName=" + gateName + "]";
}

public String getGateName() {
	return gateName;
}

public void setGateName(String gateName) {
	this.gateName = gateName;
}

}
