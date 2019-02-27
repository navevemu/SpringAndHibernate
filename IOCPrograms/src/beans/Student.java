package beans;

public class Student {
private String name;
private int rollno;
private char grade;
private int standard;
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public int getRollno() {
	return rollno;
}
public void setRollno(int rollno) {
	this.rollno = rollno;
}
public char getGrade() {
	return grade;
}
public void setGrade(char grade) {
	this.grade = grade;
}
public int getStandard() {
	return standard;
}

@Override
public String toString() {
	return "Student [name=" + name + ", rollno=" + rollno + ", grade=" + grade + ", standard=" + standard + "]";
}
public void setStandard(int standard) {
	this.standard = standard;
}
	
}
