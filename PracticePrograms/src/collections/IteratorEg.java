package collections;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class IteratorEg {

	public static void main(String[] args) {
		List l=new ArrayList();
		l.add("naveen");
		l.add("ravi");
				
		l.add("Akhil");
		l.add("venu");
		System.out.println(l);
		Iterator i=l.iterator();
		//System.out.println(i.next());
		
		while(i.hasNext()) {
			System.out.println(i.next());
			i.remove();

	}
		System.out.println(l);
		
	}

}
