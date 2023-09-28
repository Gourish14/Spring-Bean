package com.cozentus.SpringBean.bean1;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
	
	public static void main(String[] args) {
		
		ApplicationContext ac = new ClassPathXmlApplicationContext("com/cozentus/SpringBean/bean1/beanfile.xml");
		Student s = (Student) ac.getBean("collection");
		System.out.println(s);
	}
}
