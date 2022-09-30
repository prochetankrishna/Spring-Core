package com.hertzbit.springdemo;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;

@Configuration
@ComponentScan("com.hertzbit.springdemo")
public class SpringDemoConfig {

//	@Bean
//	public MathsDepartment mathsDepartment() {
//		return new MathsDepartment();
//	}
//	
//	@Bean
//	public PhysicsDepartment physicsDepartment() {
//		return new PhysicsDepartment();
//	}
	
	@Bean
	@Scope("prototype")
	public DatabaseConnection databaseConnection() {
		return new DatabaseConnection();
	}
}
