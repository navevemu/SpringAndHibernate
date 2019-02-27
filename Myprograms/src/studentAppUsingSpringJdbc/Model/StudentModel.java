package studentAppUsingSpringJdbc.Model;



public class StudentModel {
	private int studentid;
	private String stname;
	private long mobileno;
	private String address;
	public int getStudentid() {
		return studentid;
	}
	public void setStudentid(int studentid) {
		this.studentid = studentid;
	}
	public String getStname() {
		return stname;
	}
	public void setStname(String stname) {
		this.stname = stname;
	}
	public long getMobileno() {
		return mobileno;
	}
	public void setMobileno(long mobileno) {
		this.mobileno = mobileno;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	@Override
	public String toString() {
		return "StudentModel [studentid=" + studentid + ", stname=" + stname + ", mobileno=" + mobileno + ", address="
				+ address + "]";
	}
	

}
