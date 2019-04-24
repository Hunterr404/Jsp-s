package com.jlc.jsps.beans;

/*
 * @Author : Hunterr
 * @company : JLC
 * @see		:https://github.com/Hunterr404
 */
public class Address {
	private String street;
	private String city;

	public Address(String street, String city) {
		super();
		this.street = street;
		this.city = city;

	}

	public String getStreet() {
		return street;
	}

	public void setStreet(String street) {
		this.street = street;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

}
