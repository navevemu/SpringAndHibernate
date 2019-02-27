package beans;

public class PNameSpace {
private String nam;
private Engine e;
public void setNam(String nam) {
	this.nam = nam;
}
public void setE(Engine e) {
	this.e = e;
}
@Override
public String toString() {
	return "PNameSpace [name=" + nam + ", e=" + e + "]";
}

	
	
}
