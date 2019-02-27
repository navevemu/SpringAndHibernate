
public class Student {
 private String name;
 private Adress addr;
 Student(Adress addr,String name)
 {
	 this.addr=addr;
	 this.name=name;
 }
	public void display()
	{
		System.out.println(name);
		System.out.println(addr);
		
	}
	
}

class Adress
{
	String stname;
	int doorno;
	String city;
	Adress(String st,int dn,String c)
	{
		this.stname=st;
		this.doorno=dn;
		this.city=c;
		
	}
	@Override
	public String toString()
	{
		return(doorno+"  "+stname+"  "+city );
	}
}
