package beans;

import java.util.HashSet;
import java.util.Hashtable;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.Vector;

public class RequiredCollections {
	private Vector fruits;
	private HashSet vegitables;
	private Hashtable cc;
	public Vector getFruits() {
		return fruits;
	}
	public void setFruits(Vector fruits) {
		this.fruits = fruits;
	}
	public HashSet getVegitables() {
		return vegitables;
	}
	public void setVegitables(HashSet vegitables) {
		this.vegitables = vegitables;
	}
	public Hashtable getCc() {
		return cc;
	}
	public void setCc(Hashtable cc) {
		this.cc = cc;
	}
	@Override
	public String toString() {
		return "RequiredCollections [fruits=" + fruits + ", vegitables=" + vegitables + ", cc=" + cc + "]";
	}
	
}
