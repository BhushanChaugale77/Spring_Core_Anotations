package com.prowing.springAnotations;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Repository;

@Repository
public class A2 {

	@Value(value="3000")
	private int b;

	public A2() {
		super();
 	}

	public int getA2() {
		return b;
	}

	public void setA2(int b) {
		this.b = b;
	}

	@Override
	public String toString() {
		return "A2 [b=" + b + "]";
	}
	
	
}
