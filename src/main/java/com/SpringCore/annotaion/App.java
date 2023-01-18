package com.SpringCore.annotaion;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App {
	public static void main(String[] args) {

		ApplicationContext sp1 = new ClassPathXmlApplicationContext("conf.xml");
		Student s1 = (Student) sp1.getBean("student");
		System.out.println(s1);

	}
}
