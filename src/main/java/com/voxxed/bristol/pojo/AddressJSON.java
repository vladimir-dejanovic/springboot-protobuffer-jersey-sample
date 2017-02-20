package com.voxxed.bristol.pojo;

public class AddressJSON {

	private String city;
	private String street;
	private int number;

	public AddressJSON() {
		city = "Bristol";
		street = "Canon's Road";
		number = 1;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getStreet() {
		return street;
	}

	public void setStreet(String street) {
		this.street = street;
	}

	public int getNumber() {
		return number;
	}

	public void setNumber(int number) {
		this.number = number;
	}
}
