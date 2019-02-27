package entities;

public class SWEmployee extends Employee {
private String tool;

public String getTool() {
	return tool;
}

public void setTool(String tool) {
	this.tool = tool;
}

@Override
public String toString() {
	return "SWEmployee [tool=" + tool + "]";
}

}
