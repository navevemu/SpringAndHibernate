package model;

public class Address {

	private String countryName;
	private String cityName;
	private int pincode;
	public String getCountryName() {
		return countryName;
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
