package beans;

public class ConstructorInjection2 {
	private StudentCon st;
	 private TeacherCon tc;
	private String college;
	private ConstructorInjection2( String college) {
		
		
		this.college = college;
	}
	public void setSt(StudentCon st) {
		this.st = st;
	}
	public void setTc(TeacherCon tc) {
		this.tc = tc;
	}
	public void cologeInfo()
	{
		System.out.println(st+"   "+tc+"   "+college);
		
	}
	
}
