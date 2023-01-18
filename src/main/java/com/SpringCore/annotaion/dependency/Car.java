package com.SpringCore.annotaion.dependency;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Car {
	@Autowired
	Battery bt;
	
	
	// here autowiring happens by name
	
	void drive() {
		System.out.println("I am driving car");
	}

}
