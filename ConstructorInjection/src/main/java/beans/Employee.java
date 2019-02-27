package beans;

public class Employee {

	private String name;
	private int age;
	private String mailId;
	public Employee() {
		
	}
	public Employee(String name, int age, String mailId) {
		super();
		this.name = name;
		this.age = age;
		this.mailId = mailId;
	}
	public Employee(String name, int age) {
		super();
		this.name = name;
		this.age = age;
	}
	@Override
	public String toString() {
		return "Employee [name=" + name + ", age=" + age + ", mailId=" + mailId + "]";
	}
	
	
}
