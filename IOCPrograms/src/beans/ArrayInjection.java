package beans;

import java.util.Arrays;

public class ArrayInjection {
private String names[];
private Engine e[];
public void setE(Engine[] e) {
	this.e = e;
}
public void setNames(String[] names) {
	this.names = names;
}
@Override
public String toString() {
	return "ArrayInjection [names=" + Arrays.toString(names) + ", e=" + Arrays.toString(e) + "]";
}


}
