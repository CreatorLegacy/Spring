package com.SpringCore.annotaion;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Student {
	@Value("123")
	int id;
	@Value("Yugal")
	String name;
	@Value("85.25")
	double perc;

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

	public double getPerc() {
		return perc;
	}

	public void setPerc(double perc) {
		this.perc = perc;
	}

	@Override
	public String toString() {
		return "Student [id=" + id + ", name=" + name + ", perc=" + perc + "]";
	}
}