package beans;

public class Engine {

private String modelName;

public void setModelName(String modelName) {
	this.modelName = modelName;
}
@Override
public String toString() {
	return "Engine [modelName=" + modelName + "]";
}

}
