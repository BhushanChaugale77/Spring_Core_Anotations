package com.prowing.zeroxmlconfig;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class TestZeroXmlConfig {

	public static void main(String[] args) {
		
		ApplicationContext context = new AnnotationConfigApplicationContext(BeansConfig.class);
		
		Car car = context.getBean(Car.class);
		
		System.out.println(car);
		
	}
	
	
}
