package beans;

public class StaticVaribaleInjection {
private static String name;

public static String getName() {
	return name;
}

public static void setName(String name) {
	StaticVaribaleInjection.name = name;
}

public void diplay() {
	System.out.println("Hello   "+name);

}

}
