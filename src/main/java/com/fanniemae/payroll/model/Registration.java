package com.fanniemae.payroll.model;

public class Registration {
	
	private int id;
	private String FirstName;
	private String lastName;
	private int age;
	
	public Registration(int id, String firstName, String lastName, int age) {
		super();
		this.id = id;
		FirstName = firstName;
		this.lastName = lastName;
		this.age = age;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getFirstName() {
		return FirstName;
	}

	public void setFirstName(String firstName) {
		FirstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	@Override
	public String toString() {
		return "Registration [id=" + id + ", FirstName=" + FirstName + ", lastName=" + lastName + ", age=" + age + "]";
	}
	
	

}
