package beans;

import java.util.LinkedList;
import java.util.TreeMap;
import java.util.TreeSet;
import java.util.Vector;

public class ParticularCollectionDI {
private LinkedList<String> fruits;
private TreeSet<String> cricketers;
private TreeMap<String,String> capitals;
private Vector<Engine> e;
public void setE(Vector<Engine> e) {
	this.e = e;
}
public LinkedList<String> getFruits() {
	return fruits;
}
public void setFruits(LinkedList<String> fruits) {
	this.fruits = fruits;
}
public TreeSet<String> getCricketers() {
	return cricketers;
}
public void setCricketers(TreeSet<String> cricketers) {
	this.cricketers = cricketers;
}
public TreeMap<String, String> getCapitals() {
	return capitals;
}
public void setCapitals(TreeMap<String, String> capitals) {
	this.capitals = capitals;
}
@Override
public String toString() {
	return "ParticularCollectionDI [fruits=" + fruits + ", cricketers=" + cricketers + ", capitals=" + capitals + ", e="
			+ e + "]";
}

}
