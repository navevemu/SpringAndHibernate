package beans;

public class StudentCon {
	private String name;
	private int rollno;
	private char grade;
	private int standard;
	public StudentCon(String n,int r,char g,int s) {
		name=n;
		rollno=r;
		grade=g;
		standard=s;
		
	}
	@Override
	public String toString() {
		return "StudentCon [name=" + name + ", rollno=" + rollno + ", grade=" + grade + ", standard=" + standard + "]";
	}
	
}
