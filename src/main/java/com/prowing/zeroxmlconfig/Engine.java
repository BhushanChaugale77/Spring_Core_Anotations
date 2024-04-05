package com.prowing.zeroxmlconfig;

public class Engine {

	private int id;
	private String type;

	public Engine() {
		super();
	}

	 
	public Engine(int id, String type) {
		super();
		this.id = id;
		this.type = type;
	}
	
	@Override
	public String toString() {
		return "Engine [id=" + id + ", type=" + type + "]";
	}

}
