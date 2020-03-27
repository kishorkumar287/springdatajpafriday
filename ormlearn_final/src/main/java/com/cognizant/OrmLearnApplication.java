package com.cognizant;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication
@ComponentScan(basePackages="com.cognizant")
@EntityScan("com.cognizant")
@EnableJpaRepositories("com.cognizant")
public class OrmLearnApplication {

	public static void main(String[] args) {
		SpringApplication.run(OrmLearnApplication.class, args);
	}
	


}
