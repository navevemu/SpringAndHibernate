package beans;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Transient;

//import org.hibernate.annotations.Entity;

@Entity
@Table(name="student05",schema="naveen")

public class Student {
	@Id
	@Column(name="sid")
private int sid;
	@Column
private String sname;
	
	@Column
private String email;
	@Column
private int marks;
	@Transient
	private String collegeName;
	public int getSid() {
		return sid;
	}
	public void setSid(int sid) {
		this.sid = sid;
	}
	public String getSname() {
		return sname;
	}
	public void setSname(String sname) {
		this.sname = sname;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public int getMarks() {
		return marks;
	}
	public void setMarks(int marks) {
		this.marks = marks;
	}
	public String getCollegeName() {
		return collegeName;
	}
	public void setCollegeName(String collegeName) {
		this.collegeName = collegeName;
	}
	public Student(int sid, String sname, String email, int marks) {
		super();
		this.sid = sid;
		this.sname = sname;
		this.email = email;
		this.marks = marks;
		
	}
	@Override
	public String toString() {
		return "Student [sid=" + sid + ", sname=" + sname + ", email=" + email + ", marks=" + marks + ", collegeName="
				+ collegeName + "]";
	}
	

}
