package beans;

public class Student {
	

	

	
	private int sid;
	private String sName;
	private char grade;
	private String email;
	private int marks;
	@Override
	public String toString() {
		return "Student [sid=" + sid + ", sName=" + sName + ", grade=" + grade + ", email=" + email + ", marks=" + marks
				+ ", address=" + address + "]";
	}
	private String address;


	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public int getMarks() {
		return marks;
	}
	public void setMarks(int marks) {
		this.marks = marks;
	}
	public Student() {
		}
	public int getSid() {
		return sid;

	}
	public void setSid(int sid) {
		this.sid = sid;
	}
	public String getsName() {
		return sName;
	}
	public void setsName(String sName) {
		this.sName = sName;
	}
	public char getGrade() {
		return grade;
	}
	public void setGrade(char grade) {
		this.grade = grade;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}

	}


