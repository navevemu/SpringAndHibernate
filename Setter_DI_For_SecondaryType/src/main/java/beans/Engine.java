package beans;

public class Engine {
private String model;
private int hp;
public String getModel() {
	return model;
}
public void setModel(String model) {
	this.model = model;
}
public int getHp() {
	return hp;
}
public void setHp(int hp) {
	this.hp = hp;
}
@Override
public String toString() {
	return "Engine [model=" + model + ", hp=" + hp + "]";
}

	
}
