package beans;

public class SWEmployee  extends Employee{
	private String tech;
	

	public String getTech() {
		return tech;
	}


	public void setTech(String tech) {
		this.tech = tech;
	}


	public SWEmployee(int empid, String ename, String email, int salary, String tech) {
		super(empid, ename, email, salary);
		this.tech = tech;
	}


	@Override
	public String toString() {
		return "SWEmployee [tech=" + tech + "]";
	}


	
}
