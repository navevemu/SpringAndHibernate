package beans;

public class ConnectionTest {
	private String driveName;
	private String userName;
	private String password;
	public void setDriveName(String driveName) {
		this.driveName = driveName;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	@Override
	public String toString() {
		return "ConnectionTest [driveName=" + driveName + ", userName=" + userName + ", password=" + password + "]";
	}
	
	

}
