package com.prowing.XmlanAnotation;


import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestAnotationXmlCombi {

	public static void main(String[] args) {
		
		ApplicationContext context = new ClassPathXmlApplicationContext("annotationconfig.xml");
//		ApplicationContext context = new AnnotationConfigApplicationContext(BeansConfig.class);
		
		Car car = context.getBean(Car.class);
		System.out.println(car);
		
		Bike bike = context.getBean("bike", Bike.class);
		System.out.println(bike);
		
		Bus bus1 = context.getBean("bus1", Bus.class);
		System.out.println(bus1);
		
		Bus bus2 = context.getBean("bus2", Bus.class);
		System.out.println(bus2);
		
		
		
	}
	
}
