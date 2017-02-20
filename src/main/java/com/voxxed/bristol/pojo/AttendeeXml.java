package com.voxxed.bristol.pojo;

import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
public class AttendeeXml {
	private String firstName;
	private String lastName;
	private AddressXML address;

	public AttendeeXml() {
		firstName = "John Json";
		lastName = "Doe";
		address = new AddressXML();
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

	public AddressXML getAddress() {
		return address;
	}

	public void setAddress(AddressXML address) {
		this.address = address;
	}
}
