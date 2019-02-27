package beans;

public class Autowiring {
private Student s;
private Teacher t;
private Teacher t1;

public Autowiring(Student s) {
	
	this.s = s;
	System.out.println("Constructor autodetect");
}

public Autowiring(Student s, Teacher t, Teacher t1) {
	System.out.println("Constructor autodetect");
	this.s = s;
	this.t = t;
	this.t1 = t1;
}

public Autowiring() {
	System.out.println("default Constructor autodetect");
}

public Student getS() {
	return s;
}
public void setS(Student s) {
	this.s = s;
}
public Teacher getT() {
	return t;
}
public void setT(Teacher t) {
	this.t = t;
}
public Teacher getT1() {
	return t1;
}
public void setT1(Teacher t1) {
	this.t1 = t1;
}
@Override
public String toString() {
	return "Autowiring [s=" + s + ", t=" + t + ", t1=" + t1 + "]";
}

}
