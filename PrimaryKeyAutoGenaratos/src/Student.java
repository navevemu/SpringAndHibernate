

import java.sql.Connection;

public class Student {
private int sid;
private String sName;
private String grade;
private String email;
private int marks;
private String address;


public String getAddress() {
	return address;
}
public void setAddress(String address) {
	this.address = address;
}
public Student(int sid, String sName, String grade, String email, int marks, String address) {
	super();
	this.sid = sid;
	this.sName = sName;
	this.grade = grade;
	this.email = email;
	this.marks = marks;
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
public String getGrade() {
	return grade;
}
public void setGrade(String grade) {
	this.grade = grade;
}
public String getEmail() {
	return email;
}
public void setEmail(String email) {
	this.email = email;
}

}
