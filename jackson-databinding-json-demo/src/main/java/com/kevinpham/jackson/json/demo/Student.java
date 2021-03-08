package com.kevinpham.jackson.json.demo;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

// Doesn't throw an exception for unimplemented JSON properties
@JsonIgnoreProperties(ignoreUnknown=true)
public class Student {
	
	private int id;
	private String firstName;
	private String lastName;
	private boolean active;
	private String[] languages;

	private Address address;
		
	public Student() {
		
	}

	
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
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

	public boolean isActive() {
		return active;
	}

	public void setActive(boolean active) {
		this.active = active;
	}

	public Address getAddress() {
		return address;
	}

	public void setAddress(Address address) {
		this.address = address;
	}

	public String[] getLanguages() {
		return languages;
	}

	public void setLanguages(String[] languages) {
		this.languages = languages;
	}
	
	
}
