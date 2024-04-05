package com.prowing.springAnotations;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestAnnotationConfig {

	public static void main(String[] args) {
		
//		ApplicationContext context = new ClassPathXmlApplicationContext("annotationconfig.xml");
	
		ApplicationContext context = new AnnotationConfigApplicationContext(BeansConfigurations.class);
		
		A a = context.getBean("a", A.class);
		System.out.println(a);
		
		A2 b = context.getBean("a2", A2.class);
		System.out.println(b);
		
//		Employee emp = context.getBean("employee", Employee.class);
//		System.out.println(emp);
		
		Employee emp1 = context.getBean("employee1", Employee.class);
		System.out.println(emp1);

		
		Employee emp2 = context.getBean("employee2", Employee.class);
		System.out.println(emp2);
		
		
		Student std = context.getBean("student", Student.class);
		System.out.println(std);
		
	}
	
}
