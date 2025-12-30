package com.project1.spring_framework;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class HelloWorldConfiguration {

	@Bean
	public String name() {
		return "Vishal";
	}

	@Bean
	public int age() {
		return 25;
	}
	@Bean
	public Person person() {
		return new Person("Vishal", 25, new Address("Tulsi ", "Ward 20"));
	}

	@Bean(name = "address")
	public Address address() {
return new Address("Tulsi ", "Ward 20");

	}
	@Bean(name = "address2")
	public Address address2() {

		return new Address("Tulsi ", "Ward 20");

	}
	@Bean
	public Person person2MethodCall() {//method call approach
		return new Person(name(), age(), address());
	}

	@Bean
	public Person person3Parameter(String name, int age, Address address) {//parameter approach

		return new Person(name, age, address);
	}


}
