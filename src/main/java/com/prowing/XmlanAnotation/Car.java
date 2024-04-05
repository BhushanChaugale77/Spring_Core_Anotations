package com.prowing.XmlanAnotation;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Car {

	private int id;
	private String name;
	@Autowired
	private Engine engine;

	public Car() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Car(int id, String name, Engine engine) {
		super();
		this.id = id;
		this.name = name;
		this.engine = engine;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Engine getEngine() {
		return engine;
	}

	public void setEngine(Engine engine) {
		this.engine = engine;
	}

	@Override
	public String toString() {
		return "Car [id=" + id + ", name=" + name + ", engine=" + engine + "]";
	}

}
