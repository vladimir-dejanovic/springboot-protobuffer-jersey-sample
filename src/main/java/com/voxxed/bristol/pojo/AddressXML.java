package com.voxxed.bristol.pojo;

import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
public class AddressXML {
	private String city;
	private String street;
	private int number;

	public AddressXML() {
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
