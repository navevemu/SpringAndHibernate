package collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

public class ArrayListEg {
	
	public static void main(String ar[])
	{
		ArrayList<String> al=new ArrayList<String>();
		for(int i=0;i<10;i++) {
			al.add("naveen"+i);
		}
		System.out.println(al);
		al.set(2,"hi");
		System.out.println(al);
//		Iterator<String> i=al.iterator();
//		while(i.hasNext())
//			System.out.println(i.next());
		ArrayList<String> al2=new ArrayList<String>();
		for(int i=0;i<10;i++) {
			al2.add("pooja"+i);
		}
		al.addAll(1,al2);
		al.remove("naveen9");
		al.retainAll(al2);
		List l=Collections.synchronizedList(al);
		
		al.trimToSize();
	for(String s:al)
		System.out.println(s);
	}
}
