package beans;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Required;
import org.springframework.stereotype.Component;

public class Car {
	
private  static String CarName;
public static void  setCarName(String carName){
	CarName=carName;
}
public String getCarName()

{
	return CarName;
}
}
