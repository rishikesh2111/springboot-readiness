package com.example.SpringBootreadiness.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
@Entity
public class Person {
	
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
    public Long id;
	@NotNull(message="first name can not be null")
	@Size(min=5, max=20, message="size between 5 and 20")
	public String firstName;
	@NotNull(message="last name can not be null")
	@Size(min=5, max=20, message="size between 5 and 20")
    public String lastName;
    public String address;
    public String gender;
    
    
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
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public String isGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	public Long getId() {
		return id;
	}
	public Person() {
		super();
	}
	public Person(String firstName, String lastName, String address, String gender) {
		super();
		this.firstName = firstName;
		this.lastName = lastName;
		this.address = address;
		this.gender = gender;
	}
	@Override
	public String toString() {
		return "User [id=" + id + ", firstName=" + firstName + ", lastName=" + lastName + ", address=" + address
				+ ", gender=" + gender + "]";
	}
}
