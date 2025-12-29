package com.project1.spring_framework;



import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class HelloWorldConfiguration {
	
@Bean
	public String name() {
		return "Abhay";
	}
	
@Bean
public int age() {
	return 30;
}
@Bean
public Person person() {
	var personn =new Person("Abhay",30);
	return personn;

}}
 