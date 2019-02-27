package collections;

import java.util.Enumeration;
import java.util.Vector;

public class VectorAndEnumerationEg {

	public static void main(String[] args) {
		Vector v= new Vector();
		for(int i=0;i<10;i++) {
			v.addElement("naveen"+i);
		}
		
		Enumeration e=v.elements();
		while(e.hasMoreElements())
			System.out.println(e.nextElement());
		
		

	}

}
