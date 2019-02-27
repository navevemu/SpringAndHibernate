package beans;

import java.util.Properties;
import java.util.Set;

public class PropertiesDi {

	private Properties driverInfo;

	public Properties getDriverInfo() {
		return driverInfo;
	}

	public void setDriverInfo(Properties driverInfo) {
		this.driverInfo = driverInfo;
	}
	public void printData()
	{
		Set key=driverInfo.keySet();
		for(Object o:key) {
			System.out.println("DriveInfo"+"Key"+o+"Value"+driverInfo.getProperty(o.toString()));
		}
	}
	
}
