package beans;

public class SetterIoc {

	private Student st;
	private Teacher tc;
	private String college;
	
	public void setSt(Student st) {
		this.st = st;
	}
	public void setCollege(String college) {
		this.college = college;
	}
	public void setTc(Teacher tc) {
		this.tc = tc;
	}
	public void cologeInfo()
	{
		System.out.println("Student detail"+getSt()+"Teacher details"+getTc()+"college Name"+getCollege());
	}
	public Student getSt() {
		return st;
	}
	public Teacher getTc() {
		return tc;
	}
	public String getCollege() {
		return college;
	}
	
	
	
	
	
}
