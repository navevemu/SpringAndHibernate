package beans;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.beans.factory.annotation.Qualifier;

public class AutowireAnnotation {
	
@Autowired()
@Qualifier(value="e1")
private Engine en;

public Engine getE() {
	return en;
}

public void setE(Engine e) {
	this.en = e;
}

@Override
public String toString() {
	return "AutowireAnnotation [e=" + en + "]";
}


}
