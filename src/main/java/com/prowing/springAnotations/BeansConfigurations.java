package com.prowing.springAnotations;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;

@Configuration
@ComponentScan(basePackages = "com.prowing.springAnotations")
public class BeansConfigurations {

	@Bean(name = "employee1")
	public Employee getEmployee() {
		
		Employee emp = new Employee(55, "Ram", "pune");
		
//		Employee emp = new Employee();
		
//		emp.setId(55);
//		emp.setName("Ram");
//		emp.setAddress("Pune");
		
		return emp;
	}
	
	@Bean(name = "employee2")
	public Employee getEmployee1() {
		
		Employee emp = new Employee(33, "Narayan", "Mumbai");
		
//		Employee emp = new Employee();
//		
//		emp.setId(55);
//		emp.setName("Ram");
//		emp.setAddress("Pune");

		return emp;
	}
	
	@Bean(name= "addr1")
	public Address getAddress() {
		
		return new Address(33,"Satara");
		
	}
	
	@Bean(name= "addr2")
	@Primary
	public Address getAddress1() {
		
		return new Address(44,"Karad");
		
	}
	
		
	
	
	
}
