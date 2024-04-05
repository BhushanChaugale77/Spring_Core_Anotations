package com.prowing.XmlanAnotation;

public class Engine {

	private int id;
	private String type;

	public Engine(int id, String type) {
		super();
		this.id = id;
		this.type = type;
	}

	public Engine() {
		super();
		// TODO Auto-generated constructor stub
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	@Override
	public String toString() {
		return "Engine [id=" + id + ", type=" + type + "]";
	}

}
