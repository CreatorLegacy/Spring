package com.SpringCore.annotaion.dependency;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.SpringCore.annotaion.Vehicle;

public class DAOForDependency {
	public static void main(String[] args) {

		ApplicationContext sp1 = new ClassPathXmlApplicationContext("confInterface.xml");
		Vehicle v = (Vehicle) sp1.getBean(Car.class);
		v.drive();
	}
}
