package collections;

import java.util.TreeSet;

public class TreeSetEg {

	public static void main(String[] args) {
		TreeSet t=new TreeSet(new ReverseAlphaComparator());
		
t.add("A");
t.add("Z");
t.add("C");
System.out.println(t);
	}

}
