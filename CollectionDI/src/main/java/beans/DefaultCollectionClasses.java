package beans;

import java.util.List;
import java.util.Map;
import java.util.Set;

public class DefaultCollectionClasses {
private List fruits;
private Set vegitables;
private Map cc;
public List getFruits() {
	return fruits;
}
public void setFruits(List fruits) {
	this.fruits = fruits;
}
public Set getVegitables() {
	return vegitables;
}
public void setVegitables(Set vegitables) {
	this.vegitables = vegitables;
}
public Map getCc() {
	return cc;
}
public void setCc(Map cc) {
	this.cc = cc;
}
@Override
public String toString() {
	return "DefaultCollectionClasses [fruits=" + fruits + ", vegitables=" + vegitables + ", Cc=" + cc + "]";
}

}
