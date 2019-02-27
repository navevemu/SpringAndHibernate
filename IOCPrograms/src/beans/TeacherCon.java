package beans;

public class TeacherCon {
	private String name;
	private String subject;
	private int experience;
	public TeacherCon(String n, String s, int e) {
		
		this.name = n;
		this.subject = s;
		this.experience =e;
	}
	@Override
	public String toString() {
		return "TeacherCon [name=" + name + ", subject=" + subject + ", experience=" + experience + "]";
	}
	
	
}
