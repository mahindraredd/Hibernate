package com.test;

import org.springframework.beans.factory.support.DefaultListableBeanFactory;
import org.springframework.beans.factory.xml.XmlBeanDefinitionReader;

import com.comp.Flipkart;

public class TestApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 DefaultListableBeanFactory factory = new DefaultListableBeanFactory();
		 XmlBeanDefinitionReader reader=new XmlBeanDefinitionReader(factory);
		 reader.loadBeanDefinitions("Beans.xml");
		 Flipkart flipkart = (Flipkart) factory.getBean("target");
		 String result=flipkart.doShopping(new String[] {"tissot","nike"},new float[] {2300.0f,2000.0f});
		 System.out.println(result);
	}

}
