package coffeeshop.entities;

import coffeeshop.abstracts.Entity;

public class Customer implements Entity{
	
	private String id;
	private String firstName;
	private String lastName;
	private int yearOfBirth;
	
	public Customer(String id, String firstName, String lastName, int yearOfBirth) {
		this.id = id;
		this.firstName = firstName;
		this.lastName = lastName;
		this.yearOfBirth = yearOfBirth;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
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

	public int getYearOfBirth() {
		return yearOfBirth;
	}

	public void setYearOfBirth(int yearOfBirth) {
		this.yearOfBirth = yearOfBirth;
	}
	
	

}
