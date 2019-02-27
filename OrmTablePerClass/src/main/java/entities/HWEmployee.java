package entities;

public class HWEmployee extends Employee {
	private String dep;

	public String getDep() {
		return dep;
	}

	public void setDep(String dep) {
		this.dep = dep;
	}

	@Override
	public String toString() {
		return "HWEmployee [dep=" + dep + "]";
	}
	

}
