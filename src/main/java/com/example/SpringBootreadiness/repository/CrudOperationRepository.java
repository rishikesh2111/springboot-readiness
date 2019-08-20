package com.example.SpringBootreadiness.repository;

import java.util.List;

import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.repository.CrudRepository;
import org.springframework.transaction.annotation.Transactional;

import com.example.SpringBootreadiness.model.Person;

public interface CrudOperationRepository extends CrudRepository<Person, Long> {
	
   public List<Person> findByFirstName(String temp);
   public List<Person> findByLastName(String name);
   @Transactional
   @Modifying
   public void deleteByFirstName(String firstName);

	
}
