package com.example.SpringBootreadiness.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.SpringBootreadiness.model.Person;
import com.example.SpringBootreadiness.repository.CrudOperationRepository;
import com.example.SpringBootreadiness.service.CrudOperationService;

@Service
public class CrudOperationServiceImpl implements CrudOperationService{

	@Autowired
	CrudOperationRepository repository;
	
	@Override
	public Person saveUser(Person person) {
		return repository.save(person);
	}

	@Override
	public Boolean deleteUserById(Long id) {
		repository.deleteById(id);
		return true;
	}

	@Override
	public Boolean deleteUserByName(String name) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Person updateUser(Person person) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Iterable<Person> getUsers() {
		return repository.findAll();
	}

	@Override
	public Person getUserByName(String name) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Person getUserById(Long id) {
		// TODO Auto-generated method stub
		return null;
	}

}
