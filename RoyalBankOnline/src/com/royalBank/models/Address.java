package com.royalBank.models;

public class Address {

	private String streetName;
	public String getStreetName() {
		return streetName;
	}
	public void setStreetName(String streetName) {
		this.streetName = streetName;
	}
	private String countryName;
	private String cityName;
	private int pincode;
	public String getCountryName() {
		return countryName;
	}
	@Override
	public String toString() {
		return "Address [streetName=" + streetName + ", countryName=" + countryName + ", cityName=" + cityName
				+ ", pincode=" + pincode + "]";
	}
	public void setCountryName(String countryName) {
		
		this.countryName = countryName;
	}
	public String getCityName() {
	
		return cityName;
	}
	public void setCityName(String cityName) {
		this.cityName = cityName;
	}
	public int getPincode() {
		return pincode;
	}
	public void setPincode(int pincode) {
		this.pincode = pincode;
	}
	
}
