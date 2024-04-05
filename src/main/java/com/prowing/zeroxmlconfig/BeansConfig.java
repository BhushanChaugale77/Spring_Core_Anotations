package com.prowing.zeroxmlconfig;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
@Configuration
public class BeansConfig {
	
	@Bean
	public Car getCar() {
		
		Car car = new Car();
		
		car.setId(77);
		car.setName("Tata");
		car.setEngine(getEngine1());
		return car;
		
		 
	}
	
	@Bean
	public Engine getEngine1() {
		
		Engine engine = new Engine(77, "CombustionIgnition");
		return engine;
	}
	
	@Bean 
	public Engine getEngine2() {
		
		Engine engine = new Engine(55, "CompressionIgnition");
		return engine;
	}

}
