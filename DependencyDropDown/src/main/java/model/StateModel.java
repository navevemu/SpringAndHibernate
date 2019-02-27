package model;

import javax.persistence.Column;
import javax.persistence.Embeddable;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="state",schema="naveen")
public class StateModel {

@Id
@Column(name="sno")
	private int sno;
	public int getSno() {
	return sno;
}

public void setSno(int sno) {
	this.sno = sno;
}

	@Column(name="countryName")
	private String countryName;
	
	@Column(name="stateName")
	private String stateName;

	public String getCountryName() {
		return countryName;
	}

	public void setCountryName(String countryName) {
		this.countryName = countryName;
	}

	public String getStateName() {
		return stateName;
	}

	public void setStateName(String stateName) {
		this.stateName = stateName;
	}

	@Override
	public String toString() {
		return "StateModel [sno=" + sno + ", countryName=" + countryName + ", stateName=" + stateName + "]";
	}
	
}
