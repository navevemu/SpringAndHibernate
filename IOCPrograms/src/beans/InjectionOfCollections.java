package beans;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class InjectionOfCollections {
private List<String> fruits;
private Set<String>  cricketers;
private Map<String,String> capitals;
private ArrayList<Engine> e;
public void setE(ArrayList<Engine> e) {
	this.e = e;
}
public List<String> getFruits() {
	return fruits;
}
public void setFruits(List<String> fruits) {
	this.fruits = fruits;
}
public Set<String> getCricketers() {
	return cricketers;
}
public void setCricketers(Set<String> cricketers) {
	this.cricketers = cricketers;
}
public Map<String, String> getCapitals() {
	return capitals;
}
public void setCapitals(Map<String, String> capitals) {
	this.capitals = capitals;
}
@Override
public String toString() {
	return "InjectionOfCollections [fruits=" + fruits + ", cricketers=" + cricketers + ", capitals=" + capitals + ", e="
			+ e + "]";
}


}
