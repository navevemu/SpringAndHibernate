package beans;


import java.util.Properties;

import org.springframework.core.convert.Property;

public class InjectionOfProperties {
private Properties d;
public void setD(Properties d) {
	this.d = d;
}
@Override
public String toString() {
	return "InjectionOfProperties [d=" + d + "]";
}

}
