package beans;

public class ConstructorInjection {
private String message;
private int u;
private ConstructorInjection(String m)
{
	message=m;
}
private ConstructorInjection(int m)
{
	u=m+10;
}
public void diplay()
{
	System.out.println(u);
}
}
