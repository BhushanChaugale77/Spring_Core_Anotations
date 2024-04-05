package com.prowing.zeroxmlconfig;

public class Car {

	private int id;
	private String name;
	private Engine engine;

	public Car() {
		super();
	}

	public void setId(int id) {
		this.id = id;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void setEngine(Engine engine) {
		this.engine = engine;
	}

	@Override
	public String toString() {
		return "Car [id=" + id + ", name=" + name + ", engine=" + engine + "]";
	}

}
