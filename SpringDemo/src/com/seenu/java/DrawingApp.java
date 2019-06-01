package com.seenu.java;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.core.io.FileSystemResource;

public class DrawingApp {

	public static void main(String[] args) {
		//Triangle triangle = new Triangle();
		//triangle.draw();
		//BeanFactory factory=new XmlBeanFactory(new FileSystemResource("applicationContext.xml"));
		ApplicationContext context=new ClassPathXmlApplicationContext("applicationContext.xml");
		Triangle triangle=(Triangle) context.getBean("triangle");
		//Triangle triangle=factory.getBean("triangle", Triangle.class);
		triangle.draw();

	}

}
