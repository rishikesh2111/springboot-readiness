package com.example.SpringBootreadiness.controller;


import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.BindingResult;
import org.springframework.validation.Errors;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.SpringBootreadiness.model.Person;
import com.example.SpringBootreadiness.service.CrudOperationService;


@RestController
public class CrupOperationController {

	@Autowired
	CrudOperationService crudOperationService;

	
	@GetMapping("test")
	public String verifyController() {
		return "Controller Running successfully";
	}
	@PostMapping("user")
	public ResponseEntity<String> saveUser(@Valid @RequestBody Person person, BindingResult results)throws Exception {
		if(results.hasErrors()) {
			return new ResponseEntity(results.getAllErrors().toString(), HttpStatus.BAD_REQUEST);
	       // return new ResponseEntity(new ApiErrors(errors), HttpStatus.BAD_REQUEST);
		}
	
		return new ResponseEntity<>(HttpStatus.OK);
	}
	public Boolean deleteUserById(Long id) {
		return crudOperationService.deleteUserById(id);
	}
	public Boolean deleteUserByName(String name) {
		return false;
	}
	public Person updateUser(Person user) {
		return null;
	}
	@GetMapping("users")
	public Iterable<Person> getUsers() {
		return crudOperationService.getUsers();
		
	}
	public Person getUserByName(String name) {
		return null;
	}
	public Person getUserById(Long id) {
		return null;
	}
}
