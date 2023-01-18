package com.SpringCore.annotaion;

import org.springframework.beans.factory.annotation.Value;

public class StudentWithSetterInjection {

	int id;
	String name;
	double perc;

	@Override
	public String toString() {
		return "StudentWithSetterInjection [id=" + id + ", name=" + name + ", perc=" + perc + "]";
	}

	public int getId() {
		return id;
	}

	@Value("145")
	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}
	@Value("Mohit")
	public void setName(String name) {
		this.name = name;
	}

	public double getPerc() {
		return perc;
	}
	@Value("85.21")
	public void setPerc(double perc) {
		this.perc = perc;
	}

}
