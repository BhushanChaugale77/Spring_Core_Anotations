package com.prowing.XmlanAnotation;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;

@Controller
public class Bike {

	@Value(value = "99")
	private int id;
	@Value(value = "RE")
	private String name;
	@Value(value = "OffRoad")
	private String type;
	
	public Bike() {
		super();
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

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	@Override
	public String toString() {
		return "Bike [id=" + id + ", name=" + name + ", type=" + type + "]";
	}
	
	
	
}
