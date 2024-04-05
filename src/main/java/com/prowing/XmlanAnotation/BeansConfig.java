package com.prowing.XmlanAnotation;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;

@Configuration
@ComponentScan(basePackages ="com.prowing.XmlanAnotation")
public class BeansConfig {

	@Bean(name = "bus1")
	public Bus getBus1() {
		
		Bus bus = new Bus(77, "Volvo55", "Sleeper");
		
		return bus;
		}
	
	@Bean(name = "bus2")
	@Primary
	public Bus getBus2() {
		
		Bus bus = new Bus(55, "Mercidies88", "Sleeper_Ac");
		
		return bus;
	}
	 
}
