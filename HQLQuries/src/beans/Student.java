package beans;

import java.sql.Connection;

public class Student {
private int sid;
private String sName;
private char grade;
private String email;
private int marks;
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
public Student(int sid, String sName, char grade, String email, int marks, String address) {
	super();
	this.sid = sid;
	this.sName = sName;
	this.grade = grade;
	this.email = email;
	this.marks = marks;
	this.address = address;
}
@Override
public String toString() {
	return "Student [sid=" + sid + ", sName=" + sName + ", grade=" + grade + ", email=" + email + ", marks=" + marks
			+ ", address=" + address + "]";
}

}
