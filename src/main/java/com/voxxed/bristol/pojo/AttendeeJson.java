package com.voxxed.bristol.pojo;

public class AttendeeJson {

	private String firstName;
	private String lastName;
	private AddressJSON address;

	public AttendeeJson() {
		firstName = "John Json";
		lastName = "Doe";
		address = new AddressJSON();
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public AddressJSON getAddress() {
		return address;
	}

	public void setAddress(AddressJSON address) {
		this.address = address;
	}
}
