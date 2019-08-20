package com.example.SpringBootreadiness;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

import com.example.SpringBootreadiness.model.Person;
import com.example.SpringBootreadiness.repository.CrudOperationRepository;

@SpringBootApplication
@EnableJpaRepositories
public class SpringBootReadinessApplication {

	private static final Logger log = LoggerFactory.getLogger(SpringBootReadinessApplication.class);

	public static void main(String[] args) {
		SpringApplication.run(SpringBootReadinessApplication.class, args);
	}

	
	  @Bean public CommandLineRunner demo(CrudOperationRepository repository) {
	  return (args) -> { repository.save(new
	  Person("rishi","kumar","begusarai","male")); repository.save(new
	  Person("nidhi","sharma","katras","female")); repository.save(new
	  Person("rakesh","mangtani","pune","male")); repository.save(new
	  Person("abhishek","jangid","bavdhan","male"));
	  
	  log.info("User info with find by first nName: ");
	  repository.findByFirstName("rishi").forEach(user -> {
	  log.info(user.toString()); });
	  log.info("User info with find by last name: ");
	  repository.findByLastName("sharma").forEach(user -> {
	  log.info(user.toString()); }); log.info("All User ");
	  repository.findAll().forEach(user -> log.info(user.toString()));
	  log.info("User with id 3 deleted "); repository.deleteById(3L);
	  log.info("all user after deletion"); repository.findAll().forEach(user ->
	  log.info(user.toString()));
	  
	  log.info("Delete user by first name");
	  repository.deleteByFirstName("abhishek");
	  log.info("all user after deletion"); repository.findAll().forEach(user ->
	  log.info(user.toString()));
	  
	  
	  }; }
	  
	 
}
