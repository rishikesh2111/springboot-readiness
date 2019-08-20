package com.learn.hibernate.HibernateDemo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.jdbc.DataSourceBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.data.jpa.repository.config.EnableJpaAuditing;

import javax.sql.DataSource;

@SpringBootApplication
@EnableJpaAuditing
public class HibernateDemoApplication {

	public static void main(String[] args) {
		SpringApplication.run(HibernateDemoApplication.class, args);
	}

/*	@Bean
	public DataSource getDataSource() {
		DataSourceBuilder dataSourceBuilder = DataSourceBuilder.create();
		// dataSourceBuilder.driverClassName("org.h2.Driver");
		dataSourceBuilder.url("jdbc:mysql://localhost:3306/notes_app?useSSL=false");
		dataSourceBuilder.username("root");
		dataSourceBuilder.password("passw0rd");
		return dataSourceBuilder.build();
	}*/
}
