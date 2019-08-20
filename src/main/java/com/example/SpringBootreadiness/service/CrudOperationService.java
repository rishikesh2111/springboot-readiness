package com.example.SpringBootreadiness.service;

import java.util.List;

import com.example.SpringBootreadiness.model.Person;

public interface CrudOperationService {
	
	public Person saveUser(Person person);
	public Boolean deleteUserById(Long id);
	public Boolean deleteUserByName(String name);
	public Person updateUser(Person person);
	public Iterable<Person> getUsers();
	public Person getUserByName(String name);
	public Person getUserById(Long id);

}
