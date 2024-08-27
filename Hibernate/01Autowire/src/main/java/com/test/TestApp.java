package com.test;

import java.io.IOException;

import org.springframework.beans.factory.support.DefaultListableBeanFactory;
import org.springframework.beans.factory.xml.XmlBeanDefinitionReader;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.ClassPathBeanDefinitionScanner;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.comp.Flipkart;

public class TestApp {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
//		 DefaultListableBeanFactory factory = new DefaultListableBeanFactory();
//		 XmlBeanDefinitionReader reader=new XmlBeanDefinitionReader(factory);
//		 reader.loadBeanDefinitions("Beans.xml");
		ClassPathXmlApplicationContext factory=new ClassPathXmlApplicationContext("Beans.xml");
		 System.in.read();
		 Flipkart result = (Flipkart) factory.getBean("flipkart");
//		 String result=flipkart.doShopping(new String[] {"tissot","nike"},new float[] {2300.0f,2000.0f});
//		 System.out.println(result);
	}

}
