package model;

import java.util.ArrayList;
import java.util.Date;

import javax.validation.constraints.Max;
import javax.validation.constraints.Min;
import javax.validation.constraints.Past;
import javax.validation.constraints.Pattern;
import javax.validation.constraints.Size;

import org.hibernate.validator.constraints.Email;
import org.hibernate.validator.constraints.Length;

import validators.IsValidHobby;

public class Student {

	@Size(min=5)
	private String sname;
	
	@Email
	private String mailid;
	
	@IsValidHobby(listOfHobbies="Music|Game|Cricket|Reading")
	private String hobby;
	public String getHobby() {
		return hobby;
	}
	public void setHobby(String hobby) {
		this.hobby = hobby;
	}
	@Past
	private Date sdob;
	
	
	private long mobno;
	private ArrayList<String> skillset;
	private Address saddress;
	
	
	
	public Address getSaddress() {
		return saddress;
	}
	public void setSaddress(Address saddress) {
		
		this.saddress = saddress;
	}
	public Date getSdob() {
		return sdob;
	}
	public void setSdob(Date sdob) {
		this.sdob = sdob;
	}
	public long getMobno() {
		return mobno;
	}
	public void setMobno(long mobno) {
		this.mobno = mobno;
	}
	public ArrayList<String> getSkillset() {
		return skillset;
	}
	public void setSkillset(ArrayList<String> skillset) {
		this.skillset = skillset;
	}
	public String getSname() {
		return sname;
	}
	public void setSname(String sname) {
		this.sname = sname;
	}
	public String getMailid() {
		return mailid;
	}
	public void setMailid(String mailid) {
		this.mailid = mailid;
	}
	
}
