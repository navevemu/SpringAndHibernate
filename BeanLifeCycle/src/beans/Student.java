package beans;

public class Student {
private int rollno;
private String name;
private String branch;
private int total;
public int getRollno() {
	return rollno;
}
public void setRollno(int rollno) {
	this.rollno = rollno;
}
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public String getBranch() {
	return branch;
}
public void setBranch(String branch) {
	this.branch = branch;
}
public int getTotal() {
	return total;
}
public void setTotal(int total) {
	this.total = total;
}
@Override
public String toString() {
	return "Student [rollno=" + rollno + ", name=" + name + ", branch=" + branch + ", total=" + total + "]";
}

}
