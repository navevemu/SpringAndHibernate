package collections;

import java.util.HashSet;

public class HashSetEg {

	public static void main(String[] args) {
	HashSet h=new HashSet();
	h.add("A");
	h.add("B");
	h.add("C");
	h.add("Z");
	h.add("E");
	h.add("F");
	h.add(null);
	System.out.println(h.add(null));
	System.out.println(h.add("B"));
	System.out.println(h);
	

	}

}
