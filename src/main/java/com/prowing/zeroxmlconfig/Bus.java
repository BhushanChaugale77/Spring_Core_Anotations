package com.prowing.zeroxmlconfig;

public class Bus {

	private int id;
	private String name;
	private String type;
	
	public Bus() {
		super();
	}

	public Bus(int id, String name, String type) {
		super();
		this.id = id;
		this.name = name;
		this.type = type;
	}
	
	 
	@Override
	public String toString() {
		return "Bus [id=" + id + ", name=" + name + ", type=" + type + "]";
	}
}
