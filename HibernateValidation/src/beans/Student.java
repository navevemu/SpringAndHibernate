package beans;

import java.sql.Connection;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.Max;
import javax.validation.constraints.Min;

import org.hibernate.validator.constraints.Email;
import org.hibernate.validator.constraints.NotEmpty;
@Entity
@Table(name="student05",schema="naveen")
public class Student {
	@Id
	@Min(value=111,message="id should be greaterthan 111")
	@Max(value=999,message="id should be lessthan 999")
private int sid;
	@Column
	@NotEmpty(message="name is mandatory")
private String sName;
	
	@Column
	@Email(message="Email is not correct")
private String email;
	@Column
private int marks;

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

public String getEmail() {
	return email;
}
public void setEmail(String email) {
	this.email = email;
}
public Student(int sid, String sName, String email, int marks) {
	super();
	this.sid = sid;
	this.sName = sName;
	this.email = email;
	this.marks = marks;
}
@Override
public String toString() {
	return "Student [sid=" + sid + ", sName=" + sName + ", email=" + email + ", marks=" + marks + "]";
}

}
